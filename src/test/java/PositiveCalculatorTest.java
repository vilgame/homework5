import model.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static model.Calculator.max;
import static model.Calculator.min;
import static org.testng.Assert.assertEquals;

public class PositiveCalculatorTest {

    @DataProvider(parallel = true)
    public Object[][] positiveData() {
        return new Object[][] {
                {"+", "1", "2", "3"},
                {"-", "5", "4", "1"},
                {"*", "6", "1", "6"},
                {"/", "8", "2", "4"},
                {"-", "9", "0", "9"},
                {"*", "10", "-1", "-10"},
                {"/", "0", "11", "0"},
                {"+", max, min, "-1"},


        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String op, String num1, String num2, String expected) {
        assertEquals(Calculator.execute(new String[] {op, num1, num2}), expected);
    }
}
