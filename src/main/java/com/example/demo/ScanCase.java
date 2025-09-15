package com.example.demo;

public class ScanCase {
    protected void DoublePrecision(){
        double first = 0.1;
        double second = 0.2;
        double result = first + second;
        System.out.println("Double Precision Result: " + result);
        System.out.println("Compare with 0.3 (using math operator): " + (result == 0.3));
        System.out.println("Compare with 0.3 (using equal method): " + (result.equals(0.3)));
    }

    protected void FloatPrecision(){
        float first = 0.1f;
        float second = 0.2f;
        float result = first + second;
        System.out.println("Float Precision Result: " + result);
        System.out.println("Compare with 0.3 (using math operator): " + (result == 0.3f));
        System.out.println("Compare with 0.3 (using equal method): " + (result.equals(0.3f)));
    }

    protected void IntegerProblem(){
        int first = 1;
        Integer second = 1;
        assertNotEquals(first, second);
    }
}
