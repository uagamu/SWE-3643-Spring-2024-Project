package SWE3643.Spring_2024_Project;

import org.junit.Before;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.assertEquals;

public class CalculatorEngineTest {
    private CalculatorEngine calculatorEngine;

    @Before
    public void setUp() {
        calculatorEngine = new CalculatorEngine();
    }

    @Test
    public void testAddition() {
        assertEquals("10.0", calculatorEngine.performOperation(5, 5, "Add"));
    }

    @Test
    public void testSubtraction() {
        assertEquals("3.0", calculatorEngine.performOperation(8, 5, "Subtraction"));
    }

    @Test
    public void testMultiplication() {
        assertEquals("25.0", calculatorEngine.performOperation(5, 5, "Multiplication"));
    }

    @Test
    public void testDivision() {
        assertEquals("2.0", calculatorEngine.performOperation(10, 5, "Division"));
        assertEquals("Not a Number", calculatorEngine.performOperation(5, 0, "Division"));
    }

    @Test
    public void testEquals() {
        assertEquals("1", calculatorEngine.performOperation(5, 5, "Equals"));
        assertEquals("0", calculatorEngine.performOperation(5, 6, "Equals"));
    }

    @Test
    public void testRaiseToPower() {
        assertEquals("32.0", calculatorEngine.performOperation(2, 5, "Raise to Power"));
    }

    @Test
    public void testLogarithmOfNumber() {
        assertEquals("0.30102999566398114", calculatorEngine.performOperation(2, 10, "Logarithm of number"));
        assertEquals("Not a Number", calculatorEngine.performOperation(0, 5, "Logarithm of number"));
    }

    @Test
    public void testRootOfNumber() {
        assertEquals("2.0", calculatorEngine.performOperation(16, 4, "Root of number"));
        assertEquals("Not a Number", calculatorEngine.performOperation(16, 0, "Root of number"));
    }

    @Test
    public void testFactorialOfNumber() {
        assertEquals("120.0", calculatorEngine.performOperation(5, 0,"Factorial of number"));
        assertEquals("1", calculatorEngine.performOperation(0, 0,"Factorial of number"));
        assertEquals("Not a Number", calculatorEngine.performOperation(-5, 0,"Factorial of number"));
    }

    @Test
    public void testFactorialNegativeInput() {
        assertEquals("Not a Number", calculatorEngine.performOperation(-5, 0,"Factorial of number"));
    }

    @Test
    public void testSineOfA() {
        assertEquals("0.8414709848078965", calculatorEngine.performOperation(1, 0,"Sine of A"));
        assertEquals("0.0", calculatorEngine.performOperation(0, 0,"Sine of A"));
    }

    @Test
    public void testCosineOfA() {
        assertEquals("0.5403023058681398", calculatorEngine.performOperation(1, 0,"Cosine of A"));
        assertEquals("1.0", calculatorEngine.performOperation(0, 0,"Cosine of A"));
    }

    @Test
    public void testTangentOfA() {
        assertEquals("1.5574077246549023", calculatorEngine.performOperation(1, 0,"Tangent of A"));
        assertEquals("0.0", calculatorEngine.performOperation(0, 0,"Tangent of A"));
    }

    @Test
    public void testReciprocalOfNumber() {
        assertEquals("0.2", calculatorEngine.performOperation(5, 0,"Reciprocal of A"));
        assertEquals("Not a Number", calculatorEngine.performOperation(0, 0,"Reciprocal of A"));
    }

    @Test
    public void testInvalidOperation() {
        assertEquals("Invalid Operation", calculatorEngine.performOperation(10, 5, "Unknown"));
    }
}
