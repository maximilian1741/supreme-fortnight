package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void returnTest(){
        assertEquals(FizzBuzzApp.fizzBuzz(), "2");
    }
}
