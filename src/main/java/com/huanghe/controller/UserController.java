package com.huanghe.controller;

import com.huanghe.pojo.User;
import com.huanghe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author River
 * @date 2020/11/8 10:20
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findAllProduct() {
        return userService.findAllUser();
    }

}
