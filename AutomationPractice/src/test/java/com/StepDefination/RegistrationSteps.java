package com.StepDefination;

import org.testng.Assert;

import com.BaseClass.Library;
import com.Pages.AuthenticationPage;
import com.Pages.RegisrationPage;

import cucumber.api.PendingException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegistrationSteps extends Library{
	
    RegisrationPage registration;
	AuthenticationPage authentication;
	  
    @When("^I write an email address \"([^\"]*)\"$")
    public void i_write_an_email_address_something(String strArg1) throws Throwable {
        authentication = new AuthenticationPage(driver);
        authentication.enterUserEmail(strArg1);
    }
    
    @Given("^I can see registration page form$")
    public void i_can_see_registration_page_form() throws Throwable {
    	registration = new RegisrationPage(driver);
    	registration.createAnAccountPage();
    }
    
    @And("^I click on Create An Account button$")
    public void i_click_on_create_an_account_button() throws Throwable {
       
       registration.clickCreateAccountButton();
    }

    @And("^I choose gender \"([^\"]*)\"$")
    public void i_choose_gender_something(String strArg1) throws Throwable {
        registration.selectGender();
    }

    @And("^I write my first name \"([^\"]*)\"$")
    public void i_write_my_first_name_something(String strArg1) throws Throwable {
        registration.enterFirstName(strArg1);
    }

    @And("^I write my last name \"([^\"]*)\"$")
    public void i_write_my_last_name_something(String strArg1) throws Throwable {
    	registration.enterLastName(strArg1);
    }
    
    @And("^I write password \"([^\"]*)\"$")
    public void i_write_password_something(String strArg1) throws Throwable {
        registration.enterPassword(strArg1);
    }

   
    @And("^I choose date of birth as \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void i_choose_date_of_birth_as(String day, String month, String year) throws Throwable {
    	registration.enterDays(day);
        Thread.sleep(2000);
        registration.enterMonth(month);
        registration.enterYear(year);
    }

    @And("^I sign in to receive newsletter and special offers$")
    public void i_sign_in_to_receive_newsletter_and_special_offers() throws Throwable {
        registration.clickNewsLetter();
    }

    @And("^I check if my first & last name are already written and are correct$")
    public void i_check_if_my_first_last_name_are_already_written_and_are_correct() throws Throwable {
       registration.clickSpecialOffer();
    }

    @And("^I write company name \"([^\"]*)\"$")
    public void i_write_company_name_something(String strArg1) throws Throwable {
    	registration.enterComapny(strArg1);
    }
    
    @And("^I write my addresses \"([^\"]*)\"$")
    public void i_write_my_addresses_something(String strArg1) throws Throwable {
       registration.enterAddress(strArg1);
    }


    @And("^I write city name \"([^\"]*)\"$")
    public void i_write_city_name(String strArg1) throws Throwable {
        registration.enterCity(strArg1);
        Thread.sleep(1000);
    }
    
    @And("^I choose state \"([^\"]*)\"$")
    public void i_choose_state_something(String strArg1) throws Throwable {
        registration.enterState(strArg1);
    }

    @And("^I write postal code \"([^\"]*)\"$")
    public void i_write_postal_code_something(String strArg1) throws Throwable {
        registration.enterPostcode(strArg1);
    }

    
    @And("^I write mobile phone \"([^\"]*)\"$")
    public void i_write_mobile_phone_something(String strArg1) throws Throwable {
        registration.enterMobileNumber(strArg1);
    }
    
    @And("^I click on Register button$")
    public void i_click_on_register_button() throws Throwable {
        registration.clickRegister();
        Thread.sleep(2000);
    }
    
    
    @Then("^I can see welcome message$")
    public void i_can_see_welcome_message() throws Throwable {
    	registration.isMessage();
    }

}
