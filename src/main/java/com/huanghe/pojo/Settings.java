package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Settings {

    private String id;
    private String key;
    private String value;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
