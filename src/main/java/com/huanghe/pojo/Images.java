package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Images {

    private String id;
    private String userId;
    private String url;
    private String state;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
