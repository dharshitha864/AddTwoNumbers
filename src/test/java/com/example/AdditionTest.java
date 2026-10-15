package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    Addition obj = new Addition();

    // PASS: Correct Fibonacci series
    @Test
    public void testFibonacciPass() {
        assertEquals(
            Arrays.asList(0, 1, 1, 2, 3, 5),
            obj.fibonacci(6)
        );
    }

    // FAIL: Incorrect expected Fibonacci series
    @Test
    public void testFibonacciFail() {
        assertEquals(
            Arrays.asList(0, 1, 2, 3, 5, 8),
            obj.fibonacci(6)
        );
    }

    // PASS: Fibonacci series with one term
    @Test
    public void testFibonacciOneTerm() {
        assertEquals(
            Arrays.asList(0),
            obj.fibonacci(1)
        );
    }

    // PASS: Fibonacci series with two terms
    @Test
    public void testFibonacciTwoTerms() {
        assertEquals(
            Arrays.asList(0, 1),
            obj.fibonacci(2)
        );
    }

    // FAIL: Incorrect expected number of terms
    @Test
    public void testFibonacciWrongLength() {
        assertEquals(
            Arrays.asList(0, 1, 1, 2, 3),
            obj.fibonacci(6)
        );
    }

    // PASS: Zero terms
    @Test
    public void testFibonacciZeroTerms() {
        assertEquals(
            Arrays.asList(),
            obj.fibonacci(0)
        );
    }
}