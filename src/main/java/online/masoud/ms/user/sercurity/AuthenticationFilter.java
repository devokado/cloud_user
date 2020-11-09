package online.masoud.ms.user.sercurity;

import com.fasterxml.jackson.databind.ObjectMapper;
import online.masoud.ms.user.ui.models.LoginRequestModel;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException
    {
        try {
            LoginRequestModel credential = new ObjectMapper()
                    .readValue(request.getInputStream(), LoginRequestModel.class);

            return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(
                    credential.getEmail(), credential.getPassword(), new ArrayList<>()
                )
            );
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
