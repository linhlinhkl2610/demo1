package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestFailure(ITestResult result) {
		File src = ((TakesScreenshot)BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D://" + result.getTestClass() +
					"_" + System.currentTimeMillis()+".png"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}
