package buoi2;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ContextMenu { // contextMenu
	public static void main(String[] a) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demos.telerik.com/kendo-ui/menu/context-menu");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//h3[text()='RE: New version of Telerik Trainer'][1]"));
        WebElement elementLable = driver.findElement(By.xpath("//span[contains(text(),'Label')][1]"));
        WebElement elementWork = driver.findElement(By.xpath("//span[contains(text(),'Work')][1]"));

        Actions action = new Actions(driver);
        action.contextClick(element).moveToElement(elementLable).click().moveToElement(elementWork).click().build().perform();
        Thread.sleep(4000);
	}
}