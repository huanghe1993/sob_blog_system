package com.huanghe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author River
 * @date 2020/11/1 19:58
 * @description 启动类
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.huanghe.dao"})
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
