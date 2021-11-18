package co.com.choucair.certification.utestjulian.tasks;


import co.com.choucair.certification.utestjulian.userinterface.StepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class StepThree implements Task {
    private  String  strMobilDevice;
    private String strModel;
    private String strOs;

    public StepThree(String strMobilDevice, String strModel, String strOs) {
        this.strMobilDevice = strMobilDevice;
        this.strModel = strModel;
        this.strOs = strOs;
    }

    public static StepThree fillIN(String strMobilDevice, String strModel, String strOs) {
        return Tasks.instrumented(StepThree.class, strMobilDevice, strModel, strOs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(StepThreePage.DIV_MOBILE_DEVICE));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strMobilDevice).into(StepThreePage.INPUT_MOBILE_DEVICE).thenHit(Keys.ENTER));

        actor.attemptsTo(Click.on(StepThreePage.DIV_MODEL));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strModel).into(StepThreePage.INPUT_MODEL).thenHit(Keys.ENTER));

        actor.attemptsTo(Click.on(StepThreePage.DIV_OPERATING_SYSTEM));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Enter.theValue(strOs).into(StepThreePage.INPUT_OPERATING_SYSTEM).thenHit(Keys.ENTER),
                Click.on(StepThreePage.BUTTON_LAST_STEP)
        );

    }
}
