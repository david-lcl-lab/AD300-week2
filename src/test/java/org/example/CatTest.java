package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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
    @org.junit.jupiter.api.Test
    void eat() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.eat();
        assertTrue(outputStream.toString().contains("smack smack"), "Output should indicate 'smack smack");
    }

    @org.junit.jupiter.api.Test
    void sleep() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.sleep();
        assertFalse(outputStream.toString().contains("Interrupt exception"), "Output should not contain an InterruptedException message");
        assertFalse(outputStream.toString().contains("Illegal argument"), "Output should not contain an IllegalArgumentException message");
    }

    @org.junit.jupiter.api.Test
    void makeSound() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.makeSound();
        assertTrue(outputStream.toString().contains("meow"));
    }

    @org.junit.jupiter.api.Test
    void uniqueBehaviour() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.uniqueBehaviour();
        String mDebug = outputStream.toString();
        assertTrue(outputStream.toString().contains("rip and tear\n"));
    }

    @org.junit.jupiter.api.Test
    void scratchFurniture() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        kitty.scratchFurniture();
        String mDebug = outputStream.toString();
        assertTrue(outputStream.toString().contains("rip and tear\n"));
    }

}