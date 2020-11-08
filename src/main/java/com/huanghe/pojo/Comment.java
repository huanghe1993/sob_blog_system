package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Comment {

    private String id;
    private String parentContent;
    private String articleId;
    private String content;
    private String userId;
    private String userAvatar;
    private String userName;
    private String state;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
