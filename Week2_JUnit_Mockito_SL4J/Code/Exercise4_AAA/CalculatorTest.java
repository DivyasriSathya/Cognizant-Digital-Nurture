package com.example.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }

    @Test
    public void testAdd() {
        int a = 2, b = 3;

        int result = calculator.add(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {

        int a = 4, b = 3;

        int result = calculator.multiply(a, b);

        assertEquals(12, result);
    }
}
