package com.example.demo.calculator;

import org.junit.jupiter.api.*;

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
        System.out.println("1");
    }

    @DisplayName("Subtraction")
    @Test
    void testIntegerSubtraction_WhenFiveIsSubtractedByOne_ShouldReturnFour() {
        int result=calculator.integerSubtraction(5,1);
        assertEquals(4,result);
        System.out.println("2");
    }

    @Disabled("ps : this method needs update")
    @DisplayName("RandomError")
    @Test    // add @Disabled annotation or comment out @Test annotation for not executing
    void testRandomError_WhenAppRunning() {
        fail();
        System.out.println("3");
    }


    @BeforeAll //must be static
    static void thisIsBeforeAll(){
        System.out.println("Before All annotation");
    }

    @AfterAll //must be static
    static void thisIsAfterAll(){
        System.out.println("After All annotation");
    }

    @BeforeEach
    void thisIsBeforeEach(){
        System.out.println("Before Each annotation");
    }

    @AfterEach
    void thisIsAfterEach(){
        System.out.println("After Each annotation");
    }
}