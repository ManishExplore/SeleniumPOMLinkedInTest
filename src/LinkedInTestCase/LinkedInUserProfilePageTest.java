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


public class LinkedInUserProfilePageTest {
	
public WebDriver driver;
	
	//sWebDriver driver;
	
	LinkedInLoginPage objlogin = new LinkedInLoginPage();
	
	LinkedInUserProfilePage objprofile = new LinkedInUserProfilePage();
	
 @Test(priority=0)
	
	public void verifyAddEductionPopUp() throws Exception
	
	{
	
		objlogin = new LinkedInLoginPage();
		WebDriver driver = DriverInit.getInstance().getDriver();
		PageFactory.initElements(driver, objlogin);
		objlogin.SignInToLinkedIn("chandrmonu666@gmail.com","manish666");
		objprofile.OpenAddEducationPopUp();
	}

}
