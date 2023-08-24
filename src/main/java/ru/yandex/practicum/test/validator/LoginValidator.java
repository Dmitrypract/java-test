package ru.yandex.practicum.test.validator;

import ru.yandex.practicum.test.annotations.CorrectLogin;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator implements ConstraintValidator<CorrectLogin, String> {
    @Override
    public boolean isValid(String login, ConstraintValidatorContext constraintValidatorContext) {
        return !(login.contains(" ") || login.isBlank());
    }
}