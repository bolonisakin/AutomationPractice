package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
	WebDriver driver;

	public AuthenticationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email_create")
	public WebElement userEmail;
	
	@FindBy(id = "SubmitCreate")
    public WebElement createAccount;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	public WebElement authenticationConfirm;

	public void enterUserEmail(String value) {
		userEmail.sendKeys(value);
	}
	
	public void clickCreateAccount() {
		createAccount.click();
	}
	
	public void ConfirmAuthenticationPage() {
		 authenticationConfirm.isDisplayed();
	}

}
