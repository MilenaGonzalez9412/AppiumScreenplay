package co.com.appium.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//This method allow us to generate the methods that are going to tell us what we are going to do, based on the file
//calculate.feature
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.appium.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Calculator {
}
