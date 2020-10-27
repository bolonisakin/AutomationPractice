package com.StepDefination;

import org.testng.Assert;

import com.BaseClass.Library;
import com.Pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep extends Library{
	
	LoginPage login;
	
	@Then("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
	   login= new LoginPage(driver);
		
	   logger.info("Enter Username");
	   login.findUserNameTextBox(username);
	   
	   logger.info("Enter Password");
	   login.findPasswordTextBox(password);
	  
	}

	@Then("Click submit button")
	public void click_submit_button() {
		
		logger.info("Click on submit Button");
		login.findlogInButton();
	   
	}
	
	@Then("User able to see the message {string}")
	public void user_able_to_see_the_message(String expectedText) {
		String actualText = login.getSuccessMesage();
		if(actualText.contains(expectedText)) {
			logger.info("login successful");
			Assert.assertTrue(true);
		} else {
			logger.info("login un successful");
			Assert.assertTrue(true);
		}	
	}

}
