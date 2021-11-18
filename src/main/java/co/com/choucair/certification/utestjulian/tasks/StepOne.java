package co.com.choucair.certification.utestjulian.tasks;

import co.com.choucair.certification.utestjulian.userinterface.StepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


public class StepOne implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strLanguage;

    public StepOne(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strLanguage) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strLanguage = strLanguage;
    }

    public static StepOne fillOut( String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strLanguage) {
        return Tasks.instrumented(StepOne.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear, strLanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(StepOnePage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(StepOnePage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(StepOnePage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(strBirthMonth).from(StepOnePage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(StepOnePage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(StepOnePage.SELECT_BIRTH_YEAR),
                Enter.theValue(strLanguage).into(StepOnePage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(StepOnePage.BUTTON_NEXT_LOCATION)
        );

    }
}
