package listners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.relevantcodes.extentreports.ExtentReports;

import testbase.base;



/**
 * @author Niharika
 *
 * 
 */
public class listners  implements ITestListener{

testbase.base b = new testbase.base();
private static ExtentReports extent;

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult result) {

	/* for (String s : Reporter.getOutput()) { 
		    extent.setTestRunnerOutput(s);
		    Reporter.log( "throw new NoSuchElementException", false );	  
	 } */
	// TODO Auto-generated method stub
	b.getScreenshot(result.getName());
	
	
	//b.takeScreenShot(result.getName());
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}