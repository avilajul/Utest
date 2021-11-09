package co.com.choucair.certification.utestjulian.stepdefinitions;

import co.com.choucair.certification.utestjulian.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroUsuarioStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Julian enters the Join today option$")
    public void julianEntersTheJoinTodayOption() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage());

    }

    @When("^you fill in the form fields in Step (\\d+)$")
    public void youFillInTheFormFieldsInStep(int arg1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^go to Location$")
    public void goToLocation() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^fill in the fields in Step (\\d+)$")
    public void fillInTheFieldsInStep(int arg1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^target devices$")
    public void targetDevices() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^go to the last step$")
    public void goToTheLastStep() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^complete the configuration$")
    public void completeTheConfiguration() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^julian receives a welcome message to the uTest community$")
    public void julianReceivesAWelcomeMessageToTheUTestCommunity() {
        // Write code here that turns the phrase above into concrete actions

    }
}
