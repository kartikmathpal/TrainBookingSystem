package com.kartik.exceptions;

public class InvalidUserCredentialsException extends Exception{

    public InvalidUserCredentialsException() {
    }

    public InvalidUserCredentialsException(String message) {
        super(message);
    }
}
