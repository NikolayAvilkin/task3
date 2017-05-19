package runner;


import listeners.MyListenerFirst;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;


import java.util.ArrayList;
import java.util.List;

/**
 * Introduction to Java for Automated. Course 3.
 * @author Nick Avilkin
 */
public class TestRunner {

    /**
     * Module 3.
     * @param  args run option of String
     */
    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();
        tng.addListener(tla);
        tng.addListener(new MyListenerFirst());
        XmlSuite suite = new XmlSuite();
        suite.setName("PrimarySuite");
        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/task3/test/resources/CalculatorOperation.xml");
            add("./src/task3/test/resources/NegativeOperarion.xml");
            add("./src/task3/test/resources/Errorcheck1.xml");
        }});
        suite.setSuiteFiles(files);
        suite.setThreadCount(3);
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);
        tng.run();
    }
}

