package runner;

import org.testng.annotations.Test;

/**
 * Exception testing
 * @author Nick Avilkin
 */
public class ExceptionTest extends BaseTest {

    /**
     * Check division by 0
     */
    @Test (expectedExceptions =  {NumberFormatException.class})
    public void testExceptionDiv() {
        double result = calculator.div(3,0);
    }
}
