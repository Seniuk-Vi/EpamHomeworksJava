package com.epam.spring.homework1.pet;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {

    List<Animal> animalList;

    public Pet(List<Animal> animalList) {
        this.animalList = animalList;
    }


    public void printPets() {
        animalList.forEach(System.out::println);
    }
}
