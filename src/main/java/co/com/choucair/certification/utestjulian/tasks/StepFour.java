package co.com.choucair.certification.utestjulian.tasks;

import co.com.choucair.certification.utestjulian.userinterface.StepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class StepFour implements Task {
    public static StepFour fillIN() {
        return Tasks.instrumented(StepFour.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue("Choucair2021*").into(StepFourPage.INPUT_PASSWORD),
                Enter.theValue("Choucair2021*").into(StepFourPage.INPUT_CONFIRM_PASSWORD),
                Click.on(StepFourPage.CHECK_TERM_OF_USE),
                Click.on(StepFourPage.CHECK_PRIVACY),
                Click.on(StepFourPage.BUTTON_COMPLETE_SETUP)
        );


    }
}
