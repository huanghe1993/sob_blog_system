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
public class Friends {

    private String id;
    private String name;
    private String logo;
    private String url;
    private long order;
    private String state;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
