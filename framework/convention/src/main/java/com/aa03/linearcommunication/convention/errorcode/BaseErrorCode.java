package com.aa03.linearcommunication.convention.errorcode;

/**
 * 基础错误码定义
 * @author xzj
 */
public enum BaseErrorCode implements IErrorCode {

    ;

    private final String code;
    private final String message;

    BaseErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
