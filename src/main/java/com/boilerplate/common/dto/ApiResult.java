package com.boilerplate.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> {
    private boolean success;
    private T data;
    private String message;
    private String errorCode;

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(true, data, null, null);
    }

    public static <T> ApiResult<T> success(T data, String message) {
        return new ApiResult<>(true, data, message, null);
    }

    public static <T> ApiResult<T> error(String message, String errorCode) {
        return new ApiResult<>(false, null, message, errorCode);
    }
}