package com.tonybrooks.sharpmq.common.exception;

public enum SharpMqExceptionType {
    ILLEGAL_ARGS(10001, "the args are illegal"),
    ;

    private int errorCode;

    private String reason;

    SharpMqExceptionType(int errorCode, String reason) {
        this.errorCode = errorCode;
        this.reason = reason;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getReason() {
        return reason;
    }
}
