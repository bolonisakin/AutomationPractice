package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	WebElement userNameTextBox;
	
	@FindBy(xpath="//a[@class='product-name' and contains(text() , 'Blouse')]")
	WebElement selectProduct;
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	@FindBy(xpath= "//p[@id='add_to_cart']/button")
	WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	WebElement summaryProceedToCheckOut;
	
	@FindBy(xpath="//div[@id='ordermsg']/textarea")
	WebElement textArea;
	
	@FindBy(name = "processAddress")
	WebElement submitProcessAddress;
	
	@FindBy(name = "processCarrier")
	WebElement submitProcessCarrier;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement termsOfService;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	WebElement payByCheck;
	
	@FindBy(xpath="(//button[@type='submit']/span)[2]")
	WebElement confirmMyOrder;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	WebElement successMessage;
	
	 public void clickSelectProduct() {
		 selectProduct.click();
	 }
	 
	 public void selectQuantity(String quan) {
		 quantity.clear();
		 quantity.sendKeys(quan);
	 }
	 
	 public void clickAddToCart() {
		 addToCart.click();
	 }
	 
	 public void clickProceedToCheckOut() {
		 proceedToCheckOut.click();
	 }
	 
	 public void clickSummaryProceedToCheckOut() {
		 summaryProceedToCheckOut.click();
	 }
	 
	 public void enterTextArea(String text) {
		 textArea.sendKeys(text);
	 }
	 
	 public void clickSubmitProcessAddress() {
		 submitProcessAddress.click();
	 }
	 
	 public void selectTermsofService() {
		 termsOfService.click();
	 }
	 
	 public void clickSubmitProcessCarrier() {
		 submitProcessCarrier.click();
	 }
	 
	 public void clickPayByCheck() {
		 payByCheck.click();
	 }
	 
	 public void clickConfirmMyOrder() {
		 confirmMyOrder.click();
	 }
	 
	 public void confirmSuccessMessage() {
		 successMessage.isDisplayed();
	 }
}
