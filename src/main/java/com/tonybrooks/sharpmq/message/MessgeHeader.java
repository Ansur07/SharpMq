package com.tonybrooks.sharpmq.message;

import lombok.Data;

import javax.jms.Destination;

@Data
public class MessgeHeader {
    //---------------------Set by JMS provider---------------------------
    private Destination JMSDestination;

    private int JMSDeliveryMode;

    private String JMSMessageID;

    private long JMSTimestamp;

    private boolean JMSRedelivered;

    private long JMSExpiration;

    private int JMSPriority;

    private long JMSDeliveryTime;
    //-------------------------------------------------------------------

    //---------------------Set by client application---------------------
    private String JMSCorrelationID;

    private Destination JMSReplyTo;

    private String JMSType;
    //-------------------------------------------------------------------
}
