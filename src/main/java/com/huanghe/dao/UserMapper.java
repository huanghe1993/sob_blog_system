package com.huanghe.dao;

import com.huanghe.pojo.User;

import java.util.List;

/**
 * @author River
 * @date 2020/11/8 10:17
 * @description
 */
public interface UserMapper {

    /**
     * 获取所有的用户
     *
     * @return 所有的用户
     */
    List<User> findAllUser();
}
