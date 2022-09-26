package com.pragma.bootcamp.pragpooling.persistence.impl;

import com.pragma.bootcamp.pragpooling.model.User;
import com.pragma.bootcamp.pragpooling.persistence.IUserPersistence;
import com.pragma.bootcamp.pragpooling.persistence.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository implements IUserPersistence {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    IUserRepository userRepository;

    @Override
    public User createUser(User user) {
        return (User) userRepository.save(user);
    }
}
