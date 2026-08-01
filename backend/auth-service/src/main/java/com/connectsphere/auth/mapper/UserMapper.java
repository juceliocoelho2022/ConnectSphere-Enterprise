package com.connectsphere.auth.mapper;

import com.connectsphere.auth.dto.request.RegisterRequest;
import com.connectsphere.auth.domain.entity.User;

public class UserMapper {

    private UserMapper() {
    }

    public static User toEntity(RegisterRequest request) {

        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

    }

}