import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider(parallel = true)
    public Object[][] negativeData() {
        return new Object[][] {
                {"+", "2", "2"},
        };
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String op, String num1, String num2) {
        new Calculator().sum(num1, num2);
    }


}


