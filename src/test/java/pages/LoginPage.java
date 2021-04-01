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
	
	@FindBy(xpath = "//title[text()=\"Login - My Store\"]")
	
	WebElement LoginPageTitle;
	
	@FindBy(xpath = "//h3[text()=\"Create an account\"]")
	
	WebElement CreateAnAccount;
	
	@FindBy(xpath = "//input[@id=\"email_create\"]")
	
	WebElement inputEmailForAccountCreate;
	
	@FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
	
	WebElement CreateAccountSubmitButton;
	
	@FindBy(xpath = "//h3[text()=\"Already registered?\"]")
	
	WebElement AlreadyRegister;
	
	@FindBy(id="email")
	
	WebElement inputEmailForLogin;
	
	@FindBy(id="passwd")
	
	WebElement inputPwdForLogin;
	
	@FindBy(id="SubmitLogin")
	
	WebElement SignIn;
	
	@FindBy(xpath = "//a[text()=\"Forgot your password?\"]")
	
	WebElement ForgotPassword;
	
	@FindBy(xpath = "(//input[@name=\"email\"])[1]")
	
	WebElement inputEmailforForgotPassword;
	
	@FindBy(xpath = "//span[text()=\"Retrieve Password\"]")
	
	WebElement RetrievePassword;
	
	@FindBy(xpath = "//p[text()=\"A confirmation email has been sent to your address: test.Testing@gmail.com\"]")
	
	WebElement ForgotPasswordSuccessmessage;
	
	
	
	public String getLoginPageTitle() {
		
		String PageTitle = LoginPageTitle.getText();
		return PageTitle;
			
	}
	
	public String getCreateAnAccountHeadingText() {
		
		String AccountCreationText = CreateAnAccount.getText();
		return AccountCreationText;
	}
	
	public void setEmailForCreateAnAccount(String email) {
		
		inputEmailForAccountCreate.sendKeys(email);
	}
	
	public void clickCreateAnAccountSubmitButton() {
		
		CreateAccountSubmitButton.click();
	}
	
	
	public String getPagesubHeadingAlreadyRegistered() {
		
		String title = AlreadyRegister.getText();
		return title;
		
	}
	
	public void setEmailForLogin(String email) {
		
	 inputEmailForLogin.sendKeys(email);
	}
	
	public void setPwdForLogin(String Pwd) {
	
	inputPwdForLogin.sendKeys(Pwd);
	
	}
	
	public void clickSignIn() {
		
		SignIn.click();
		
	}
	
	public void clickForgotPasswordLink() {
		
		ForgotPassword.click();
	}
	
	public void setEmailForForgotPassword(String email1) {
		
		inputEmailforForgotPassword.sendKeys(email1);
	}
	
	public void clickRetrievePassword() {
		
		RetrievePassword.click();
	}
	
	public String getSuccessMessageforForgotPassword() {
		
		String text = ForgotPasswordSuccessmessage.getText();
		return text;
		
	}
	
	
	
	
}

