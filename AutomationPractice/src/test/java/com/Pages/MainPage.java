package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class MainPage{
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signInButton;

	
	@FindBy(xpath = "//li//a[@title='Women' and not(img)]")
    public WebElement subMenuWomen;

    @FindBy(xpath = "(//li//a[@title='Dresses' and not(img)])[2]")
    public WebElement subMenuDresses;

    @FindBy(xpath = "(//li//a[@title='T-shirts' and not(img)])[2]")
    public WebElement subMenuTshirts;
    
    public void clickSignInButton() {
		signInButton.click();
	}
    
    public void clickSubMenuWomen() {
    	subMenuWomen.click();
    }
    
    public void clickSubMenuDresses() {
    	subMenuDresses.click();
    }
    
    public void clickSubMenuTshirts() {
    	subMenuTshirts.click();
    }

}
