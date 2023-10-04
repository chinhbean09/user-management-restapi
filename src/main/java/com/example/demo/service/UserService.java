package com.example.demo.service;

import com.example.demo.model.dto.UserDto;
import com.example.demo.model.request.CreateUserReq;
import com.example.demo.model.request.UpdateUserReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //đánh dấu annotation
//sau đó ta tạo UserServiceImp để implement interface này, như vậy lúc sau ở UserController khi inject 1
//obj UserService SpringBoot sẽ quét trong context là tìm thấy UserServiceImp và inject vào
public interface UserService {
    //Trong interface UserService khai báo danh sách có kiểu trả về là List<USer>, và @Override lại method này
    //trong userServiceImp.
    public List<UserDto> getListUser();

    //Trong interface UserService định nghĩa method getUserById có kiểu trả về là UserDto và param là id của user cần tìm
    //@Override lại method này trong userServiceimp
    public UserDto getUserById(int id);

    public UserDto createUser(CreateUserReq req);

    public UserDto updateUser(UpdateUserReq req, int id);

    public boolean deleteUser(int id);
    //viết hàm đọc dữ liệu trong service theo keyword trả vè list Object Dto
    public List<UserDto> searchUser(String keyword);
}
