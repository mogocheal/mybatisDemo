package com.ming.controller;

import com.ming.model.T_user;
import com.ming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoai on 2018/5/23.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public T_user test() {
        return userService.findByName("1");
    }

    @GetMapping("test2")
    public T_user test2() {
        return userService.findByName2("1");
    }
}
