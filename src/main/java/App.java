package main.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal myFirstAnimal = context.getBean("someCat", IAnimal.class);

        IAnimal mySecondAnimal = context.getBean("someMouse", Mouse.class);

        Dog myThirdAnimal = context.getBean("someDog", Dog.class);

        System.out.println(myFirstAnimal.makeSound());

        System.out.println(mySecondAnimal.makeSound());

        System.out.println(myThirdAnimal.makeSound());

        context.close();

    }
}
