package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class BeanD {
    private String name;
    private int value;


    @Value("${data.source.beanD.name}")
    public void setName(String name) {
        this.name = name;
    }
    @Value("${data.source.beanD.value:0}")
    public void setValue(int value) {
        this.value = value;
        System.out.println(this.getClass().getSimpleName()+" setter");
    }

    public BeanD() {
        System.out.println(this.getClass().getSimpleName()+ " constructor");
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName()+" init");
    }
    public void destroy() {
        System.out.println(this.getClass().getSimpleName()+" destroy");
    }
    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
