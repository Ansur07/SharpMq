package com.tonybrooks.sharpmq.message;

import java.util.*;

public class MessageProperties {

    private Map<String, Object> propertiesMap;

    public MessageProperties() {
        propertiesMap = Collections.synchronizedMap(new HashMap<>());
    }

    public Object get(String name) {
        return propertiesMap.get(name);
    }

    public void set(String name, Object val) {
        propertiesMap.put(name, val);
    }

    public void clear() {
        propertiesMap.clear();
    }

    public Enumeration getPropertyNames() {
        return Collections.enumeration(propertiesMap.keySet());
    }
}
