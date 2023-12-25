package com.demotest.mavenproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result, "The addition result should be 5");
    }

    @Test
    public void testAddEvaluate() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.evaluate("2+3");

        // Assert
        assertEquals(5, result, "The addition result should be 5");
    }
}
