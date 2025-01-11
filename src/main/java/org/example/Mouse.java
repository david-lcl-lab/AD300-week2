package org.example;

/**
 * Mouse inherits the Animal class
 * and includes a unique behaviour droppings()
 */
public class Mouse extends Animal {

    public Mouse(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("nom nom");
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
        try{
            Thread.sleep(10); // powernap
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
        System.out.println("squeak");
    }

    void droppings(){
        System.out.println("... .... .... ....");
    }

    @Override
    void uniqueBehaviour() {
        droppings();
    }
}