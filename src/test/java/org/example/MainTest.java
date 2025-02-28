package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;

public class MainTest {

    @Test
    public void testSquareRoot() {
        // Valid square root calculations
        assertEquals(3.0, Main.squareRoot(16), "Square root of 16 should be 4.0");
        assertEquals(5.0, Main.squareRoot(25), "Square root of 25 should be 5.0");

        // Invalid: negative number
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.squareRoot(-1));
        assertEquals("Cannot calculate square root of a negative number", exception.getMessage());
    }

    @Test
    public void testFactorial() {
        // Valid factorial calculations
        assertEquals(BigInteger.valueOf(120), Main.factorial(5), "Factorial of 5 should be 120");
        assertEquals(BigInteger.ONE, Main.factorial(0), "Factorial of 0 should be 1");

        // Invalid: negative number
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.factorial(-5));
        assertEquals("Cannot calculate factorial of a negative number", exception.getMessage());
    }

    @Test
    public void testNaturalLogarithm() {
        // Valid natural logarithm calculations
        assertEquals(Math.log(2), Main.naturalLogarithm(2), "Natural logarithm of 2 should match Math.log(2)");

        // Invalid: non-positive number
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.naturalLogarithm(-1));
        assertEquals("Cannot calculate logarithm of a non-positive number", exception.getMessage());
    }

    @Test
    public void testPowerFunction() {
        // Valid power calculations
        assertEquals(16.0, Main.power(4, 2), "4 raised to power 2 should be 16");
        assertEquals(1.0, Main.power(5, 0), "Any number raised to power 0 should be 1");

        // Valid negative exponent
        assertEquals(0.25, Main.power(2, -2), "2 raised to power -2 should be 0.25");
    }
}