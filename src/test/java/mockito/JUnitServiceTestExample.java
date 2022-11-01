package mockito;

import TDD.mockito.part2.TestService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class JUnitServiceTestExample {

    @Mock
    TestService testServiceMock;

    @Before
    public void setup() {
        testServiceMock = Mockito.mock(TestService.class);
    }

    @Test
    public void testGetUniqueId() {

        //create mockito
        //TestService testServiceMock = Mockito.mock(TestService.class);    //can initialize object look setup() method

        // define return value for method getUniqueId()
        when(testServiceMock.getUniqueId()).thenReturn(50);

        // use mock in test....
        assertEquals(testServiceMock.getUniqueId(), 50);

    }
}
