import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveCalculatorTest {

    @DataProvider(parallel = true)
    public Object[][] positiveData() {
        return new Object[][] {
                {"+", "2", "2", "4"},

        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String op, String num1, String num2, String expected) {
        assertEquals(new Calculator().sum(num1, num2), expected);
    }
}
