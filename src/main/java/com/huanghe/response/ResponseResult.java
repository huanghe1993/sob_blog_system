package com.huanghe.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author River
 * @date 2020/11/8 10:58
 * @description
 */
@Getter
@Setter
public class ResponseResult {

    /**
     * 返回信息
     */
    private String message;
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回数据
     */
    private Object data;

    public ResponseResult(ResponseState responseState) {
        this.message = responseState.getMessage();
        this.success = responseState.isSuccess();
        this.code = responseState.getCode();
    }

    public static ResponseResult success() {
        return new ResponseResult(ResponseState.SUCCESS);
    }

    public static ResponseResult success(String message) {
        ResponseResult result = new ResponseResult(ResponseState.SUCCESS);
        result.setMessage(message);
        return result;
    }

    public static ResponseResult failed() {
        return new ResponseResult(ResponseState.FAILED);
    }

    public static ResponseResult failed(String message) {
        ResponseResult result = new ResponseResult(ResponseState.FAILED);
        result.setMessage(message);
        return result;
    }

    public ResponseResult setData(Object data) {
        this.data = data;
        return this;
    }

}
