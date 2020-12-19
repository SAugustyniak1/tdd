package com.company;

import com.company.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testGreeting(){

        Person testPerson = new Person("bob", "NY", 25);

        String result = testPerson.greetings();
        String expectedResult = "Person{name='bob', city='NY', age=25}";

        Assertions.assertEquals(result, expectedResult);


    }
}
