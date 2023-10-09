package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class BeanC extends TestC implements InitializingBean, DisposableBean {
    private String name;
    private static String names;
    private int value;
    static{
        System.out.println("BeanC static init block");
    }
    {
        System.out.println("BeanC  init block");
    }
    public BeanC() {
        System.out.println(this.getClass().getSimpleName()+ " constructor");
    }

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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName()+" afterPropsSet");
    }
}
