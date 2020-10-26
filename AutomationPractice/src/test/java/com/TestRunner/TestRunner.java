package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false, 
		features = "src/test/resources/Features/Login.feature", 
		glue = {"com.StepDefinition.Login" }, 
		monochrome = true, 
		plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}