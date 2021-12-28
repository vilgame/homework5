import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        args = new String[3];
        System.out.println("Enter +, -, * or /");
        args[0] = in.nextLine();
        System.out.println("Enter a first double: (for example: 1.1)");
        args[1] = in.nextLine();
        System.out.println("Enter a second double: (for example: 1.1)");
        args[2] = in.nextLine();
        String str = Calculator.execute(args);
        System.out.println(args[1] + args[0] + args[2] + "=" + str);
    }
}


