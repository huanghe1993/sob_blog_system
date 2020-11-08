package com.huanghe.controller;

import com.huanghe.response.ResponseResult;
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
    public ResponseResult helloWorld() {
        System.out.println("hello world");
        return ResponseResult.success("hello world blog");
    }

    @GetMapping(value = "/test-response")
    public ResponseResult testResponse() {
        System.out.println("hello world");
        return ResponseResult.success().setData("hello world");
    }
}
