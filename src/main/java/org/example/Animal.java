package org.example;

import java.lang.reflect.Method;

/**
 * The Animal class is an abstract base class that represents a generic animal.
 * This class defines common attributes such as name and age, and provides
 * displayInfo method to show object information.
 * <p>
 * Subclasses are required to implement the abstract methods eat, makeSound, sleep,
 * and uniqueBehaviour to define behaviors specific to different types of animals.
 */
abstract class Animal {
    String name;
    int age;
    int MAX_AGE = 250;

    /**
     * Constructor method to define name and age
     */
    Animal(String name, int age){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if ((age < 0) | (age > MAX_AGE)) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }

        this.name = name;
        this.age = age;
    }

    /**
     * Abstract method to define how the animal eats.
     * <p>
     * Subclasses must implement this method to provide specific
     * behavior for eating. This may include actions such as
     * defining the type of food the animal eats or the manner of consumption.
     */
    abstract void eat();
    void sleep(){
        System.out.println(name + " is sleepy");
    }
    /**
     * Abstract method to define how the animal sounds.
     * <p>
     * Subclasses must implement this method to provide specific
     * behavior for making noise.
     */
    abstract void makeSound();

    /**
     * Abstract method to define unique action(s) associated with the animal.
     * <p>
     * Subclasses must implement this method to provide specific
     * behavior not shared with other animals.
     */
    abstract void uniqueBehaviour();

    /**
     * prints info associated with the animal.
     */
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        Class<?> cls = Animal.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
    }
}
