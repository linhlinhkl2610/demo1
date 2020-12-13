package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	private  static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		if(null != driver) {
			driver.close();
			driver.quit();
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
