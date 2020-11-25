package com.devmind.temedevmind3;

import org.springframework.stereotype.Component;

@Component
public class Pig implements IAnimal{
    @Override
    public String makeSound() {
        return "Oink";
    }
}
