package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTests extends TestBase{

	@Test(priority = 01)
	public void verifyHomePage() {
		System.out.println("I am on Homepage");
		String expectedTitle = "My Store";
		String actualTitle = hp.verifyHomePagetitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 02)
	
	public void verifySignInLink() {
		
	System.out.println("Signin link is present");
	
	hp.getStatusOfSignInLink();
	
	hp.clickSignInLink();
	
	}
	
	@Test (priority=03)
	public void verifyContactUsLink() {
		
		System.out.println("ContactUs link is present");
		
		hp.getStatusOfContactUsLink();
		
		hp.clickContactusLink();

	}
	
	@Test(priority=04)
	public void verifySearchFunctionality() {
		
		System.out.println("Search bar is present");
		
		hp.getStatusOfSearchBar();
		hp.verifyValidationofSearchFunctionality();
		hp.clickSearchicon();
		
		String expected = "No results were found for your search \"test\"";
		String actual = hp.getactualText();
		
		Assert.assertEquals(actual, expected,  "Search results not matched");
		
		System.out.println("Search functionality is verified");
	
	}
	@Test(priority=05)
	
	public void verifyCartLink() {
		
		hp.clickCartLink();
		
		System.out.println("CartLink is present");
		
	}
	
  
}
