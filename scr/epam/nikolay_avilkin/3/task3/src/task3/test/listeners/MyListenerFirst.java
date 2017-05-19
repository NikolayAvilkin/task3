package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * create listener
 */
public class MyListenerFirst implements IInvokedMethodListener {
    /**
     * data started case
     */
    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("metod started: " + iInvokedMethod.getTestMethod().getMethodName());
    }

    /**
     * data end case
     */
    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("metod finished :"  + iTestResult.getStatus());

    }
}
