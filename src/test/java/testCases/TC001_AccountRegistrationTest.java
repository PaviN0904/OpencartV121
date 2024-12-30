package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationTest;
import pageObjects.BasePage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {

	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
//		Thread.sleep(5000);
		
//		AccountRegistrationTest ac=new AccountRegistrationTest(driver);
//		ac.setUserName(randomString().toUpperCase());
//		ac.setFirstName(randomString().toUpperCase());
//		ac.setlastName(randomString());
//		ac.setEmail(randomString()+"@gmail.com");
//		ac.clickSubmit();	
//		
//		String password=randomAlphaNumric();
		
		
	}
	
	

}
