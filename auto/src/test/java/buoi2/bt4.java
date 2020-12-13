package buoi2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bt4 {
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        
        Select select= new Select(driver.findElement(By.id("select-demo")));
        select.selectByVisibleText("Monday");
        Thread.sleep(4000);
        String actualMsg=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]")).getText();
		String validMsg= "Day selected :- Monday";

		if(actualMsg.equals(validMsg)) {
		        System.out.println("Test Case Passed");
		    }else{
		        System.out.println("Test Case Failed");
		    }
		    driver.close();
       
	}
}