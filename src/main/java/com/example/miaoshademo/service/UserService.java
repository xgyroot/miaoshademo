package com.example.miaoshademo.service;

import com.example.miaoshademo.error.BusinessException;
import com.example.miaoshademo.service.model.UserModel;

public interface UserService {
    //根据id获取用户对象
    UserModel getUserById(Integer id);

    //注册
    void register(UserModel userModel) throws BusinessException;
}
