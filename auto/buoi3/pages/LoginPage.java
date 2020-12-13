package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import core.BasePage;

import java.time.Duration;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.NAME, using = "USERNAME")
	private WebElement username;
	@FindBy(how = How.NAME, using = "PASSWORD")
	private WebElement password;
	@FindBy(how = How.XPATH, using = "(//a[text()='Login'])[1]")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//ul[@id='right-nav']//a[contains(text(),' DemoCustomer ')]")
	private WebElement profile;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	private WebElement logout;

	public void navigateToLoginPage(String url) {
		driver.navigate().to(url);
	}

	public void inputUsername(String user_name) {
		getWait().withTimeout(Duration.ofSeconds(10));
		getWait().until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(user_name);
	}

	public void inputPassword(String value) {
		password.sendKeys(value);
	}

	public void clickToLoginButton() {
		loginButton.click();
	}

	public void logout() {
		profile.click();
	        getWait().withTimeout(Duration.ofSeconds(10));
	        getWait().until(ExpectedConditions.visibilityOf(logout));
	        logout.click();
	}

	public boolean verifyProfileMenu() {
		try {
			return profile.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
