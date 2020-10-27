### selenium-cucumber-java

This repository contains a collection of sample `selenium-cucumber-java` projects and libraries that demonstrate how to use the tool and develop automation script using the Cucumber (v 4.8.1) BDD framework with Java as programming language. It generate CucumberReports, ExtentReports HTML and JSON reporters as well.

### Installation (pre-requisites)
1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. Eclipse
4. Eclipse Plugins for
    - Maven
    - Cucumber

### Framework set up
Fork / Clone repository from [here](https://github.com/bolonisakin/AutomationPractice) or download zip and set it up in your local workspace.

### Run Some Sample Tests
Open terminal (MAC OSX) or command prompt / power shell (for windows OS) and navigate to the project directory
type `mvn clean test` command to run features. With this command it will invoke the default Chrome browser and will execute the tests.

- To run features on specific browser use, 
You need to change the value of the browser in configfile(src\test\resources\ConfigProperties\config.properties)

- Report No need to use the external drivers for this.

- To run specific feature if you have multiple feature files use, You need to change value of the features in TestRunner.java file.


### Reporters
Once you ran your tests you can generate the various types of reports. This framework `selenium-cucumber-java` uses several different types of test reporters to communicate pass/failure.

##### Extent and Cucumber Reports:
You can generate a report using one of the following method.
- Right click on the project -> Run As -> maven build -> clean install -> Run

Both Reports will be generated into target\cucumber-reports\advanced-reports. Web server with results will start appearing in your default browser. Report will look like this

![ScreenShot](https://github.com/bolonisakin/AutomationPractice/blob/master/AutomationPractice%20Project%20Cucumber%20Report.png)

![ScreenShot](https://github.com/bolonisakin/AutomationPractice/blob/master/AutomationPractice%20Project%20Extent%20Report.png)

### Develop automation scripts using BDD approach - Cucumber-Java

Tests are written in the Cucumber framework using the Gherkin Syntax. More about Gherkin & Cucumber can be found at https://cucumber.io/docs/reference A typical test will look similar to this:

```
      Feature: Validate The  Application

      Scenario Outline: Validate The Login Opeation of Automation Practice

      Given You are on the HomePage "http://automationpractice.com/index.php"
      And I click on Sign in button
      Then Enter the "<username>" and "<password>"
      Then Click submit button
      And User able to see the message "Welcome to your account. Here you can manage all of your personal information and order"

      Examples:
      |username|password|
      | jypadi@getnada.com | automation123|

```
### Test Coverage inside in the Automation Framework
- Account creation 
- Log in
- Browsing the store’s main categories (Women, Dresses, T-shirts) (Partly covered in shopping cart) 
- Searching for clothing items 
- Shopping cart 
- Checkout (covered in shopping cart)


### what I would do differently if I had more time? 
- I will add more reusable functions like utilities, waits and listeners to the code
- I will set the framework to take screenshots of steps that fail during test execution
- I will add negative test scenarios for the feature files 
- I will proofread all my documents to make sure there are no typos and all reads correctly


