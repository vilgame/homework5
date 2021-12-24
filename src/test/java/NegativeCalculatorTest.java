import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NegativeCalculatorTest {

    @DataProvider(parallel = true)
    public Object[][] negativeData() {
        return new Object[][] {
                {"+", "2", "2"},
        };
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String op, String num1, String num2) {
        Calculator.execute(new String[]{op, num1, num2});
    }


}


