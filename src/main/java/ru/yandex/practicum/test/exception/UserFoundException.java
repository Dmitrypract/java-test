package ru.yandex.practicum.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FOUND)
public class UserFoundException extends RuntimeException {
    public UserFoundException(String message) {
        super(message);
    }
}