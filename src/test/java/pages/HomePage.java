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
	
	@FindBy(xpath = "//b[text()=\"Cart\"]")
	
	WebElement CartLink;
	
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
	
	@FindBy(xpath = "//a[text() = \"Contact us\"]")
	
	WebElement Contactus;
	
	public boolean getStatusOfContactUsLink() {
		
		boolean status = Contactus.isDisplayed();
		return status;
	}
	
	
	public void clickContactusLink() {
		
		Contactus.click();
		
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	
	WebElement SearchBar;
	
	public boolean getStatusOfSearchBar() {
		
	boolean status = SearchBar.isDisplayed();
	return status;
	}
	
	public void verifyValidationofSearchFunctionality() {
		
		SearchBar.click();
		SearchBar.sendKeys("test");	
	}
	
	@FindBy(xpath = "//button[@name=\"submit_search\"]")
	
	WebElement Searchicon;
	
	public void clickSearchicon() {
		
		Searchicon.click();
	}
		
	@FindBy(xpath = "//p[contains(text(), 'No results were found for your search')]")

	WebElement actualText;
	
	public String getactualText() {
		
	String title = actualText.getText();
	return title;
	
	}
	
	public void clickCartLink() {
		
		CartLink.click();
		
	}
	
}



