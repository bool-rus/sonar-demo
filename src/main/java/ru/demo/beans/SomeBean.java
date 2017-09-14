package ru.demo.beans;

public class SomeBean {
    private final String name;
    private final String value;

    public SomeBean(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
