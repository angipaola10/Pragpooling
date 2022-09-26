package com.pragma.bootcamp.pragpooling.service.impl;

import com.pragma.bootcamp.pragpooling.dto.UserDto;
import com.pragma.bootcamp.pragpooling.exception.PragpoolingException;
import com.pragma.bootcamp.pragpooling.mapper.IUserMapper;
import com.pragma.bootcamp.pragpooling.model.User;
import com.pragma.bootcamp.pragpooling.persistence.IUserPersistence;
import com.pragma.bootcamp.pragpooling.persistence.repository.IUserRepository;
import com.pragma.bootcamp.pragpooling.service.impl.factory.UserDataFactoryTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.validation.ConstraintViolationException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    IUserPersistence userPersistence;

    @Mock
    IUserRepository userRepository;

    @Mock
    IUserMapper userMapper;

    @Test
    void mustCreateAUser() {
        UserDto userDto = UserDataFactoryTest.getUserDto();
        User expectedUser = UserDataFactoryTest.getUser();

        when(userMapper.userDtoToUser(any())).thenReturn(expectedUser);

        userService.createUser(userDto);

        verify(userPersistence).createUser(any(User.class));
    }

}