package com.devmind.temedevmind3.inversionOfControl;

public class Dog implements IAnimal {
    @Override
    public String makeSound() {
        return "Mrrr";
    }
}
