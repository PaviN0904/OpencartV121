package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

@Test
public class TC002_LoginTest extends BaseClass {
	
	public void verify_login()
	{
		try {
		HomePage hp = new HomePage(driver);
//		hp.clickHomeLogin();
		
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clicklogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		
		Assert.assertTrue(targetPage);
		
//		Assert.assertEquals(targetPage, true,"login failed");
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}

}
