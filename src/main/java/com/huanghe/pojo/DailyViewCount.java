package com.huanghe.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DailyViewCount {

    private String id;
    private long viewCount;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;

}
