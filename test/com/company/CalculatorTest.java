package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void testSum(){
        Calculator calculator = new Calculator(5,10);
        int result =  calculator.sum();

        Assertions.assertEquals(result, 14, "sum two positive numbers");

    }

    @Test
    public void testSubstraction(){
        Calculator calculator = new Calculator(5,10);
        int result = calculator.subtraction();

        Assertions.assertEquals(result, -5);

    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator(5,-10);
        int result = calculator.multiplication();

        Assertions.assertEquals(result, -50);

    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator(0,-5);
        double result = calculator.division();

        Assertions.assertEquals(result, 1);
    }
    @Test
    public void testDivisionByHalf(){
        Calculator calculator = new Calculator(5,1);
        double result = calculator.division();

        Assertions.assertEquals(result, 0);
    }




}
