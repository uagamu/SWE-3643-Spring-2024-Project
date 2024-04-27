package SWE3643.Spring_2024_Project;

import org.springframework.stereotype.Service;

@Service
public class CalculatorEngine {
    public String performOperation(float A, float B, String operation) {
        try {

            switch (operation) {
                case "Add":
                    return String.valueOf(A + B);
                case "Subtraction":
                    return String.valueOf(A - B);
                case "Multiplication":
                    return String.valueOf(A * B);
                case "Division":
                    if (B == 0) {
                        return "Not a Number";
                    }
                    return String.valueOf(A / B);
                case "Equals":
                    if (Math.abs(A - B) < 1e-8) {
                        return "1";
                    } else {
                        return "0";
                    }
                case "Raise to Power":
                    return String.valueOf(Math.pow(A, B));
                case "Logarithm of number":
                    if (A <= 0 || B == 0) {
                        return "Not a Number";
                    }
                    return String.valueOf(Math.log(A) / Math.log(B));
                case "Root of number":
                    if (B == 0) {
                        return "Not a Number";
                    }
                    return String.valueOf(Math.pow(A, 1.0 / B));
                case "Factorial of number":
                    int intA = (int) A;
                    if (intA < 0) {
                        return "Not a Number";
                    } else {
                        if (intA == 0) {
                            return "1";
                        }
                        float factorial = 1;
                        for (int i = 1; i <= intA; i++) {
                            factorial *= i;
                        }
                        return String.valueOf(factorial);
                    }
                case "Sine of A":
                    return String.valueOf(Math.sin(A));
                case "Cosine of A":
                    return String.valueOf(Math.cos(A));
                case "Tangent of A":
                    return String.valueOf(Math.tan(A));
                case "Reciprocal of A":
                    if (A == 0) {
                        return "Not a Number";
                    }
                    return String.valueOf(1.0 / A);
                default:
                    return "Invalid Operation";
            }
        } catch (NumberFormatException e) {
            return "Invalid Input, Numbers Only";
        }
    }
}
