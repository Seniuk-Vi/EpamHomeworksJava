package com.epam.spring.homework2;


import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.conf.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("All beans: ");
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
  //      System.out.println(  context.getBean("Qualified"));
    }
}