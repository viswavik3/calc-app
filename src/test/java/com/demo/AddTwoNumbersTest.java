package com.demo.calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers() {
        int num1 = 10;
        int num2 = 20;
        int expectedSum = 30;
        calculator cal =new calculator();
        assertEquals(expectedSum, cal.AddTwoNumbers(10,20));
    }
}

