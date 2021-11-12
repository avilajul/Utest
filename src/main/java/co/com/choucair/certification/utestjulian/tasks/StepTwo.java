package co.com.choucair.certification.utestjulian.tasks;

import co.com.choucair.certification.utestjulian.userinterface.StepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class StepTwo implements Task {

    public static StepTwo fillIN() {
        return Tasks.instrumented(StepTwo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Tulua, Valle del Cauca, Colombia").into(StepTwoPage.INPUT_CITY));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(StepTwoPage.INPUT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(StepTwoPage.INPUT_CITY));
        actor.attemptsTo(
                Enter.theValue("763022").into(StepTwoPage.INPUT_ZIP),
                Click.on(StepTwoPage.BUTTON_NEXT_DEVICES)
        );

    }
}
