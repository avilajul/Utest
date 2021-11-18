package co.com.choucair.certification.utestjulian.stepdefinitions;

import co.com.choucair.certification.utestjulian.model.UtestData;
import co.com.choucair.certification.utestjulian.questions.Answer;
import co.com.choucair.certification.utestjulian.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistroUsuarioStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Julian enters the Join today option$")
    public void julianEntersTheJoinTodayOption() throws Exception {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(), (SignUp.onThePage()));
    }

    @When("^he fill in the form fields in Step one$")
    public void heFillInTheFormFieldsInStepOne(List<UtestData> ustestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(StepOne.fillOut(ustestData.get(0).getStrFirstName(),
                 ustestData.get(0).getStrLastName(), ustestData.get(0).getStrEmail(),
                ustestData.get(0).getStrBirthMonth(), ustestData.get(0).getStrBirthDay(), ustestData.get(0).getStrBirthYear(), ustestData.get(0).getStrLanguage()));
    }

    @When("^he fill in the fields in Step two$")
    public void heFillInTheFieldsInStepTwo(List<UtestData> ustestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(StepTwo.fillIN(ustestData.get(0).getStrCity(), ustestData.get(0).getStrZip()));
    }

    @When("^he fill in the fields in Step three$")
    public void heFillInTheFieldsInStepThree(List<UtestData> ustestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(StepThree.fillIN(ustestData.get(0).getStrMobilDevice(),
                ustestData.get(0).getStrModel(), ustestData.get(0).getStrOs()));
    }

    @When("^he fill in the fields in Step four$")
    public void heFillInTheFieldsInStepFour(List<UtestData> ustestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(StepFour.fillIN(ustestData.get(0).getStrPassword(), ustestData.get(0).getStrPaswordConfirm()));
    }

    @Then("^julian receives a welcome message to the uTest community$")
    public void julianReceivesAWelcomeMessageToTheUTestCommunity(List<UtestData> ustestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(ustestData.get(0).getStrMessage())));
    }
}
