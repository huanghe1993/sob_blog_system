package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Article {

    private String id;
    private String title;
    private String userId;
    private String userAvatar;
    private String userName;
    private String categoryId;
    private String content;
    private String type;
    private String state;
    private String summary;
    private String labels;
    private long viewCount;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
