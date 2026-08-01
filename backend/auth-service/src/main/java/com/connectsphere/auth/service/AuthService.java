package com.connectsphere.auth.service;

import com.connectsphere.auth.dto.request.LoginRequest;
import com.connectsphere.auth.dto.request.RegisterRequest;
import com.connectsphere.auth.dto.response.LoginResponse;
import com.connectsphere.auth.dto.response.RegisterResponse;
import com.connectsphere.auth.entity.User;
import com.connectsphere.auth.exception.EmailAlreadyExistsException;
import com.connectsphere.auth.mapper.UserMapper;
import com.connectsphere.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public RegisterResponse register(RegisterRequest request) {

        if (repository.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException(request.getEmail());
        }

        User user = UserMapper.toEntity(request);

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        repository.save(user);

        return RegisterResponse.builder()
                .uuid(user.getUuid())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }
    public LoginResponse login(LoginRequest request) {

        throw new UnsupportedOperationException("Not implemented yet");

    }
}