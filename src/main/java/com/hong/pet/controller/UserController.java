package com.hong.pet.controller;

import com.hong.pet.model.User;
import com.hong.pet.response.Response;
import com.hong.pet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 用户登录请求
     * @param user 用户登录请求参数
     * @return 用户信息
     */
    @RequestMapping(value = "/api/userlogin",method = RequestMethod.POST)
    public Response userLogin(@RequestBody User user){
        if(user.getUsername()==null||user.getPassword()==null)
            return new Response(-1,"账号或密码不能为空",null);
        User loginUser = userService.login(user);
        if(loginUser!=null){
            Map<String,User> loginResultMap = new HashMap<>();
            loginResultMap.put("userInfo",loginUser);
            return new Response(200,"登录成功",loginResultMap);
        }else{
            return new Response(-1,"登录用户不存在！",null);
        }
    }

}
