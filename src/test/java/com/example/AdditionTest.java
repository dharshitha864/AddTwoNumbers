package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        Addition obj = new Addition();
        assertEquals(30, obj.add(10, 20));
    }

    @Test
    public void testAdditionWithZero() {
        Addition obj = new Addition();
        assertEquals(5, obj.add(5, 0));
    }

    @Test
    public void testNegativeNumbers() {
        Addition obj = new Addition();
        assertEquals(-5, obj.add(-2, -3));
    }
}