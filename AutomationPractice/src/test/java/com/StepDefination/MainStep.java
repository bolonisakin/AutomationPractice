package com.StepDefination;

import org.testng.Assert;

import com.BaseClass.Library;
import com.Pages.MainPage;
import com.SeleniumReusableFunctions.SeleniumResusability;

import cucumber.api.PendingException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainStep extends Library {
	MainPage mainpage; 
	
	@Before
	public void initializeTest() {
		browserSetUp();
	}

	@After
	public void closeBrowser() {
		logger.info("Take Screen shot of Login Page");
		
		logger.info("Close Browser");
		driver.quit();
	}

	@Given("^You are on the HomePage \"([^\"]*)\"$")
	public void you_are_on_the_homepage_something(String string) throws Throwable {
		logger.info("verify you are on Homepage");
		Assert.assertTrue(string.contains(driver.getCurrentUrl()));
	}


	@When("^I click on Sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		mainpage = new MainPage(driver);
		logger.info("click on Sign in button");
		mainpage.clickSignInButton();
	}

}
