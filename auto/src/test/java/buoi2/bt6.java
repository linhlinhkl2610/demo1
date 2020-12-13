package buoi2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bt6 {

	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		checkTitle(driver);
		checkLogo(driver);
		checkSearch(driver);
		driver.close();
	}

	// accessibility - return type - function name
	public static void checkLogo(WebDriver driver) {
		WebElement logo = driver.findElement(By.className("logo"));
		if (logo.isDisplayed()) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}

	public static void checkTitle(WebDriver driver) {
		String actualMsg = driver.getTitle();
		System.out.println(driver.getTitle());
		String title = "My Store";

		if (actualMsg.equals(title)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}	
	
	public static void checkSearch(WebDriver driver)
	{
		WebElement tbSearch = driver.findElement(By.className("search_query"));
		if (tbSearch.isDisplayed()) {
			System.out.println("Test Case Passed - Search Textbox displayed ");
		} else {
			System.out.println("Test Case Failed -Search Textbox not display ");
		}
		
		WebElement btSearch = driver.findElement(By.className("button-search"));
		if (btSearch.isDisplayed()) {
			System.out.println("Test Case Passed - Search button displayed ");
		} else {
			System.out.println("Test Case Failed -Search button not display ");
		}
		
		
	}
	
	
}