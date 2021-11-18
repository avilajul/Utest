package co.com.choucair.certification.utestjulian.tasks;

import co.com.choucair.certification.utestjulian.userinterface.StepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.openqa.selenium.Keys;

public class StepFour implements Task {
    private  String  strPassword;
    private  String strPaswordConfirm;

    public StepFour(String strPassword, String strPaswordConfirm) {
        this.strPassword = strPassword;
        this.strPaswordConfirm = strPaswordConfirm;
    }

    public static StepFour fillIN(String strPassword, String strPaswordConfirm) {
        return Tasks.instrumented(StepFour.class, strPassword, strPaswordConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*actor.attemptsTo(

                Enter.theValue(strPassword).into(StepFourPage.INPUT_PASSWORD),

                Enter.theValue(strPaswordConfirm).into(StepFourPage.INPUT_CONFIRM_PASSWORD),
                Click.on(StepFourPage.CHECK_TERM_OF_USE),
                Click.on(StepFourPage.CHECK_PRIVACY),
                Click.on(StepFourPage.BUTTON_COMPLETE_SETUP)
        );*/

        actor.attemptsTo(Enter.theValue(strPassword).into(StepFourPage.INPUT_PASSWORD));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strPaswordConfirm).into(StepFourPage.INPUT_CONFIRM_PASSWORD));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(StepFourPage.CHECK_TERM_OF_USE));
        actor.attemptsTo(Click.on(StepFourPage.CHECK_PRIVACY));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(StepFourPage.BUTTON_COMPLETE_SETUP));





    }
}
