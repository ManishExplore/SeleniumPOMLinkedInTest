package LinkedInTestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class DriverInit
{
	    public WebDriver driver;
	    private static DriverInit driverInit = null;

	    public static DriverInit getInstance()
	    {
	        if (driverInit == null) 
	        {
	            driverInit = new DriverInit();
	        }
	        return driverInit;
	    }

	    private DriverInit()
	    {
	    	System.setProperty("webdriver.chrome.driver", "Macintosh HD/Users/manishmishra/Downloads/Selenium/chromedriver");

	        this.driver = new ChromeDriver();
	        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            this.driver.get("https://www.linkedin.com/");
	    }

	    public WebDriver getDriver() {
	        return this.driver;

}
}
