package com.tonybrooks.sharpmq.common.exception;

import javax.jms.JMSException;

public class SharpMqException extends JMSException {

    public SharpMqException(String reason, String errorCode) {
        super(reason, errorCode);
    }

    public SharpMqException(String reason) {
        super(reason);
    }

    public SharpMqException(SharpMqExceptionType exceptionType) {
        this(exceptionType.getReason(), String.valueOf(exceptionType.getErrorCode()));
    }
}
