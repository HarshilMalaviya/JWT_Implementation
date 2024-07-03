package com.ex.JWT.Anotation;

import com.ex.JWT.Entity.User;
import com.ex.JWT.Repository.UserRepo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername,String> {
    @Autowired
    private UserRepo userRepo;


    public void initialize(UniqueUsername constraintAnnotation) {
    }

    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        return this.userRepo.existsByUsername(username);
    }
}
