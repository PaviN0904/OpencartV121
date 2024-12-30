package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationTest extends BasePage{
	
	public AccountRegistrationTest(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[contains(@name,'username')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'firstname')]")
	WebElement firstname;
	
	@FindBy(xpath="//input[contains(@name,'lastname')]")
	WebElement lastname;
	
	@FindBy(xpath="//input[contains(@name,'email')]")
	WebElement email;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElement submit;
	
	public void setUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setFirstName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setlastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void setEmail(String Eemail)
	{
		email.sendKeys(Eemail);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickSubmit()
	{
		submit.click();
	}
}
