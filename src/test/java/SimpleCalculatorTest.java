import TDD.SimpleCalculator;
import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void testDisplayStudentName() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int sumOfTwoNumbers = simpleCalculator.add(10, 20);

        Assert.assertEquals(30, sumOfTwoNumbers);
    }
}
