package com.pragma.bootcamp.pragpooling.service.impl.factory;

import com.pragma.bootcamp.pragpooling.dto.UserDto;
import com.pragma.bootcamp.pragpooling.model.User;

public class UserDataFactoryTest {

    public static User getUser(){
        User user = new User();
        user.setName("Angi");
        user.setLastName("Jimenez");
        user.setPhone(3116559530L);
        user.setAddress("Cra 55a #20");
        user.setEmail("angi@gmail.com");
        user.setPassword("abcd12345");

        return user;
    }

    public static  UserDto getUserDto(){
        UserDto userDto = new UserDto();
        userDto.setName("Angi");
        userDto.setLastName("Jimenez");
        userDto.setPhone(3116559530L);
        userDto.setAddress("Cra 55a #20");
        userDto.setEmail("angi@gmail.com");
        userDto.setPassword("abcd12345");

        return userDto;
    }

}
