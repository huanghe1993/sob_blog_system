package com.huanghe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author River
 * @date 2020/11/6 20:14
 * @description
 */
@RestController
public class TestController {

    @GetMapping(value = "/hello-world")
    public String helloWorld() {
        System.out.println("hello world");
        return "hello world blog";
    }
}
