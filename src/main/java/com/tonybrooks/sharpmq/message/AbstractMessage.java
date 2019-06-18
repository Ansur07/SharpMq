package com.tonybrooks.sharpmq.message;

import org.apache.commons.lang3.StringUtils;

import javax.jms.Destination;
import javax.jms.Message;
import java.util.Enumeration;
import java.util.Objects;

public class AbstractMessage implements Message {

    protected MessgeHeader header;

    protected MessageProperties properties;

    public String getJMSMessageID() {
        return header.getJMSMessageID();
    }

    public void setJMSMessageID(String id) {
        header.setJMSMessageID(id);
    }

    public long getJMSTimestamp() {
        return header.getJMSTimestamp();
    }

    public void setJMSTimestamp(long timestamp) {
        header.setJMSTimestamp(timestamp);
    }

    public byte[] getJMSCorrelationIDAsBytes() {
        String correlationID = header.getJMSCorrelationID();
        return StringUtils.isEmpty(correlationID) ?
                null : header.getJMSCorrelationID().getBytes();
    }

    public void setJMSCorrelationIDAsBytes(byte[] correlationID) {
        header.setJMSMessageID(new String(correlationID));
    }

    public void setJMSCorrelationID(String correlationID) {
        header.setJMSMessageID(correlationID);
    }

    public String getJMSCorrelationID() {
        return header.getJMSCorrelationID();
    }

    public Destination getJMSReplyTo() {
        return header.getJMSReplyTo();
    }

    public void setJMSReplyTo(Destination replyTo) {
        header.setJMSReplyTo(replyTo);
    }

    public Destination getJMSDestination() {
        return header.getJMSDestination();
    }

    public void setJMSDestination(Destination destination) {
        header.setJMSDestination(destination);
    }

    public int getJMSDeliveryMode() {
        return header.getJMSDeliveryMode();
    }

    public void setJMSDeliveryMode(int deliveryMode) {
        header.setJMSDeliveryMode(deliveryMode);
    }

    public boolean getJMSRedelivered() {
        return header.isJMSRedelivered();
    }

    public void setJMSRedelivered(boolean redelivered) {
        header.setJMSRedelivered(redelivered);
    }

    public String getJMSType() {
        return header.getJMSType();
    }

    public void setJMSType(String type) {
        header.setJMSType(type);
    }

    public long getJMSExpiration() {
        return header.getJMSExpiration();
    }

    public void setJMSExpiration(long expiration) {
        header.setJMSExpiration(expiration);
    }

    public long getJMSDeliveryTime() {
        return header.getJMSDeliveryTime();
    }

    public void setJMSDeliveryTime(long deliveryTime) {
        header.setJMSDeliveryTime(deliveryTime);
    }

    public int getJMSPriority() {
        return header.getJMSPriority();
    }

    public void setJMSPriority(int priority) {
        header.setJMSPriority(priority);
    }

    public void clearProperties() {
        properties.clear();
    }

    public boolean propertyExists(String name) {
        return Objects.nonNull(properties.get(name));
    }

    public boolean getBooleanProperty(String name) {
        return (Boolean) properties.get(name);
    }

    public byte getByteProperty(String name) {
        return (Byte) properties.get(name);
    }

    public short getShortProperty(String name) {
        return (Short) properties.get(name);
    }

    public int getIntProperty(String name) {
        return (Integer) properties.get(name);
    }

    public long getLongProperty(String name) {
        return (Long) properties.get(name);
    }

    public float getFloatProperty(String name) {
        return (Float) properties.get(name);
    }

    public double getDoubleProperty(String name) {
        return (Double) properties.get(name);
    }

    public String getStringProperty(String name) {
        return String.valueOf(properties.get(name));
    }

    public Object getObjectProperty(String name) {
        return properties.get(name);
    }

    public Enumeration getPropertyNames() {
        return properties.getPropertyNames();
    }

    public void setBooleanProperty(String name, boolean value) {
        properties.set(name, value);
    }

    public void setByteProperty(String name, byte value) {
        properties.set(name, value);
    }

    public void setShortProperty(String name, short value) {
        properties.set(name, value);
    }

    public void setIntProperty(String name, int value) {
        properties.set(name, value);
    }

    public void setLongProperty(String name, long value) {
        properties.set(name, value);
    }

    public void setFloatProperty(String name, float value) {
        properties.set(name, value);
    }

    public void setDoubleProperty(String name, double value) {
        properties.set(name, value);
    }

    public void setStringProperty(String name, String value) {
        properties.set(name, value);
    }

    public void setObjectProperty(String name, Object value) {
        properties.set(name, value);
    }

    public void acknowledge() {

    }

    public void clearBody() {

    }

    public <T> T getBody(Class<T> c) {
        return null;
    }

    public boolean isBodyAssignableTo(Class c) {
        return false;
    }
}
