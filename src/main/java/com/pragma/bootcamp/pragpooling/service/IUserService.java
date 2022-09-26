package com.pragma.bootcamp.pragpooling.service;

import com.pragma.bootcamp.pragpooling.dto.UserDto;
import com.pragma.bootcamp.pragpooling.model.User;

public interface IUserService {
    void createUser(UserDto userDto);

}
