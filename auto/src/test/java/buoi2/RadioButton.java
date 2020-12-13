package buoi2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton { // radio button
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        
        WebElement male = driver.findElement(By.xpath("(//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input)"));
        if(!male.isSelected())
        {
        	male.click();
        }
        Thread.sleep(4000);
        WebElement female = driver.findElement(By.xpath("(//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input)"));
        if(!female.isSelected())
        {
        	female.click();
        }
        Thread.sleep(4000);
        
	}
}