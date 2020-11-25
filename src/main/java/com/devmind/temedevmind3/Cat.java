package com.devmind.temedevmind3;

import org.springframework.stereotype.Component;

@Component("componentCat")
public class Cat implements IAnimal {
    @Override
    public String makeSound() {
        return "Miu";
    }
}