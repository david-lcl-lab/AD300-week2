package org.example;

/**
 * Dog inherits the Animal class with unique behaviours
 * including Tricks
 */
public class Dog extends Animal implements Tricks {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("chomp chomp");
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
            Thread.sleep(10000); // short nap
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
        System.out.println("woof");
    }

    void digHole(){
        System.out.println("Dig dig, where did I hide my bone?");
    }

    @Override
    void uniqueBehaviour() {
        digHole();
        playFetch();
        shake();
        rollOver();
    }

    @Override
    public void playFetch() {
        System.out.println("I'm fetching the ball");
    }

    @Override
    public void shake() {
        System.out.println("Nice to meet you");
    }

    @Override
    public void rollOver() {
        System.out.println("I'm rolling over now where's my treat?!");
    }
}