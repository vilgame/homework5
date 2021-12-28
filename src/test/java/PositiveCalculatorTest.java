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
                {"+", "1", "2", "3.0"},
                {"-", "5", "4", "1.0"},
                {"*", "6", "1", "6.0"},
                {"/", "8", "7", "1.1428571428571428"},
                {"-", "9", "0", "9.0"},
                {"*", "10", "-1", "-10.0"},
                {"/", "0", "11", "0.0"},
                {"-", "12", "-13.1", "25.1"},
                {"*", "-0", "-14", "0.0"},
                {"+", max, min, "-1.0"}
        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String op, String num1, String num2, String expected) {
        assertEquals(Calculator.execute(new String[] {op, num1, num2}), expected);
    }
}
