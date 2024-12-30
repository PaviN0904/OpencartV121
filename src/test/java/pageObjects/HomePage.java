package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(@class,'btn btn-black navbar-btn')]")
	WebElement register;
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement myAccount;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-link navbar-btn')]")
	WebElement login;
	
	public void clickRegister()
	{
		register.click();
	}
	public void clickAccount()
	{
		myAccount.click();
	}
	
	public void clickHomeLogin()
	{
		login.click();
	}


}
