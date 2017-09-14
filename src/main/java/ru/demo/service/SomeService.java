package ru.demo.service;

import ru.demo.beans.SomeBean;

public class SomeService {
    public SomeBean getBean() {
        SomeBean bean = new SomeBean("name","value");
        return bean;
    }

}
