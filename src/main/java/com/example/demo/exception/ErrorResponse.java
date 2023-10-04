package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//giữa server backend và front end nên thống nhất 1 cấu trúc lỗi trả về chung để dễ xử lý, và tái sử dụng code
//đây là class đại điện cho cấu trúc này
public class ErrorResponse {
    //properties
    private HttpStatus status; //status của code
    private String message; //message lỗi trả về
}
//tiếp theo ta sử tự định nghĩa exception => tạo class NotFoundException, DuplicateRecordException, mỗi
//exception thì ứng với 1 class
