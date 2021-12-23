import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveCalculatorTest {

    @Test
    public void testSum(){
        assertEquals(new Calculator().sum(2, 2), 4, "Проверка");
    }


}
