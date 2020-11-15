package com.huanghe.controller.user;

import com.huanghe.pojo.User;
import com.huanghe.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @author River
 * @date 2020/11/8 19:53
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserApi {

    /**
     * 初始化管理员账号-init-admin
     *
     * @return ResponseResult
     */
    @PostMapping("/admin_account")
    public ResponseResult initManagerAccount(@RequestBody User user) {
        log.info("user name ==>" + user.getUserName());
        log.info("password ==>" + user.getPassword());
        log.info("email ==>" + user.getEmail());
        return ResponseResult.success();
    }

    /**
     * 注册账号-init-admin
     *
     * @return ResponseResult
     */
    @PostMapping("/register")
    public ResponseResult register(@RequestBody User user) {
        return null;
    }

    /**
     * 登录账号
     *
     * @param captcha 验证码
     * @param user    用户信息
     * @return ResponseResult
     */
    @PostMapping("/login/{captcha}")
    public ResponseResult login(@PathVariable(value = "captcha") String captcha, @RequestBody User user) {
        return null;
    }

    /**
     * 获取图灵验证码
     *
     * @return 验证码
     */
    @GetMapping("/captcha")
    public ResponseResult getCaptcha() {
        return null;
    }

    /**
     * 发送验证码
     *
     * @return 发送验证码
     */
    @GetMapping("/verify_code")
    public ResponseResult sendVerifyCode(@RequestParam("email") String emailAddress) {
        log.info("email ==> " + emailAddress);
        return null;
    }

    /**
     * 修改密码password
     *
     * @param user 用户
     * @return ResponseResult
     */
    @PutMapping("/password")
    public ResponseResult updatePassword(@RequestBody User user) {
        return null;
    }

    /**
     * 获取用户信息
     *
     * @return ResponseResult
     */
    @GetMapping("/{userId}")
    public ResponseResult getUserInfo(@PathVariable("userId") String userId) {
        return null;
    }

    /**
     * 更新用户信息
     *
     * @return ResponseResult
     */
    @PutMapping
    public ResponseResult updateUserInfo(@RequestBody User user) {
        return null;
    }



}
