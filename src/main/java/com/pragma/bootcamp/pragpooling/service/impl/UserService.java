package com.pragma.bootcamp.pragpooling.service.impl;

import com.pragma.bootcamp.pragpooling.dto.UserDto;
import com.pragma.bootcamp.pragpooling.mapper.IUserMapper;
import com.pragma.bootcamp.pragpooling.model.User;
import com.pragma.bootcamp.pragpooling.persistence.IUserPersistence;
import com.pragma.bootcamp.pragpooling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserPersistence userPersistence;

    @Autowired
    IUserMapper userMapper;

    @Override
    public void createUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userPersistence.createUser(user);
    }

}
