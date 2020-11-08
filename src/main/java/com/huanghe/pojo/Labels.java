package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Labels {

    private String id;
    private String name;
    private long count;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
