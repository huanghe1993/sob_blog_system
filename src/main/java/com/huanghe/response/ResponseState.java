package com.huanghe.response;

import lombok.Getter;
import lombok.Setter;


/**
 * @author River
 * @date 2020/11/8 11:04
 * @description
 */
@Getter
public enum ResponseState {

    /**
     * 操作成功
     */
    SUCCESS(true, 2000, "操作成功"),

    /**
     * 操作失败
     */
    FAILED(false, 4000, "操作失败"),

    /**
     * 获取资源失败
     */
    GET_RESOURCE_FAILED(false, 4001, "获取资源失败"),

    /**
     * 登录失败
     */
    LOGIN_FAILED(false, 4001, "登录失败");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 是否成功
     */
    private boolean success;

    ResponseState(boolean success, int code, String message) {
        this.message = message;
        this.code = code;
        this.success = success;
    }


}
