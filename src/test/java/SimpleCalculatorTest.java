import TDD.SimpleCalculator;
import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void testDisplayStudentName() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        long sumOfTwoNumbers = simpleCalculator.add(10, 20);

        Assert.assertEquals(30, sumOfTwoNumbers);
    }
}
