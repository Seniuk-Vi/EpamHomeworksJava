package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
    @Autowired
    public OtherBeanA(BeanA beanA) {
        System.out.println(this.getClass().getSimpleName()+". "+beanA.getClass().getSimpleName() + "was injected through the constructor");
    }
}
