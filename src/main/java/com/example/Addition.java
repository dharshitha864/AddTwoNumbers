package com.example;

import java.util.ArrayList;
import java.util.List;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public long factorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Enter 0 to 20");

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public List<Integer> fibonacci(int n) {
        List<Integer> list = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            list.add(a);

            int next = a + b;
            a = b;
            b = next;
        }

        return list;
    }

    public int reverseNumber(int n) {
        long num = Math.abs((long) n);
        long rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (n < 0)
            rev = -rev;

        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            throw new ArithmeticException("Result out of range");

        return (int) rev;
    }

    public boolean isNumberPalindrome(int n) {
        return n >= 0 && n == reverseNumber(n);
    }

    public double simpleInterest(double p, double r, double t) {
        return p * r * t / 100;
    }

    public String grade(int marks) {
        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException("Invalid marks");

        if (marks >= 90)
            return "A";
        if (marks >= 80)
            return "B";
        if (marks >= 70)
            return "C";
        if (marks >= 60)
            return "D";

        return "F";
    }

    public int sumArray(int[] arr) {
        int sum = 0;

        for (int n : arr) {
            sum += n;
        }

        return sum;
    }

    public int maxArray(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty");

        int max = arr[0];

        for (int n : arr) {
            if (n > max)
                max = n;
        }

        return max;
    }

    public int countVowels(String s) {
        int count = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0)
                count++;
        }

        return count;
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isStringPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        return s.equals(reverseString(s));
    }
}