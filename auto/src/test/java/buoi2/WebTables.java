package buoi2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables { // radio button
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
        
        WebElement table= driver.findElement(By.xpath("//table[@class='table table-hover']"));
        if (table.isDisplayed()) {
        List<WebElement> tHeaders = table.findElements(By.xpath("//thead//th"));
        for (int i=0; i<tHeaders.size();i++)
        {
        	System.out.println(tHeaders.get(i).getText());
        }
        
        List<WebElement> tr = table.findElements(By.xpath("//tbody//tr"));
        for (int i=0; i<tr.size();i++)
        {
        	List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
        	for(int j=0; i<td.size();j++)
        	{
        		System.out.println(td.get(j).getText());
        	}
        }
        }
	}
}