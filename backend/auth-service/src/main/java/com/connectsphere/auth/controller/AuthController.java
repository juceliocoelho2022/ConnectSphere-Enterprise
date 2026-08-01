package com.connectsphere.auth.controller;

import com.connectsphere.auth.dto.request.LoginRequest;
import com.connectsphere.auth.dto.request.RegisterRequest;
import com.connectsphere.auth.dto.response.ApiResponse;
import com.connectsphere.auth.dto.response.RegisterResponse;
import com.connectsphere.auth.service.AuthService;
import com.connectsphere.auth.util.AppConstants;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(AppConstants.AUTH)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(AppConstants.REGISTER)
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<RegisterResponse> register(
            @Valid @RequestBody RegisterRequest request) {

        RegisterResponse response = authService.register(request);

        return ApiResponse.<RegisterResponse>builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.CREATED.value())
                .message("User successfully registered.")
                .data(response)
                .build();
    }
    @PostMapping(AppConstants.LOGIN)
    public ResponseEntity<?> login(
            @Valid @RequestBody LoginRequest request) {

        return ResponseEntity.ok(authService.login(request));

    }
}