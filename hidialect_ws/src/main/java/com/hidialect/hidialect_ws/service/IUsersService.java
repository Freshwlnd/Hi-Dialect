package com.hidialect.hidialect_ws.service;

import com.hidialect.hidialect_ws.entity.Users;

public interface IUsersService {
    void signin(Users user);
    void edit(Users user);
    Users pwdLogin(String userNo, String password);
    Users getByuserNo(String userNo);
    void changePwd(String userNo,String password);
    Users signinStatus(String phone);
}