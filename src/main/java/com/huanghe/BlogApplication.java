package com.huanghe;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author River
 * @date 2020/11/1 19:58
 * @description 启动类
 */
@SpringBootApplication
@Slf4j
@MapperScan(basePackages = {"com.huanghe.dao"})
public class BlogApplication {
    public static void main(String[] args) {
        log.info("开始启动率");
        SpringApplication.run(BlogApplication.class, args);
    }

}
