package com.pragma.bootcamp.pragpooling.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDto {

    private String name;
    private String lastName;
    private long phone;
    private String address;
    private String email;
    private String password;

}
