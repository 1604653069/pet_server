package com.hong.pet.service;

import com.hong.pet.model.User;

import java.util.List;

public interface UserService {
    /**用户登录*/
    User login(User user);
    /**获取所有用户*/
    List<User> findAllUsers();
}
