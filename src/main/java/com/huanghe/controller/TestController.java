package com.huanghe.controller;

import com.huanghe.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author River
 * @date 2020/11/6 20:14
 * @description
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping(value = "/hello-world")
    public ResponseResult helloWorld() {
        log.info("Log hello world Test");
        return ResponseResult.success("hello world blog");
    }

    @GetMapping(value = "/test-response")
    public ResponseResult testResponse() {
        log.info("test-response");
        return ResponseResult.success().setData("hello world");
    }
}
