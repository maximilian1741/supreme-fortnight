package com.example.project;

public class FizzBuzzApp {
    public static String fizzBuzz(int num){
        if (num % 3 == 0){
            return "Fizz";
        }
        else if (num == 5){
            return "Buzz";
        }
        else {
            return Integer.toString(num);
        }
        
    }
    
}
