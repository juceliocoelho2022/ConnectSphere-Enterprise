package com.connectsphere.auth.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ApiResponse<T> {

    private LocalDateTime timestamp;

    private Integer status;

    private String message;

    private T data;

}