package LinkedInPageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LinkedInUserProfilePage {
	
	WebDriver driver;
	
	@FindBy(id = "profile-nav-item")
	WebElement UserProfileDropdown;
	
	@FindBy(className = "nav-settings__member-info-container")
	WebElement ClickOnUserProfile;
	
	@FindBy(className = "pv-pcm-progress__toggle-pane")
	WebElement ClickOnOpenToggle;
	
	@FindBy(id = "ember6803")
	WebElement AddEducationButton;
	
	
 public void LinkedInProfile(WebDriver driver)
	
	{
		this.driver = driver;
		
		//This initElements method will create all WebElements
		
		PageFactory.initElements(driver, this);
		
	}
 
 public void ClickUserProfileDropDown()
 {
	 UserProfileDropdown.click();
 }
 
 public void ClickUserProfile()
 {
	 ClickOnUserProfile.click();
 }
 
 public void ClickToggelPane()
 {
	 ClickOnOpenToggle.click();
 }
 
 public void ClickEducationButton()
 {
	 AddEducationButton.click();
 }
 
 public void OpenAddEducationPopUp()
 {
	ClickUserProfileDropDown();
	 ClickUserProfile();
	 ClickToggelPane();
	 ClickEducationButton();
	 
	 
 }



}
