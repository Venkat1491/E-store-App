package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTests extends TestBase{

	@Test
	public void verifyHomePage() {
		System.out.println("I am on Homepage");
		String expectedTitle = "My Store";
		String actualTitle = hp.verifyHomePagetitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	
	public void verifySignInLink() {
		
	System.out.println("Signin link is present");
	
	hp.getStatusOfSignInLink();
	
	hp.clickSignInLink();
	
	}
	
}
