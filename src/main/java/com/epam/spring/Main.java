package com.epam.spring;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Pet;
import com.epam.spring.homework1.pet.impl.Cheetah;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        context.getBean(Pet.class).printPets();
        System.out.println( context.getBean(Cheetah.class).hashCode());
        System.out.println(  context.getBean("primaryCheetah").hashCode());
        System.out.println(  context.getBean("QualifiedCheetah").hashCode());
  //      System.out.println(  context.getBean("Qualified"));
    }
}