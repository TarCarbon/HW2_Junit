package org.example;

import org.example.SumCalculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {

    SumCalculator sumCalculator;
    @BeforeEach
    void createObjectTestClass (){
       sumCalculator = new SumCalculator();
    }

    @Test
    void testSumOne () {
        System.out.println("<=== Test One EXECUTED ===>");
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testSumTwo () {
        System.out.println("<=== Test Two EXECUTED ===>");
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void testSumShowIllegalArgumentException () {
        System.out.println("<=== Test Three EXECUTED ===>");
        Throwable exception = assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));
        }

}
