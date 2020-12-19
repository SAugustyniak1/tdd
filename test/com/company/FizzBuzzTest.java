package com.company;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void getValueTest(){

        String result = FizzBuzz.getValue(1);
        Assertions.assertEquals("1", result, "test fizz buzz");

        String result2 = FizzBuzz.getValue(2);
        Assertions.assertEquals("2", result2, "test fizz buzz with 2");

        String result4 = FizzBuzz.getValue(4);
        Assertions.assertEquals("4", result4, "test fizz buzz with 4");
    }

    @Test
    public void fizzTest(){

        String result3 = FizzBuzz.getValue(3);
        Assertions.assertEquals("fizz", result3, "checking number 3");

        String result6 = FizzBuzz.getValue(6);
        Assertions.assertEquals("fizz", result3, "checking number 6");

        String result9 = FizzBuzz.getValue(36);
        Assertions.assertEquals("fizz", result3, "checking number 36");

    }

    @Test
    public void buzzTest(){

        String result3 = FizzBuzz.getValue(5);
        Assertions.assertEquals("buzz", result3, "checking number 5");

        String result6 = FizzBuzz.getValue(10);
        Assertions.assertEquals("buzz", result3, "checking number 10");

        String result9 = FizzBuzz.getValue(10000);
        Assertions.assertEquals("buzz", result3, "checking number 10000");

    }

    @Test
    public void fizzBuzzTest(){

        String result3 = FizzBuzz.getValue(15);
        Assertions.assertEquals("fizzbuzz", result3, "checking number 15");

        String result6 = FizzBuzz.getValue(30);
        Assertions.assertEquals("fizzbuzz", result3, "checking number 30");

        String result9 = FizzBuzz.getValue(30000);
        Assertions.assertEquals("fizzbuzz", result3, "checking number 30000");

    }


}
