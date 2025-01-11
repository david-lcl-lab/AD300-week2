package org.example;
/**
 * SeaMonkey inherits the Animal class with unique behaviour
 * floatingShrimp() and implements Swim
 */
public class SeaMonkey extends Animal implements Swim{

    public SeaMonkey(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("op op");
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
            Thread.sleep(10); // short nap
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
        System.out.println("snap snap");
    }

    @Override
    void uniqueBehaviour() {
        floatingShrimp();
        sink();
        swim();
    }

    void floatingShrimp(){
        System.out.println("drifting along for the ride");
    }

    @Override
    public void swim() {
        System.out.println("swimming swimming");
    }

    @Override
    public void sink() {
            System.out.println("going down, down, down");
    }
}