package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Feature\\Demo1.feature",glue= {"StepDef"},plugin={"html:target/cucumber.html"})
public class Runner {

}
