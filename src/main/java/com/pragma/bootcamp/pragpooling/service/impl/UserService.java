package com.pragma.bootcamp.pragpooling.service.impl;

import com.pragma.bootcamp.pragpooling.model.User;
import com.pragma.bootcamp.pragpooling.persistence.IUserPersistence;
import com.pragma.bootcamp.pragpooling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserPersistence userPersistence;

    @Override
    public User createUser(User user) {
        return userPersistence.createUser(user);
    }

}
