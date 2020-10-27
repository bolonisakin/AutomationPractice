@registration
Feature: As a user I would like to register into automationpractice.com

  Background: Navigate to Sign Up page
    Given You are on the HomePage "http://automationpractice.com/index.php"
    And I click on Sign in button
    
  Scenario:  As a user I can create an account by filling up all fields
    Given I can see registration page form
    When I write an email address "jrpahygtdi@getnada.com"
    And I click on Create An Account button
    And I choose gender "Mrs"
    And I write my first name "jaya"
    And I write my last name "pardy"
    And I write password "automation123"
    #And I choose date of birth as "23" , "04" , "1990"
    And I sign in to receive newsletter and special offers
    And I check if my first & last name are already written and are correct
    And I write company name "abc company"
    
    And I write my addresses "661 South Carson"
    And I write city name "St.Mount Holly"
    And I choose state "New Jersey"
    And I write postal code "08060"
    And I write mobile phone "202-555-0205"
     And I click on Register button
    Then I can see welcome message  
   
