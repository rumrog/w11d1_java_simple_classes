import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator(7,5,3.14,1.9);
    }

    @Test
    public void hasNum1() {
        assertEquals(7, calculator.getNum1());
    }

    @Test
    public void hasNum2() {
        assertEquals(5, calculator.getNum2());
    }

    @Test
    public void hasNum3() {
        assertEquals(3.14, calculator.getNum3(), 0.01);
    }

    @Test
    public void hasNum4() {
        assertEquals(1.9, calculator.getNum4(), 0.01);
    }

    @Test
    public void hasSum() {
        assertEquals(12, calculator.addNums());
    }

    @Test
    public void hasSub() {
        assertEquals(2, calculator.subNums());
    }

    @Test
    public void hasMult() {
        assertEquals(35, calculator.multNums());
    }

    @Test
    public void hasDiv() {
        assertEquals(1.65263158, calculator.divNums(), 0.01);
    }
}

