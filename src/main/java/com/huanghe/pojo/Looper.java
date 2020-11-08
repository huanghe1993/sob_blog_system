package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Looper {

    private String id;
    private String title;
    private long order;
    private String state;
    private String targetUrl;
    private String imageUrl;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
