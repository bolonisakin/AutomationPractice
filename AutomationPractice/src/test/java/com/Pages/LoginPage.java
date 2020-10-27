package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	WebElement userNameTextBox;

	@FindBy(id="passwd")
	WebElement passwordTextBox;

	@FindBy(xpath= "//a[@Class='login_url']")
	WebElement logInonHomePage; 

	@FindBy(id= "SubmitLogin")
	WebElement SubmitButton; 

	
	@FindBy(xpath = "//p[@class='info-account']")
	WebElement SuccessMessage;

	@FindBy(linkText= "Forgot your password?")
	WebElement foregotPassword;

	public void findUserNameTextBox(String userNameOrEmail) {
		userNameTextBox.sendKeys(userNameOrEmail);
	}

	public void findPasswordTextBox(String password) {
		passwordTextBox.sendKeys(password);
	}

	public void findforegotPassword() {
		foregotPassword.click();
	}

	public void findlogInButtononHomePage() {
		logInonHomePage.click();
	}

	public void findlogInButton() {
		SubmitButton.click();
	}

	public String getSuccessMesage() {
		return SuccessMessage.getText();
	}
	
	public void isMessage() {
		SuccessMessage.isDisplayed();
	}

}
