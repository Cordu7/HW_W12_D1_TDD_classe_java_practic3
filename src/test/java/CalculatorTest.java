import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before()

    {
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(6, calculator.add(2,4));
    }
    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(15, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divide(7.5, 3), 0.0);
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(10,5));
    }

}
