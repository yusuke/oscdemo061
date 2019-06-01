package mypackage;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        assertEquals("fizzzzz", FizzBuzz.fizzBuzz(3));
        assertEquals("fizz", FizzBuzz.fizzBuzz(33));
        assertEquals("fizz", FizzBuzz.fizzBuzz(99));

        assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(25));

        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(0));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(45));


        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("11", FizzBuzz.fizzBuzz(11));


    }
}