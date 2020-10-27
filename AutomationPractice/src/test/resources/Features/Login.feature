Feature: Validate The  Appliation

Scenario Outline: Validate The Login Opeation of Automation Practice

Given You are on the HomePage "http://automationpractice.com/index.php"
And I click on Sign in button
Then Enter the "<username>" and "<password>"
Then Click submit button
And User able to see the message "Welcome to your account. Here you can manage all of your personal information and order"

Examples:
|username|password|
| jypadi@getnada.com | automation123|
