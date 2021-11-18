package co.com.choucair.certification.utestjulian.tasks;

import co.com.choucair.certification.utestjulian.userinterface.StepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class StepTwo implements Task {
    private String strCity;
    private String  strZip;

    public StepTwo(String strCity, String strZip) {
        this.strCity = strCity;
        this.strZip = strZip;
    }

    public static StepTwo fillIN(String strCity, String strZip) {

        return Tasks.instrumented(StepTwo.class, strCity, strZip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(StepTwoPage.INPUT_CITY));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(StepTwoPage.INPUT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(StepTwoPage.INPUT_CITY));
        actor.attemptsTo(
                Enter.theValue(strZip).into(StepTwoPage.INPUT_ZIP),
                Click.on(StepTwoPage.BUTTON_NEXT_DEVICES)
        );

    }
}
