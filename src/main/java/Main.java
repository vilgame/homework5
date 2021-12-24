import model.Calculator;

public class Main {
    public static void main(String[] args) {
        String[] params = new String[3];
        params[1] = String.valueOf(Calculator.getNum());
        params[0] = Calculator.getOp();
        params[2] = String.valueOf(Calculator.getNum());
        Calculator.execute(params);
    }
}


