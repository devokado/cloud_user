package online.masoud.ms.user.services;

import online.masoud.ms.user.shared.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
