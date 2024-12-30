package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		
		FileReader file = new FileReader("./src/test/resources/config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().deleteAllCookies();
		  driver.get(p.getProperty("appURL3"));
//		  driver.get("https://www.opencart.com");
		  driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomString()
	{
		String generatedString =RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomNumber()
	{
		String generatedNumber =RandomStringUtils.randomNumeric(5);
		return generatedNumber;
	}
	
	public String randomAlphaNumric()
	{
		String generatedString =RandomStringUtils.randomAlphabetic(5);
		String generatedNumber =RandomStringUtils.randomNumeric(5);
		return (generatedString+"@"+generatedNumber);
	}

}
