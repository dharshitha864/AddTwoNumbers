package com.example;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();

        int result = obj.add(10, 20);

        System.out.println("Sum = " + result);
    }
}