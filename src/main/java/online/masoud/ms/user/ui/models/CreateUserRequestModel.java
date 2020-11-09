package online.masoud.ms.user.ui.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

    @NotNull(message = "First Name can't be blank")
    @Size(min = 2, message = "First Name must not be less than 2 characters")
    private String firstName;

    @NotNull(message = "Last Name can't be blank")
    @Size(min = 2, message = "Last Name must not be less than 2 characters")
    private String lastName;

    @NotNull(message = "email can't be blank")
    @Email
    private String email;

    @NotNull(message = "password can't be blank")
    @Size(min = 6, message = "First Name must not be less than 6 characters")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
