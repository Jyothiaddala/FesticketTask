package testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/Users/Jyothiaddala/Documents/JavaTraining/Festicket/src/main/java/features/login.feature",
		glue = {"stepdefinitions"},
		format = {"pretty","html:test-outout"},
		monochrome = true, 
		strict = true,
		dryRun =false
		)

public class Runnerclass {

}
