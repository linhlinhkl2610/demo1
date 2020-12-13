package buoi2;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClick { // doubleClick
	public static void main(String[] a) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
        
        WebElement button= driver.findElement(By.xpath("//input[@value='Double Click']"));
        Actions actions = new Actions(driver);
        actions.doubleClick();
        Thread.sleep(4000);
        
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\KhanhLinh\\Desktop\\image1.png"));
	}
}