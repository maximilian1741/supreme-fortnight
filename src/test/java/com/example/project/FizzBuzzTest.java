package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

public class FizzBuzzTest {
    @Test
    public void returnTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(1), "1");
    }

    @Test 
    public void returnFizzTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(3), "Fizz");
    }

    @Test 
    public void returnBuzzTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(5), "Fizz");
    }
}
