package com.example.demo.exception;

public class NotFoundException extends RuntimeException {
    //tùy vào nhu cầu thì ta tự định nghĩa sang exception cần thiết
    //có exception rồi thì ta định nghĩa exception handler
    public NotFoundException(String message) {
        super(message);
    }
}
