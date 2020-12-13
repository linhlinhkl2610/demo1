package auto.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver;
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	driver.findElement(By.name("email_create")).sendKeys("kl@gmail.com");
	driver.findElement(By.name("SubmitCreate")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("customer_firstname")).sendKeys("kl@gmail.com");
	driver.findElement(By.id("customer_lastname")).sendKeys("kl@gmail.com");
	driver.findElement(By.id("address1")).sendKeys("kl@gmail.com");
	driver.findElement(By.name("email")).sendKeys("kl@gmail.com");
	driver.findElement(By.name("passwd")).sendKeys("kl@gmail.com");
	driver.findElement(By.id("firstname")).sendKeys("kl@gmail.com");
	driver.findElement(By.id("lastname")).sendKeys("kl@gmail.com");
	driver.findElement(By.id("city")).sendKeys("kl@gmail.com");
	driver.findElement(By.name("postcode")).sendKeys("kl@gmail.com");
	driver.findElement(By.name("phone_mobile")).sendKeys("kl@gmail.com");
	driver.findElement(By.name("alias")).sendKeys("kl@gmail.com");
	
	
	
	}
}
