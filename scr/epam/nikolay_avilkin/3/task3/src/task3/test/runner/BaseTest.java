package runner;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;


/**
 * Creates a duplicate calculator
 * @author Nick Avilkin
 */
public class BaseTest {
    protected Calculator calculator;

    /**
     * Creates a duplicate calculator
     */
    @BeforeClass()
    public void setUp() {
        System.out.println("Config calculator");
        calculator = new Calculator();
    }
}
