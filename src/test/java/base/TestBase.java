package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.HomePage;

public class TestBase {
	
	  protected WebDriver driver;
	  protected static HomePage hp;
		
	  @BeforeTest
	   public static void setUp() {
				
	   System.setProperty("webdriver.chrome.driver", "./Browser Drivers/chromedriver.exe");
				
		  	WebDriver driver = new ChromeDriver();
		  	driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			hp = new HomePage(driver);
		}
	  
	  
	// @AfterTest
	 //public void tearDown() {
		
		// System.out.println("Killing the browser");
		 //driver.close();
		 
	 //}
}
