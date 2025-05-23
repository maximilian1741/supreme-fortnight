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
        assertEquals(FizzBuzzApp.fizzBuzz(5), "Buzz");
    }

    @Test 
    public void returnFizzMultipleTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(9), "Fizz");
    }

    @Test 
    public void returnBuzzMultipleTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(25), "Buzz");
    }

    @Test 
    public void returnFizzBuzzTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(15), "FizzBuzz");
    }

}
