package buoi2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bt3 {
	public static void main(String[] a) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        
        WebElement male = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
        if(!male.isSelected())
        {
        	male.click();
        }
        
        WebElement age = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input"));
        if(!age.isSelected())
        {
        	age.click();
        }
        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();  
    
    String actualMsg=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")).getText();
    		String validMsg= "Sex : Male\n" + 
    				"Age group: 0 - 5";

    		if(actualMsg.equals(validMsg)) {
    		        System.out.println("Test Case Passed");
    		    }else{
    		        System.out.println("Test Case Failed");
    		    }
    		    driver.close();
	}
}