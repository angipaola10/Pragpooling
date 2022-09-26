package com.pragma.bootcamp.pragpooling.controller;

import com.pragma.bootcamp.pragpooling.dto.UserDto;
import com.pragma.bootcamp.pragpooling.mapper.IUserMapper;
import com.pragma.bootcamp.pragpooling.model.User;
import com.pragma.bootcamp.pragpooling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("createUser")
    public ResponseEntity<String> createUser(@RequestBody UserDto newUserDto){
        userService.createUser(newUserDto);
        return new ResponseEntity<>("User " + newUserDto.getName() + " created successfully!", HttpStatus.CREATED);
    }

}
