package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class BeanC {
    private String name;
    private int value;


    @Value("${data.source.beanC.name}")
    public void setName(String name) {
        this.name = name;
    }
    @Value("${data.source.beanC.value:0}")
    public void setValue(int value) {
        this.value = value;
    }
    public void init() {
        System.out.println(this.getClass().getSimpleName()+" init");
    }
    public void destroy() {
        System.out.println(this.getClass().getSimpleName()+" destroy");
    }
    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
