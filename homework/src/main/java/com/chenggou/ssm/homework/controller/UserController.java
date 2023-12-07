package com.chenggou.ssm.homework.controller;

import com.chenggou.ssm.homework.dao.UserDao;
import com.chenggou.ssm.homework.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;
    @RequestMapping("/login")
    public void login(String username, String password){
        Users users = userDao.login(username, password);

    }
}
