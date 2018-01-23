package LinkedInPageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "login-email")
	
	WebElement Email;
	
	@FindBy(id = "login-password")
	
	WebElement Password;
	
	@FindBy(id = "login-submit")
	
	WebElement SignInButton;
	
	
	public void LinkedInLogIn(WebDriver driver)
	
	{
		this.driver = driver;
		
		//This initElements method will create all WebElements
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Set Email in textbox
	
	public void setEmail(String strEmail)
	{
		System.out.println(Email);
		/*if(this.driver == null){
			System.out.println("driver is null");
			System.exit(0);
		}
		//this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
		Email.sendKeys(strEmail);
		
	}
	
	//Set password in password textbox
	
	public void setPassword(String strPassword)
	{
		Password.sendKeys(strPassword);
	}
	
	//Click on SignIn button
	
	public void clickSignIn()
	{
		SignInButton.click();
	}
	
	public void SignInToLinkedIn(String strEmail,String strPasword){
		//System.out.println("email"+ strEmail +"passsword"+ strPasword );
        //Fill Email id
		
        this.setEmail(strEmail);

        //Fill Password

        this.setPassword(strPasword);

        //Click SignIn button

        this.clickSignIn();

                

    }

	
	

}
