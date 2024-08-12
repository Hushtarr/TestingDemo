package com.example.demo.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @DisplayName("Division")
    @Test
    //given when then
    //GWT
    void testIntegerDivision_WhenSixIsDividedByThree_ShouldReturnTwo() {
        int result =calculator.IntegerDivision(6,3);
        assertEquals(2,result,"Hello Testing");
    }

    @DisplayName("Subtraction")
    @Test
    void testIntegerSubtraction_WhenFiveIsSubtractedByOne_ShouldReturnFour() {
        int result=calculator.integerSubtraction(5,1);
        assertEquals(4,result);
    }

    @DisplayName("RandomError")
    @Test
    void testRandomError_WhenAppRunning() {
        fail();
    }
}