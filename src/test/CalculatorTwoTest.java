import com.example.demo.resources.Calculator;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Execution order
@TestMethodOrder(MethodOrderer.Random.class)
// @TestMethodOrder(MethodOrderer.MethodName.class)
// @order(1,2..) annotation in method level
class CalculatorTwoTest {

    Calculator calculator = new Calculator();


    /*-----------------------------------RepeatedTest-----------------------------------------------------*/
    // @Order(2)
    @DisplayName("repeatable testing")
    @RepeatedTest(3)
        //given when then
        //GWT
    void testMethodIfItIsRepeatable1(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int result = calculator.IntegerDivision(6, 3);
        assertEquals(2, result, "Hello Testing");

        String methodName = testInfo.getTestMethod().map(Method::getName).orElse("Unknown method");
        System.out.println("The method name is: " + methodName);

        System.out.println("time of repeat :"+repetitionInfo.getCurrentRepetition());
    }

    // @Order(1)
    @DisplayName("repeatable testing 2")
    @RepeatedTest(value = 3,name = "{displayName} -> Repetition {currentRepetition} of {totalRepetitions}")
        //given when then
        //GWT
    void testMethodIfItIsRepeatable2(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int result = calculator.IntegerDivision(6, 3);
        assertEquals(2, result, "Hello Testing");

        String methodName = testInfo.getTestMethod().map(Method::getName).orElse("Unknown method");
        System.out.println("The method name is: " + methodName);

        System.out.println("time of repeat :"+repetitionInfo.getCurrentRepetition());
    }

    /*-----------------------------------TestOrder-----------------------------------------------------*/

    @Test
    void testA(){
        System.out.println("A");
    }
    @Test
    void testB(){
        System.out.println("B");
    }
    @Test
    void testC(){
        System.out.println("C");
    }

}
