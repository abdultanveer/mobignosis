package com.spot.mobignosis;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add_test_normal_values() {
        int expected = 30;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }

    @Test
    public void add_test_abnormal_values() {
        int expected = -30;
        int actual = Calculator.add(-10,20);
        assertEquals(expected,actual);
    }


    @Test
    public void add_test_String_values() {
        String expected = "abdulansarid";
        String actual = Calculator.addString("abdul","ansari");
        assertEquals(expected,actual);
    }
}