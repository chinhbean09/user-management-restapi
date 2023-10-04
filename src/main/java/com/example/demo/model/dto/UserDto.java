package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Cấu trúc đại điện cho response,tạo thêm class UserMapper để khởi tạo hàm UserDTO
public class UserDto {
    private int id;

    private String name;

    private String email;

    private String phone;

    private String avatar;
}
