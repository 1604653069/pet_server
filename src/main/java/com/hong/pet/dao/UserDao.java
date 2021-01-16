package com.hong.pet.dao;

import com.hong.pet.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /**用户登录*/
     User login(User user);
     /**获取所有用户*/
     List<User> findAllUsers();
}
