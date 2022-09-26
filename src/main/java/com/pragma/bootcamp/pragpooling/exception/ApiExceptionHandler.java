package com.pragma.bootcamp.pragpooling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.time.ZonedDateTime;
import java.util.stream.Collectors;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ConstraintViolationException.class})
    public ResponseEntity<Object> handleApiRequestException(ConstraintViolationException e){

        String message = e.getConstraintViolations()
                .stream()
                .map(constraintViolation -> constraintViolation.getMessageTemplate())
                .collect(Collectors.joining(", "));

        PragpoolingException apiException = new PragpoolingException(
                message,
                HttpStatus.NOT_ACCEPTABLE,
                ZonedDateTime.now());
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }
}
