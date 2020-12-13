package buoi2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown { // dropdown
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        
        Select select= new Select(driver.findElement(By.id("select-demo")));
        
        select.selectByVisibleText("Monday");
        Thread.sleep(4000);
        select.selectByValue("Thursday");
        Thread.sleep(4000);
        select.selectByIndex(3);
        Thread.sleep(4000);
        
        Select multiSelect = new  Select(driver.findElement(By.id("multi-select")));
        multiSelect.selectByValue("New Jersey");
        multiSelect.selectByValue("Texas");
        multiSelect.selectByValue("Pennsylvania");
        Thread.sleep(4000);
	}
}