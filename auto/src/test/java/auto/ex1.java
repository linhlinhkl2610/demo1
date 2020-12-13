package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {
	public static void main(String[] a) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        get 1 element
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("abc@gmail.com");

//        Get list element
        List<WebElement> lstEmail = driver.findElements(By.className("email"));
        for (int i = 0; i < lstEmail.size(); i++) {
            lstEmail.get(i).sendKeys("mail"+i+"@gmail.com");
        }


}
}
