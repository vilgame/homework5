package model;

import java.util.Scanner;

public class Calculator {
    public static String max = String.valueOf(Integer.MAX_VALUE);
    public static String min = String.valueOf(Integer.MIN_VALUE);

    public static String execute(String[] params) {
        String op = getOp();
        params[0] = op;
        int num1 = Integer.parseInt(params[1]);
        int num2 = Integer.parseInt(params[2]);
        int result = calc(num1, num2, op);
        System.out.println("Result = " + result);
        return String.valueOf(result);
    }

    public static int calc(int num1, int num2, String op) {
        int result;
        switch (op) {
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
                result = div(num1, num2);
                break;
            default:
                throw new CalculatorException("Error invalid user");
        }
        return result;
    }

    public static int getNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
        } else {
            num = getNum();
        }
        return num;
    }

    public static String getOp() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter +, -, * or /");
        String op = in.nextLine();
        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            op = getOp();
        }
        return op;
    }

    public static boolean borders (int num) {
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
            throw new CalculatorException("Borders");
        } else {
            return true;
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
