package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement text_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement text_password;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement login;
	

	
	public void setUserName(String user)
	{
		text_username.sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
	text_password.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		login.click();
	}
//	
//	@FindBy(xpath="//input[@name='email']")
//	WebElement text_username;
//	
//	@FindBy(xpath="//input[@name='password']")
//	WebElement text_password;
//	
//	@FindBy(xpath="//*[contains(@type,'submit')]")
//	WebElement login;
//	
//
//	
//	public void setUserName(String user)
//	{
//		text_username.sendKeys(user);
//	}
//	
//	public void setPassword(String pass)
//	{
//	text_password.sendKeys(pass);
//	}
//	
//	public void clicklogin()
//	{
//		login.click();
//	}
	
	

}
