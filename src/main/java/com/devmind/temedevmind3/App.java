package com.devmind.temedevmind3;

import com.devmind.temedevmind3.beanLifecycle.Task;
import com.devmind.temedevmind3.inversionOfControl.Dog;
import com.devmind.temedevmind3.inversionOfControl.IAnimal;
import com.devmind.temedevmind3.inversionOfControl.Mouse;
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

        Task firstTask = context.getBean("taskPrototype", Task.class);
        System.out.println(firstTask.toString());

        Task secondTask = context.getBean("taskPrototype", Task.class);
        System.out.println(secondTask.toString());


        Task thirdTask = context.getBean("taskPrototype", Task.class);
        System.out.println(thirdTask.toString());

        Task task = context.getBean("task", Task.class);
        System.out.println(task.toString());

        context.close();

    }
}
