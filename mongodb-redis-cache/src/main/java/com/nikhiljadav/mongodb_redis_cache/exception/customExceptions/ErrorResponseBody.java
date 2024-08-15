package com.nikhiljadav.mongodb_redis_cache.exception.customExceptions;

public class ErrorResponseBody {

    private String message;
    private int statusCode;

    public ErrorResponseBody() {
    }

    public ErrorResponseBody(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ErrorResponseBody setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
