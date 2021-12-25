import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static model.Calculator.max;
import static model.Calculator.min;

public class NegativeCalculatorTest {

    @DataProvider(parallel = true)
    public Object[][] negativeData() {
        return new Object[][] {
                {" ", "1", "2"},
                {"+", "q", "3"},
                {"-", "4", "&"},
                {"/", "5", "0"},
                {"w", "6", "-7"},
                {"*", null, "8"},
                {"+", max, "1"},
                {"-", min, "1"},
        };
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String op, String num1, String num2) {
        Calculator.execute(new String[]{op, num1, num2});
    }
}


