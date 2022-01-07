package model;

import java.util.Locale;

public class Calculator {
    public static String max = String.valueOf(Integer.MAX_VALUE);
    public static String min = String.valueOf(Integer.MIN_VALUE);

    public static String execute(String[] params) {
        double num1;
        double num2;
        String result;
        try {
            num1 = Double.parseDouble(params[1]);
            num2 = Double.parseDouble(params[2]);
        }
        catch (RuntimeException e) {
            throw new CalculatorException("String not double");
        }
        switch (params[0]) {
            case "+":
                result = plus(num1, num2);
                break;
            case "-":
                result = minus(num1, num2);
                break;
            case "*":
                result = mul(num1, num2);
                break;
            case "/":
                result =  div(num1, num2);
                break;
            default:
                throw new CalculatorException(params[0] + " - not an arithmetic operation");
        }
        borders(Double.parseDouble(result));
        return result;
    }

    public static void borders(double num) {
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
            throw new CalculatorException("Result is more borders");
        }
    }

    public static String plus(double num1, double num2) {
        return String.valueOf(num1 + num2);
    }

    public static String minus(double num1, double num2) {
        return String.valueOf(num1 - num2);
    }

    public static String mul(double num1, double num2) {
        return String.valueOf(num1 * num2);
    }

    public static String div(double num1, double num2) {
        if (num2 == 0) {
            throw new CalculatorException("Division by 0");
        }
        else {
            return String.format(Locale.ENGLISH,"%.3f", num1 / num2);
        }
    }

}
