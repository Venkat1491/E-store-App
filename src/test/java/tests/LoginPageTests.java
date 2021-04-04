package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginPageTests extends TestBase{
		
	
	@Test(priority = 06)
	public void verifyLoginPageTitle() {
		
		hp.clickSignInLink();
		
		String expectedLoginPageTitle = "";
		String actualLoginPageTitle = lp.getLoginPageTitle();
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login Page title not matched");
		
		System.out.println("Login Page Title is verified");
	}
	
	@Test(priority=07)
	public void createAccountwithInvalidEmail() {
		
		String exp_CreateAnAccount = "CREATE AN ACCOUNT";
		String act_CreateAnAccount = lp.getCreateAnAccountHeadingText();
		
		Assert.assertEquals(act_CreateAnAccount, exp_CreateAnAccount, "Create An Account text not found");
		
		System.out.println("Create An Account is preesent.....");
		
		lp.setEmailForCreateAnAccount("test.testing");
		lp.clickCreateAnAccountSubmitButton();
		
		System.out.println( " Invalid Email ");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
	}
	
	
	@Test(priority=8)
	
	public void createAnAccountWithValidEmail() {
		
		lp.setEmailForCreateAnAccount("uday.brave1@gmail.com");
		lp.clickCreateAnAccountSubmitButton();
		
		System.out.println("Account is created successfully.........");
	}
	
	@Test(priority=9)
	public void verifyloginwithinvalidCredentials(){
		
		String expectedTitle = "ALREADY REGISTERED?";
		String actualTitle = lp.getPagesubHeadingAlreadyRegistered();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Login Page not found");
		
		System.out.println("Login page is present");
		
		lp.setEmailForLogin("testing.test@gmail.com");
		lp.setPwdForLogin("123456");
		lp.clickSignIn();
		
		System.out.println("Invalid username and Password");
		
	}

	@Test(priority=10)
	public void verifyForgotPasswordLink() throws InterruptedException {
		
		lp.clickForgotPasswordLink();
		System.out.println("Redirected to Forgot Password Page");
		Thread.sleep(3000);
		lp.setEmailForForgotPassword("test.testing@gmail.com");
		
		lp.clickRetrievePassword();
		
		String expectedText = "A confirmation email has been sent to your address: test.Testing@gmail.com";
		String actualText = lp.getSuccessMessageforForgotPassword();
		Assert.assertEquals(actualText, expectedText, "Email sent success message not found");;
		System.out.println("Forgot password email is sent");
	}
	

}

