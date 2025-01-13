package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat kitty;

    @BeforeEach
    void setUp() {
        kitty = new Cat("Kitty", 2);
    }
    @AfterEach
    void tearDown() {
        kitty = null;
        System.gc();
        System.setOut(System.out);
    }
    @Test
    void eat() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.eat();
        assertTrue(outputStream.toString().contains("smack smack"), "Output should indicate 'smack smack");
    }

    @Test
    void sleep() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.sleep();
        assertFalse(outputStream.toString().contains("Interrupt exception"), "Output should not contain an InterruptedException message");
        assertFalse(outputStream.toString().contains("Illegal argument"), "Output should not contain an IllegalArgumentException message");
    }

    @Test
    void makeSound() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.makeSound();
        assertTrue(outputStream.toString().contains("meow"));
    }

    @Test
    void uniqueBehaviour() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.uniqueBehaviour();
        assertTrue(outputStream.toString().contains("rip and tear\n"));
    }

    @Test
    void scratchFurniture() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.scratchFurniture();
        assertTrue(outputStream.toString().contains("rip and tear\n"));
    }

    @Test
    void sleepWithInterrupt() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Thread.currentThread().interrupt(); // Simulate an interrupt before sleep
        kitty.sleep();
        assertTrue(outputStream.toString().contains("Interrupt exception"), "Output should handle InterruptedException gracefully");
    }

    @SuppressWarnings("Null Pointer Exception")
    @Test
    void nullPointerTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Cat pKitty = new Cat(null, 2);;  // Illegal construction with null name
        });
    }

    @Test
    void testNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cat(null, 2); // Assume name cannot be null
        });
    }


}