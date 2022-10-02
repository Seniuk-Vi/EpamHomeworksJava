package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class BeanB {
    private String name;
    private int value;

    @Value("${data.source.beanB.name}")
    public void setName(String name) {
        this.name = name;
    }
    @Value("${data.source.beanB.value:0}")
    public void setValue(int value) {
        this.value = value;
    }
    public void init() {
        System.out.println(this.getClass().getSimpleName()+" init");
    }
    public void otherInit() {
        System.out.println(this.getClass().getSimpleName()+" otherInit");
    }
    public void destroy() {
        System.out.println(this.getClass().getSimpleName()+" destroy");
    }
    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
