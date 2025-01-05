package com.aa03.linearcommunication.convention.result;

import lombok.Data;

import java.io.Serializable;

/**
 * 全局返回对象
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 正确返回码
     */
    public final static String SUCCESS_CODE = "0";

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回消息
     */
    private String message;

    private T data;
}
