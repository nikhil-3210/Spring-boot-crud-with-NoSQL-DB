package com.nikhiljadav.mongodb_redis_cache.exception.customExceptions;

public class InvalidPayload extends Exception{

    private String exceptionMessage;
    private int statusCode;

    public InvalidPayload() {
        super();
    }

    public InvalidPayload(String exceptionMessage, int statusCode) {
        this.exceptionMessage = exceptionMessage;
        this.statusCode = statusCode;
    }
}
