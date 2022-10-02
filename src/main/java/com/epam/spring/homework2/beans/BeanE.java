package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {
    private String name;
    private int value;

    @PostConstruct
    private void init(){
        System.out.println(this.getClass().getSimpleName()+" PostConstruct");
    }
    @PreDestroy
    private void destroy(){
        System.out.println(this.getClass().getSimpleName()+" PreDestroy");
    }
    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
