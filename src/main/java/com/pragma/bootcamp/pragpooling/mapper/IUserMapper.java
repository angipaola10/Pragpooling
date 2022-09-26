package com.pragma.bootcamp.pragpooling.mapper;

import com.pragma.bootcamp.pragpooling.dto.UserDto;
import com.pragma.bootcamp.pragpooling.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    User userDtoToUser(UserDto userDto);

}

