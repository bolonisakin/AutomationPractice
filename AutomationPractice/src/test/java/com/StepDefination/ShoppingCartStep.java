package com.StepDefination;

import com.BaseClass.Library;
import com.Pages.LoginPage;
import com.Pages.MainPage;
import com.Pages.ShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStep extends Library {
	ShoppingCartPage shoppingCartPage;
	LoginPage login;
	MainPage mainPage;
	
	@Given("^I am on MyAccount details page$")
	public void i_am_on_myaccount_details_page() throws Throwable {
		logger.info("I am on MyAccount details page");
		login = new LoginPage(driver);
		login.isMessage();
	}

	@And("^I click on \"([^\"]*)\" button from sub menu$")
	public void i_click_on_something_button_from_sub_menu(String strArg1) throws Throwable {
		logger.info("Enter UsernameI click on \"Women\" button from sub menu");
		mainPage = new MainPage(driver);
		if(strArg1.equals("Women")) {
			mainPage.clickSubMenuWomen();
			Thread.sleep(2000);
		} else if(strArg1.equals("T-shirt")) {
			mainPage.clickSubMenuTshirts();
		} else {
			mainPage.clickSubMenuDresses();
		}
	}
	
	@And("^I click on following product \"([^\"]*)\"$")
    public void i_click_on_following_product(String strArg1) throws Throwable {
		logger.info("I click on following product \"Blouse\"");
		shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.clickSelectProduct();
		Thread.sleep(2000);
    }
	
    @And("^I can choose \"([^\"]*)\" quantites$")
    public void i_can_choose_something_quantites(String strArg1) throws Throwable {
    	logger.info("I can choose \"2\" quantites");
        shoppingCartPage.selectQuantity(strArg1);
    }

    
    @When("^I click on Add To Cart button$")
    public void i_click_on_add_to_cart_button() throws Throwable {
    	logger.info("I click on Add To Cart button");
       shoppingCartPage.clickAddToCart();
    }
    
    @Then("^click on Proceed To CheckOut$")
    public void click_on_proceed_to_checkout() throws Throwable {
    	logger.info("click on Proceed To CheckOut");
        shoppingCartPage.clickProceedToCheckOut();
        
    }

    @Then("^click on Proceed To Checkout on Summarypage$")
    public void click_on_proceed_to_checkout_on_summarypage() throws Throwable {
    	logger.info("click on Proceed To Checkout on Summarypage");
        shoppingCartPage.clickSummaryProceedToCheckOut();
    }
    
    @Then("^enter the text message \"([^\"]*)\" in adrress in text area$")
    public void enter_the_text_message_something_in_adrress_in_text_area(String strArg1) throws Throwable {
    	logger.info("enter the text message \"TestingTesting\" in adrress in text area");
    	shoppingCartPage.enterTextArea(strArg1);
        Thread.sleep(2000);
    }
    
   
    @Then("^click the checkbox of term of condition$")
    public void click_the_checkbox_of_term_of_condition() throws Throwable {
    	logger.info("click the checkbox of term of condition");
    	shoppingCartPage.selectTermsofService();
    }
    
    @Then("^click on proceed to checkout on AddressPage$")
    public void click_on_proceed_to_checkout_on_addresspage() throws Throwable {
    	logger.info("click on proceed to checkout on AddressPage");
        shoppingCartPage.clickSubmitProcessAddress();
    }
    
    @Then("^click on the proceed to checkout on Shipping page$")
    public void click_on_the_proceed_to_checkout_on_shipping_page() throws Throwable {
    	logger.info("click on the proceed to checkout on Shipping page");
        shoppingCartPage.clickSubmitProcessCarrier();
    }
    
    @Then("^choose \"([^\"]*)\" in payment method$")
    public void choose_something_in_payment_method(String strArg1) throws Throwable {
    	logger.info("choose \"Pay by check\" in payment method");
    	Thread.sleep(2000);
        shoppingCartPage.clickPayByCheck();
    }
    
    @And("^I click on I Confirm My Order button$")
    public void i_click_on_i_confirm_my_order_button() throws Throwable {
    	logger.info("I click on I Confirm My Order button");
    	Thread.sleep(2000);
        shoppingCartPage.clickConfirmMyOrder();
    }

    @And("^I can see Shopping-Cart \"([^\"]*)\" form with valid information$")
    public void i_can_see_shoppingcart_something_form_with_valid_information(String strArg1) throws Throwable {
    	logger.info("I can see Shopping-Cart \"Order confirmation\" form with valid information");
    	shoppingCartPage.confirmSuccessMessage();
    }

   
}