package org.cphbusiness.tdd;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator instance = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAdd() {
        // Calculator calculator = new Calculator();
        int expected = 0;
        int actual = instance.add(-2, 2);
        assertEquals(expected, actual);

    }

    @Test
    void testAddWithString() {
        int expected = 6;
        int actual = instance.add("1,2,3");
        assertEquals(expected, actual);
    }

    @Test
    void testAddWithArray() {
        int expected = 6;
        int actual = instance.add(new int[]{1,2,3});
        assertEquals(expected, actual);
    }

    @Test
    void testSubtract() {
        int expected = 0;
        int actual = instance.subtract(-2,-2);
        assertEquals(expected, actual);
    }

    @Test
    void testMultiply() {
        int expected = 4;
        int actual = instance.multiply(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testDivide() {
        double expected = 2;
        double actual = instance.divide(8, 4);
        assertEquals(expected, actual);
    }
}