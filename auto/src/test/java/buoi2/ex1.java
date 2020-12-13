package buoi2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {
	public static void main(String[] a) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        
        WebElement textbox = driver.findElement(By.xpath("//*[@id=\"user-message\"]"));
        textbox.sendKeys("abc@gmail.com");
        
        WebElement button = driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
        button.click();
        
        WebElement label = driver.findElement(By.id("display"));
        String message = label.getText();
        String font = label.getCssValue("font-family");
        String size = label.getCssValue("font-weight");
        System.out.println(message);
        System.out.println(font);
        System.out.println(size);
	}
}