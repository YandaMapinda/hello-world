package ac.za.cput.projects;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.add(2,3));

    }
    @Test
    public void mult(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(9, calculator.mult(3,3));
    }
    @Test
    public void divide(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.divide(2,2));
    }

}
