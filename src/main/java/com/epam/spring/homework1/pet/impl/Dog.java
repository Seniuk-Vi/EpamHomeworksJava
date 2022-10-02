package com.epam.spring.homework1.pet.impl;

import com.epam.spring.homework1.pet.Animal;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Dog implements Animal {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
