package com.lifl.testautoconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.test")
public class HelloPorperties {


    private String name;

    private String value;

    @Override
    public String toString() {
        return "HelloPorperties{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
