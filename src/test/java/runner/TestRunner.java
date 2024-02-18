package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Array.feature",
		tags="@tag5",
		glue ={"stepdefinitions","myhooks"},
		//glue ="stepdefinitions",
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","html:target/Results.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		//dryRun=true
					
		)
	

public class TestRunner extends AbstractTestNGCucumberTests{

	
}
