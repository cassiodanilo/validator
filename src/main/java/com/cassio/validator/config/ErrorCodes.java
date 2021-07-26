package com.cassio.validator.config;

public enum ErrorCodes {
    VALIDATION_FAILED("Validation Failed");

    private final String message;

    ErrorCodes(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
