package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] pets = new Animal[4];
        pets[0] = new Dog("Fido", 10);
        pets[1] = new Cat("Kitty", 100);
        pets[2] = new Mouse("Mickey", 25);
        pets[3] = new SeaMonkey("Gus", 1);

        for (Animal animal : pets) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            animal.makeSound();
            animal.uniqueBehaviour();
        }


    }
}