package buoi2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragDrop { // drag-drop
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Thread.sleep(4000);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droptarget = driver.findElement(By.id("droptarget"));


        Actions actions = new Actions(driver) ;
        actions.dragAndDrop(draggable, droptarget).perform();
        Thread.sleep(4000);
        driver.close();
	}
}