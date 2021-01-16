package com.hong.pet.service.impl;

import com.hong.pet.dao.UserDao;
import com.hong.pet.model.User;
import com.hong.pet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}
