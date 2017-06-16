package com.sabahtalateh.course;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        Assert.assertEquals(2, calculator.getResult(), 0.00001);
    }

}