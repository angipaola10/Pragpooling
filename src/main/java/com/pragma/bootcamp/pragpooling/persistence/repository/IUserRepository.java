package com.pragma.bootcamp.pragpooling.persistence.repository;

import com.pragma.bootcamp.pragpooling.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IUserRepository extends JpaRepository<User, Integer> {

}
