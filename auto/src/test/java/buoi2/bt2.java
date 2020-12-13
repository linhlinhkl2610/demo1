package buoi2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bt2 {
	public static void main(String[] a) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        
        WebElement textbox = driver.findElement(By.id("isAgeSelected"));
        if(!textbox.isSelected())
        {
        	textbox.click();
        }
        
    
    String actualMsg=driver.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText();
    		String validMsg= "Success - Check box is checked";

    		if(actualMsg.equals(validMsg)) {
    		        System.out.println("Test Case Passed");
    		    }else{
    		        System.out.println("Test Case Failed");
    		    }
    		    driver.close();
	}
}