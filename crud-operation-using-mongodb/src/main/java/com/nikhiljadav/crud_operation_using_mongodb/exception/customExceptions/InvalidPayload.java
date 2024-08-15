package com.nikhiljadav.crud_operation_using_mongodb.exception.customExceptions;

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
