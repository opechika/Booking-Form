package io.equalexperts.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/io/equalexperts/features",
		glue = {"io/equalexperts/hooks", "io/equalexperts/stepDefinition"}
		
		)
public class TestRunner {

}
