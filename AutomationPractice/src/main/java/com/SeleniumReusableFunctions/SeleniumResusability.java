package com.SeleniumReusableFunctions;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Library;

public class SeleniumResusability extends Library{

	WebDriver driver ;
	
	public SeleniumResusability(WebDriver driver){
		this.driver =driver;

	}

	public String getCurrentURL() {
    	return driver.getCurrentUrl();
    }

	public String getTitle() {
		return  driver.getTitle();
	}
}
