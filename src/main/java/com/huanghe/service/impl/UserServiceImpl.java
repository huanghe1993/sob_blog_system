package com.huanghe.service.impl;

import com.huanghe.dao.UserMapper;
import com.huanghe.pojo.User;
import com.huanghe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author River
 * @date 2020/11/8 10:21
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

}
