import com.example.demo.resources.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @DisplayName("Division")
    @Test
        //given when then
        //GWT
    void testIntegerDivision_WhenSixIsDividedByThree_ShouldReturnTwo() {
        int result = calculator.IntegerDivision(6, 3);
        assertEquals(2, result, "Hello Testing");
        System.out.println("1");
    }

    @DisplayName("Subtraction")
    @Test
    void testIntegerSubtraction_WhenFiveIsSubtractedByOne_ShouldReturnFour() {
        int result = calculator.integerSubtraction(5, 1);
        assertEquals(4, result);
        System.out.println("2");
    }

    @Disabled("ps : this method needs update") //message
    @DisplayName("RandomError")
    @Test
        // add @Disabled annotation or comment out @Test annotation for not executing
    void testRandomError_WhenAppRunning() {
        fail();
        System.out.println("3");
    }


    @DisplayName("EqualArrays")
    @Test
    //GWT
    void testArrays_WhenArraysAreEqual_ShouldReturnTrue() {
        int[] a = new int[]{1, 2, 3};
        assertArrayEquals(a, new int[]{2, 3}, "Hey,Arrays are not equal");
    }

    @DisplayName("VerifyNotNullVariable")
    @Test
    //GWT
    void testVariable_WhenVariableIsNotNull_ShouldReturnTrue() {
        Integer Variable = 5;
        assertNotNull(Variable, "Hey,The Variable is null");
    }

    @DisplayName("VerifyNullVariable")
    @Test
    //GWT
    void testVariable_WhenVariableIsNull_ShouldReturnTrue() {
        Integer Variable = null;
        assertNull(Variable, "Hey,The Variable is not null");
    }


    @DisplayName("VerifyIfItIsSameReference")
    @Test
    //GWT
    void testIfItIsSameReference_WhenVariableCompareTheirReference_ShouldReturnTrue() {
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertSame(c1, c2, "Hey,These Calculator is hasn't same reference");
    }

    @DisplayName("VerifyIfItIsNotSameReference")
    @Test
    //GWT
    void testIfItIsNotSameReference_WhenVariableCompareTheirReference_ShouldReturnTrue() {
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertNotSame(c2, c3, "Hey,These Calculator is has same reference");

    }

    @DisplayName("VerifyException")
    @Test
    void testException_WhenExceptionIsThrown_VerifyExceptionType() {
        assertThrows(IllegalAccessException.class,()->calculator.IntegerDivision(0,0));
    }

    @DisplayName("ExceptionCheck")
    @Test
    void testException_AppRunning_IfThereIsAnExceptionWillBeThrow() {
        assertDoesNotThrow(()->calculator.IntegerDivision(0,0),"Hey,There Is An Exception");
    }


    /*-----------------------------------ParameterizedTest-----------------------------------------------------*/

    @ParameterizedTest
    @ValueSource(strings={"a","b","c"})// Only accepts a single primitive type parameter in array format
    void testVariable_WhileAppRunning_AcceptParameter(String string){
        String given="a";
        //          ->   \"              ->   output: "
        Assertions.assertTrue(string.contains(given), "Hey, we don't have \"" + given + "\" in DB");
    }

    @ParameterizedTest
    @ValueSource(ints={1,2,3})// Only accepts a single primitive type parameter in array format
    /*@EmptySource
    @NullSource
    @NullAndEmptySource*/
    void testVariable_WhileAppRunning_AcceptParameter(int nums){
        int given=1;
        //          -> \"              ->   output: "
        Assertions.assertEquals(given, nums, "Hey, we don't have \"" + given + "\" in DB");
    }


    private static Stream<String> stringProvider() {
        return Stream.of("a", "b", "c");
    }

    private static Stream<Integer> integerProvider() {
        return Stream.of(1, 2, 3);
    }

    @ParameterizedTest
    @MethodSource({"stringProvider", "integerProvider"})
    void testMultipleDataSources(Object input) {
        //The input comes from the parameters in method source, which are loop-able elements.
        Assertions.assertNotNull(input);
    }
}

