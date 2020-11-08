package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author huanghe
 */
@Getter
@Setter
@ToString
public class User {

    private String id;
    private String userName;
    private String password;
    private String roles;
    private String avatar;
    private String email;
    private String sign;
    private String state;
    private String regIp;
    private String loginIp;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
