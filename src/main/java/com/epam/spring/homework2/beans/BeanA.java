package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private int value;
    static{
        System.out.println(BeanA.class.getSimpleName()+" static init block");
    }
    {
        System.out.println(this.getClass().getSimpleName()+" init block");
    }
    @Value("${data.source.beanB.value:0}")
    public void setValue(int value) {
        System.out.println("Set value through @Value");
        this.value = value;
    }
    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public BeanA() {
        System.out.println(this.getClass().getSimpleName()+ " constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName()+" InitializingBean");
    }
    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName()+" PostConstruct");
    }
    public void destroy() {
        System.out.println(this.getClass().getSimpleName()+" DisposableBean");
    }
    @PreDestroy
    public void destroy2() {
        System.out.println(this.getClass().getSimpleName()+" PreDestroy");
    }
}
