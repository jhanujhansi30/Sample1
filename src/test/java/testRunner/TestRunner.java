package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "/Users/pratap/eclipse-workspace/Sample1/feature" }, glue = { "steps" }, format = {
		"pretty", "html: test-output" }

)

public class TestRunner {

}
