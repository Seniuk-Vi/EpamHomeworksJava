package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class BeanD  extends TestC implements InitializingBean  {
    private String name;
    private int value;

    static{
        System.out.println("BeanC static init block");
    }

    {
        System.out.println("BeanC  init block");
    }
    @Value("${data.source.beanD.name}")
    public void setName(String name) {
        System.out.println("Set value through @Value");
        this.name = name;
    }
    @Value("${data.source.beanD.value:0}")
    public void setValue(int value) {
        this.value = value;
        System.out.println("Set value through @Value");
    }

    public BeanD() {
        System.out.println(this.getClass().getSimpleName()+ " constructor");
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName()+" init");
    }
    @PostConstruct
    public void init2() {
        System.out.println(this.getClass().getSimpleName()+" init2");
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName()+" afterPropsSet");
    }
}
