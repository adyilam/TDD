package mockito;

import TDD.mockito.CalculatorApplication;
import TDD.mockito.SimpleCalculatorServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorApplicationTest {

    private CalculatorApplication calculatorApplication;

    @Mock
    SimpleCalculatorServiceImpl simpleCalculatorServiceMock;  //object that uses mock service

    @Before
    public void setup() {
        simpleCalculatorServiceMock = Mockito.mock(SimpleCalculatorServiceImpl.class);  //create the mock object created
        calculatorApplication = new CalculatorApplication();
    }

    @Test
    public void testAdd() {
        when(simpleCalculatorServiceMock.add(10, 20)).thenReturn(30L);

        Assert.assertEquals(30L, simpleCalculatorServiceMock.add(10, 20));
    }

    @Test
    public void testSubtract() {
        when(simpleCalculatorServiceMock.subtract(20, 7)).thenReturn(13L);

        Assert.assertEquals(13l, simpleCalculatorServiceMock.subtract(20, 7));
    }

    @Test
    public void testMultiply() {
        when(simpleCalculatorServiceMock.multiply(5, 3)).thenReturn(15l);

        Assert.assertEquals(15, simpleCalculatorServiceMock.multiply(5, 3));
    }

    @Test(expected = RuntimeException.class)
    public void testDivide() {
        when(simpleCalculatorServiceMock.divide(2, 0)).thenThrow(new NumberFormatException("Division by zero error!!"));

        Assert.assertEquals(2, simpleCalculatorServiceMock.divide(2, 0));
    }

}
