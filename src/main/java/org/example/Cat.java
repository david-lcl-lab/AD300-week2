package org.example;
/**
 * Cat inherits the Animal class with unique behaviour
 * scratchFurniture()
 */
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("smack smack");
    }

    /**
     * Simulates the animal taking a short nap by pausing the thread execution for 10 seconds.
     * <p>
     * This method uses the `Thread.sleep()` function to mimic a sleep action.
     * It handles potential exceptions that may occur during the sleep:
     * <p>
     * - {@link InterruptedException}: Thrown if the thread is interrupted while sleeping.
     * - {@link IllegalArgumentException}: Thrown if the sleep duration is negative.
     * <p>
     * Both exceptions are caught and logged with an appropriate message.
     */
    @Override
    void sleep() {
        super.sleep();
        try{
            Thread.sleep(20000); // longnap
        }
        catch(InterruptedException e){
            System.out.println("Interrupt exception\n"+e);
        }
        catch(IllegalArgumentException e){
            System.out.println("Illegal argument for sleep:\n"+e);
        }
    }

    @Override
    void makeSound() {
        System.out.println("meow");
    }

    @Override
    void uniqueBehaviour() {
        scratchFurniture();
    }

    void scratchFurniture(){
        System.out.println("rip and tear");
    }


}