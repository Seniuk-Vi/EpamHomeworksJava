package com.epam.spring.homework1.pet.impl;

import com.epam.spring.homework1.pet.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cheetah implements Animal {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
