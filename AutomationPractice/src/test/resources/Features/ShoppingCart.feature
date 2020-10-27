Feature: Validate The ShoppingCart



  Background: Navigate to website
   Given You are on the HomePage "http://automationpractice.com/index.php"
   And I click on Sign in button
   When Enter the "jypadi@getnada.com" and "automation123"
   Then Click submit button
   Then User able to see the message "Welcome to your account. Here you can manage all of your personal information and order"
    
   Scenario: As a user I would like to buy new dress
    Given I am on MyAccount details page
    And I click on "Women" button from sub menu
    And I click on following product "Blouse"
    And I can choose "2" quantites
    When I click on Add To Cart button
    Then click on Proceed To CheckOut
    Then click on Proceed To Checkout on Summarypage
    Then enter the text message "TestingTesting" in adrress in text area
    Then click on proceed to checkout on AddressPage 
    Then click the checkbox of term of condition
    Then click on the proceed to checkout on Shipping page
    Then choose "Pay by check" in payment method
    And I click on I Confirm My Order button
    And I can see Shopping-Cart "Order confirmation" form with valid information