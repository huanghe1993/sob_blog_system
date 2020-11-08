package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Categories {

    private String id;
    private String name;
    private String pinyin;
    private String description;
    private long order;
    private String status;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
