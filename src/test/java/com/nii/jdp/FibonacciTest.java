package com.nii.jdp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        fibonacci = null;
    }

    @Test
    public void negativeValues() {

        assertEquals(-1, fibonacci.fibonacciSeries(-77));
    }

    @Test
    public void valueForOne() {
        assertEquals(1, fibonacci.fibonacciSeries(1));
    }

    @Test
    public void valueForZero() {
        assertEquals(0, fibonacci.fibonacciSeries(0));
    }


}