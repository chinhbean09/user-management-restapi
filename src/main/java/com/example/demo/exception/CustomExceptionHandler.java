package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice //có thể trả về 1 view thay vì chỉ trả về 1 cấu trúc JSON
//mỗi exception sẽ có 1 method handler riêng
public class CustomExceptionHandler{
    @ExceptionHandler(NotFoundException.class) //@ExceptionHandler dùng chỉ rõ method này sử lý exception nào
    @ResponseStatus(HttpStatus.NOT_FOUND)//@ResponseStatus là 1 cách dùng để định nghĩa HttpStatus trả về cho người dùng

    public ErrorResponse handlerNotFoundException(NotFoundException ex, WebRequest req) {
        // Log err

        return new ErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    }
    //sau khi ta custom xong exception, ta sẽ chỉnh sửa lại hàm trong ServiceImp

    @ExceptionHandler(DuplicateRecordException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handlerDuplicateRecordException(DuplicateRecordException ex, WebRequest req) {
        // Log err

        return new ErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    // Xử lý tất cả các exception chưa được khai báo
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handlerException(Exception ex, WebRequest req) {
        // Log err

        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }
}
