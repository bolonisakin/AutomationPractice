package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisrationPage {
	
	WebDriver driver;

	public RegisrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "SubmitCreate")
	public WebElement createAccountButton;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	public WebElement createAnAccount;
	
	@FindBy(id= "id_gender2")
	public WebElement gender;
	
	@FindBy(id="customer_firstname")
	public WebElement firstName;
	
	@FindBy(id="customer_lastname")
	public WebElement lastName;
	
	@FindBy(id="passwd")
	public WebElement passWord;
	
	@FindBy(id="days")
	public WebElement days;
	
	@FindBy(name="months")
	public WebElement months;
	
	@FindBy(id="years")
	public WebElement years;
	
	@FindBy(id="newsletter")
	public WebElement newsLetter;
	
	@FindBy(id="optin")
	public WebElement specialOffer;
	
	@FindBy(name="company")
	public WebElement companyName;
	
	
	@FindBy(name="address1")
	public WebElement addressLine;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(id="id_state")
	public WebElement idState;
	
	@FindBy(id="postcode")
	public WebElement postCode;
	
	@FindBy(id="phone_mobile")
	public WebElement mobilePhone;
	
	@FindBy(id="submitAccount")
	public WebElement register;
	
	@FindBy(xpath = "//p[@class='info-account']")
	WebElement SuccessMessage;
	
	public void isMessage() {
		SuccessMessage.isDisplayed();
	}
	
	public void clickCreateAccountButton() {
		createAccountButton.click();
	}

	public void createAnAccountPage() {
		createAnAccount.isDisplayed();
	}
	public void selectGender() {
		gender.click();
	}
	
	public void enterFirstName(String value) {
		firstName.sendKeys(value);
	}
	
	public void enterLastName(String value) {
		lastName.sendKeys(value);
	}
	
	public void enterPassword(String value) {
		passWord.sendKeys(value);
	}
	
	public void enterDays(String day) {
		days.sendKeys(day);
	}
	
	public void enterMonth(String month) {
		months.sendKeys(month);
	}
	
	public void enterYear(String year) {
		years.sendKeys(year);
	}
	public void clickNewsLetter() {
		newsLetter.click();
	}
	
	public void clickSpecialOffer() {
		specialOffer.click();
	}
	
	public void enterComapny(String name) {
		companyName.sendKeys(name);
	}
	
	public void enterAddress(String name) {
		addressLine.sendKeys(name);
	}
	
	public void enterCity(String name) {
		city.sendKeys(name);
	}
	
	public void enterState(String name) {
		idState.sendKeys(name);
	}
	
	public void enterPostcode(String name) {
		postCode.sendKeys(name);
	}
	
	public void enterMobileNumber(String name) {
		mobilePhone.sendKeys(name);
	}
	
	public void clickRegister() {
		register.click();
	}
}
