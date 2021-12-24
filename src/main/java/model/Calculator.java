package model;

public class Calculator {
    public static String max = String.valueOf(Integer.MAX_VALUE);
    public static String min = String.valueOf(Integer.MIN_VALUE);
    public static String execute(String[] params) {
        int num1 = Integer.parseInt(params[1]);
        int num2 = Integer.parseInt(params[2]);
        int result;
        switch (params[0]) {
            case "+":
                result = plus(num1, num2);
                return String.valueOf(result);
            case "-":
                result = minus(num1, num2);
                return String.valueOf(result);
            case "*":
                result = mul(num1, num2);
                return String.valueOf(result);
            case "/":
                result = div(num1, num2);
                return String.valueOf(result);
            default:
                return null;
        }
    }

    public static int plus(int num1, int num2) {
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

}
