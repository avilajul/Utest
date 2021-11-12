package co.com.choucair.certification.utestjulian.stepdefinitions;

import co.com.choucair.certification.utestjulian.questions.Answer;
import co.com.choucair.certification.utestjulian.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroUsuarioStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Julian enters the Join today option$")
    public void julianEntersTheJoinTodayOption() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(), (SignUp.onThePage()));
    }

    @When("^he fill in the form fields in Step one$")
    public void heFillInTheFormFieldsInStepOne() {
        OnStage.theActorInTheSpotlight().attemptsTo(StepOne.fillOut());
    }

    @When("^he fill in the fields in Step two$")
    public void heFillInTheFieldsInStepTwo() {
        OnStage.theActorInTheSpotlight().attemptsTo(StepTwo.fillIN());
    }

    @When("^he fill in the fields in Step three$")
    public void heFillInTheFieldsInStepThree() {
        OnStage.theActorInTheSpotlight().attemptsTo(StepThree.fillIN());
    }

    @When("^he fill in the fields in Step four$")
    public void heFillInTheFieldsInStepFour() {
        OnStage.theActorInTheSpotlight().attemptsTo(StepFour.fillIN());
    }

    @Then("^julian receives a welcome message to the uTest community (.*)$")
    public void julianReceivesAWelcomeMessageToTheUTestCommunity(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
