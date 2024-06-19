package com.example.tomcat_spring_demo.exception;

public class ApplicationException extends RuntimeException{
    public ApplicationException(String message) {
        super(message);
    }
}
