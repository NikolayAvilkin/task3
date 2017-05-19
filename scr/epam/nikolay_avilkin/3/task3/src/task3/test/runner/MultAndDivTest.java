package runner;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Testing mult  and div in the calculator
 * @author Nick Avilkin
 */
public class MultAndDivTest extends BaseTest {

    /**
     * Check positive mult case
     */
    @Test (groups = "mult")
    public void testPositiveMultThree() {
        long result = calculator.mult(7,5);
        Assert.assertEquals(result,35, "Invalid result of milt operation");
    }

    /**
     * Check positive div case
     */
    @Test (groups = "div")
    public void testPositiveDivThree() {
        long result = calculator.div(-35, 7);
        Assert.assertEquals(result, -5, "Invalid result of  div operation");
    }

    /**
     * Check negative div case
     */
    @Test (groups = "divN", alwaysRun = true, priority = 4)
    public void testNegativDivThree() {
        long result = calculator.div(-35, 7);
        Assert.assertEquals(result, -3, "Invalid result of div operation");
    }

    /**
     * Check negative div case
     */
    @Test (groups = "multN",alwaysRun = true, priority = 4)
    public void testNegativMultThree() {
        long result = calculator.mult(-7, 5);
        Assert.assertEquals(result, -100, "Invalid result of mult operation");
    }
}
