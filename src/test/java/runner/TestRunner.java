package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Home.feature",
		glue ="stepdefinitions",
		monochrome = true,
		plugin = {"pretty","html:target/Results.html"}
					
		)


public class TestRunner {

	
}
