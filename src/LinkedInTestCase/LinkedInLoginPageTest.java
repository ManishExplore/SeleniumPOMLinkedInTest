package LinkedInTestCase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import LinkedInPageFactory.LinkedInUserProfilePage;
import LinkedInPageFactory.LinkedInLoginPage;


public class LinkedInLoginPageTest {
	
	public WebDriver driver;
	
	//sWebDriver driver;
	
	LinkedInLoginPage objlogin = new LinkedInLoginPage();
	
	LinkedInUserProfilePage objprofile = new LinkedInUserProfilePage();
	
	/*@BeforeTest

    public void setup(){
		System.setProperty("webdriver.gecko.driver", "/home/manishmishra/Downloads/gecodriver/geckodriver");

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.linkedin.com/");

    } */
	
	@Test(priority=0)
	
	public void verifyLinkedInLogin() throws Exception
	
	{
	
		objlogin = new LinkedInLoginPage();
		WebDriver driver = DriverInit.getInstance().getDriver();
		PageFactory.initElements(driver, objlogin);
		objlogin.SignInToLinkedIn("chandrmonu666@gmail.com","manish666");
	}

}
