package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void getValueTest(){

        String result = FizzBuzz.getValue(1);

        Assertions.assertEquals("1", result, "test fizz buzz");

    }

}
