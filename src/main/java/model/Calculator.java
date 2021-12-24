package model;

public class Calculator {
    public static String execute(String[] params) {

        return "null";
    }

    public int convert(String str) {
        return Integer.parseInt(str);
    }

    public int sum(String num1, String num2) {
        return convert(num1) + convert(num2);
    }
}
