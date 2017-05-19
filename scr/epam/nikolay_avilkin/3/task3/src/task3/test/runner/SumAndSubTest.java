package runner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Testing sum  and sub in the calculator
 * @author Nick Avilkin
 */
public class SumAndSubTest extends BaseTest {

    /**
     * Check positive sum case
     * @param a long first digits
     * @param b long second digits
     * @param expected long expected result
     */
    @Test (groups = "sum", dataProvider = "SumPositiveDP",priority = 0)
    public void  testSumPositiveThree(long a,long b, long expected) {
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, expected, "Invalid result of  sum operation");
    }

    /**
     * Check positive sub case
     * @param a long first digits
     * @param b long second digits
     * @param expected long expected result
     */
    @Test (groups = "sub",dataProvider = "SubPositiveDP", priority = 1)
    public void testPositiveSubThree (long a,long b, long expected){
        long result = calculator.sub(a,b);
        Assert.assertEquals(result,expected, "Invalid result sub operation");
    }

    /**
     * Check negative sub case
     */
    @Test (groups = "subN", alwaysRun = true, priority = 2)
    public void testNegativeSubThree (){
        long result = calculator.sub(0,0);
        Assert.assertEquals(result,1, "Invalid result of sub operation");
    }

    /**
     * Check negative sum case
     */
    @Test (groups = "sumN", alwaysRun = true, priority = 2)
    public void testNegativeSum (){
        long result = calculator.sub(0,0);
        Assert.assertEquals(result,-1, "Invalid result of sum operation");
    }

    /**
     * generate data test for sum case
     */
    @DataProvider (name = "SumPositiveDP")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {-10,-10,-20},
                {5,5,10},
                {-10,100,90},
                {0,0,0},
                {10,-100,-90},
        };
    }

    /**
     * generate data test for sub case
     */
    @DataProvider (name = "SubPositiveDP")
    public Object[][] valuesForSub() {
        return new Object[][] {
                {30,20,10},
                {5,5,0},
                {-10,-10,0},
                {0,0,0},
                {-100,100,-200},
                {100,-100,200},
        };
    }
}