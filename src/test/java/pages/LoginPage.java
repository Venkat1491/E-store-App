package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, LoginPage.this);
	
	}
	
    public String getLoginPageTitle() {
    	String PageTitle = driver.getTitle();
        return PageTitle;
	
	}
	
	@FindBy(xpath = "//h3[text()=\"Create an account\"]")
	
	WebElement CreateAnAccount;
	
	public String getCreateAnAccountHeadingText() {
		
		String AccountCreationText = CreateAnAccount.getText();
		return AccountCreationText;
	}
	
	@FindBy(xpath = "//input[@id=\"email_create\"]")
	
	WebElement inputEmailForAccountCreate;
	
	public void setEmailForCreateAnAccount(String email) {
		
		inputEmailForAccountCreate.sendKeys(email);
	}
	
	@FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
	
	WebElement CreateAccountSubmitButton;
	
	public void clickCreateAnAccountSubmitButton() {
		
		CreateAccountSubmitButton.click();
	}
	
	
	@FindBy(xpath = "//h3[text()=\"Already registered?\"]")
	
	WebElement AlreadyRegister;

	public String getPagesubHeadingAlreadyRegistered() {
		
		String title = AlreadyRegister.getText();
		return title;
		
	}
	
	@FindBy(id="email")
	
	WebElement inputEmailForLogin;
	
	public void setEmailForLogin(String email) {
		
	 inputEmailForLogin.sendKeys(email);
	}
	
	@FindBy(id="passwd")
	
	WebElement inputPwdForLogin;
	
	
	public void setPwdForLogin(String Pwd) {
		
		inputPwdForLogin.sendKeys(Pwd);
		
		}
		
	
	@FindBy(id="SubmitLogin")
	
	WebElement SignIn;
	
	public void clickSignIn() {
		
		SignIn.click();
		
	}
	
	@FindBy(xpath = "//a[text()=\"Forgot your password?\"]")
	
	WebElement ForgotPassword;
	
	public void clickForgotPasswordLink() {
		
		ForgotPassword.click();
	}
	
	@FindBy(xpath = "(//input[@name=\"email\"])[1]")
	
	WebElement inputEmailforForgotPassword;
	
	public void setEmailForForgotPassword(String email1) {
		
		inputEmailforForgotPassword.sendKeys(email1);
	}
	
	@FindBy(xpath = "//span[text()=\"Retrieve Password\"]")
	
	WebElement RetrievePassword;
	
	public void clickRetrievePassword() {
		
		RetrievePassword.click();
	}
	
	@FindBy(xpath = "//p[text()=\"A confirmation email has been sent to your address: test.Testing@gmail.com\"]")
	
	WebElement ForgotPasswordSuccessmessage;

	public String getSuccessMessageforForgotPassword() {
			
		String text = ForgotPasswordSuccessmessage.getText();
		return text;
			
		}
		
		
		
	
	
}

