package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanosTest {

    @Test
    void test1() {
        int numberToConvert = 1;
        String expectedResult ="I";
        Romanos r = new Romanos();
        String result = r.convertToRomanian(numberToConvert);
        assertEquals(expectedResult, result);
    }
    @Test
    void test2() {
        int numberToConvert = 2;
        String expectedResult ="II";
        Romanos r = new Romanos();
        String result = r.convertToRomanian(numberToConvert);
        assertEquals(expectedResult, result);
    }
    @Test
    void test3() {
        int numberToConvert = 3;
        String expectedResult ="III";
        Romanos r = new Romanos();
        String result = r.convertToRomanian(numberToConvert);
        assertEquals(expectedResult, result);
    }
}