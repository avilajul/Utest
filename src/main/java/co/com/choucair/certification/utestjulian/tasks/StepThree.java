package co.com.choucair.certification.utestjulian.tasks;


import co.com.choucair.certification.utestjulian.userinterface.StepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class StepThree implements Task {
    public static StepThree fillIN() {
        return Tasks.instrumented(StepThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(StepThreePage.DIV_MOBILE_DEVICE));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue("Motorola").into(StepThreePage.INPUT_MOBILE_DEVICE).thenHit(Keys.ENTER));

        actor.attemptsTo(Click.on(StepThreePage.DIV_MODEL));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue("Moto E7 Plus").into(StepThreePage.INPUT_MODEL).thenHit(Keys.ENTER));

        actor.attemptsTo(Click.on(StepThreePage.DIV_OPERATING_SYSTEM));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Enter.theValue("Android 10").into(StepThreePage.INPUT_OPERATING_SYSTEM).thenHit(Keys.ENTER),
                Click.on(StepThreePage.BUTTON_LAST_STEP)
        );

    }
}
