package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.BaseTest;
import core.ExcelUtils;
import pages.LoginPage;

@Listeners({core.TestListener.class})
public class LoginPageTest extends BaseTest {
	@Test(dataProvider = "test-data")
	public void loginTest(String username, String password)
	{
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.navigateToLoginPage("https://ce.scipioerp.com/majorleague/control/checkLogin/main");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickToLoginButton();
		
		if(loginPage.verifyProfileMenu())
		{
			loginPage.logout();
		}
	}
	
	@DataProvider(name = "test-data")
	public Object[][] getData() throws Exception
	{
		return ExcelUtils.getTableArray("C:\\Users\\KhanhLinh\\Desktop\\DOCUM\\data.xlsx", "Login", 2, 2);
	}
}
