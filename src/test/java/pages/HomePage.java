package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver ;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, HomePage.this);
		
	}

	@FindBy(xpath = "//title[text()= 'My Store']")
	
	WebElement title;
	
	public String verifyHomePagetitle() {
		
		String title = driver.getTitle();
		return title;
	}
	
	@FindBy(xpath = "//a[contains(text(),\"Sign in\")]")
	
	WebElement SignInLink;
	
	public boolean getStatusOfSignInLink() {
		
		boolean status = SignInLink.isDisplayed();
		return status;
		
	}
	
	public void clickSignInLink() {
		
		SignInLink.click();
	}
}
