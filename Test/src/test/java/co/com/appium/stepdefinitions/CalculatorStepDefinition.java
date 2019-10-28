package co.com.appium.stepdefinitions;

import co.com.appium.questions.TheResult;
import co.com.appium.task.Calculate;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorStepDefinition {

    Actor mishi = Actor.named("Mishi");

    @Managed(driver = "appium")
    public WebDriver driver;

    @Given("^that I want to make a sum$")
    public void thatIWantToMakeASum() {
        mishi.can(BrowseTheWeb.with(driver));
    }

    @When("^I sum two numbers$")
    public void iSumTwoNumbers() {
        mishi.attemptsTo(Calculate.theApp());
    }

    //Using (.*) allows us to send parameters from the file 'calculate.feature'
    @Then("^I will see that the result is equals to (.*)$")
    public void iWillSeeThatTheResultIsEqualsTo(String result) {
        mishi.should(seeThat(TheResult.is(), equalTo((result))));
    }
}
