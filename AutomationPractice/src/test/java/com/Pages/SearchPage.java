package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_query_top")
	public WebElement searchQuery;
	
	@FindBy(name = "submit_search")
	public WebElement submitSearch;
	
	 @FindBy(xpath = "//span[@class='heading-counter']")
	  public WebElement searchResultsNumber;
	 
	 @FindBy(xpath= "//span[@class='lighter']")
	 public WebElement containsPhase;
	 
	public void enterSearchQuery(String value) {
		searchQuery.sendKeys(value);
	}
	
	public void clickSubmitSearch() {
		submitSearch.click();
	}
	
	public String returnSearchResultNumber() {
	   return searchResultsNumber.getText();
	}
	
	public String returnContainsPhase() {
		   return containsPhase.getText();
		}
	
}
