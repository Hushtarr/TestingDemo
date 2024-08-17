```java

package com.example.demo.calculator;

import org.junit.jupiter.api.*;

//Not runnable class
class CalculatorMethodLevelTest {
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

```
