import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] params = new String[3];
        params[0] = in.nextLine();
        params[1] = in.nextLine();
        params[2] = in.nextLine();
        String str = Calculator.execute(params);
        System.out.println(str);
    }
}


