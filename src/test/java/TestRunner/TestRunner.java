package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		plugin = {"json:target/cucumber.json"},
		features = "Feature"//path of feature file
		,glue={"Step_Definitions"}//package name 
		,tags= {"@Registeration_with_valid_data"}
		
		)
public class TestRunner {

}
