package buoi2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ex8 { // scroll
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(4000);
        
        
        WebElement button = driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        // tra ve document
        WebElement text = (WebElement) js.executeScript("return document.getElementById(\"user-message\")");
        text.sendKeys("23123344");

        // scroll down
         js.executeAsyncScript("arguments[0].scrollIntoView();",button);
        Thread.sleep(4000);
	}
}