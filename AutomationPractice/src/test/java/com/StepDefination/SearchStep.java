package com.StepDefination;

import org.testng.Assert;

import com.BaseClass.Library;
import com.Pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep extends Library {
	SearchPage searchPage;

	@When("^I search for phrase \"([^\"]*)\"$")
	public void i_search_for_phrase( String strArg1) throws Throwable {
		logger.info("I search for phrase "  + strArg1);
		searchPage = new SearchPage(driver);
		searchPage.enterSearchQuery(strArg1);
		
	}

	@And("^I click on search icon$")
	public void i_click_on_search_icon() throws Throwable {
		logger.info("I click on search icon");
		searchPage.clickSubmitSearch();
	}
	
	@Then("^I can see numbers of results equals to \"([^\"]*)\"$")
	public void i_can_see_numbers_of_results_equals_to(String strArg1) throws Throwable {
		logger.info("I can see numbers of results equals to " + strArg1);
		String value = searchPage.returnSearchResultNumber();
		Assert.assertTrue(value.contains(strArg1));
	}

	@And("^I can see that every results which have been found contains phrase \"([^\"]*)\"$")
	public void i_can_see_that_every_results_which_have_been_found_contains_phrase(String strArg1) throws Throwable {
		logger.info("I can see that every results which have been found contains phrase " + strArg1);
		Thread.sleep(2000);
		String value = searchPage.returnContainsPhase();
		Assert.assertTrue(value.toLowerCase().contains(strArg1.toLowerCase()));
	}
}
