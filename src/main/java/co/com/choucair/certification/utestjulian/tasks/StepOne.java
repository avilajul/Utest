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
    public static StepOne fillOut() {
        return Tasks.instrumented(StepOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Julian Eduardo").into(StepOnePage.INPUT_FIRST_NAME),
                Enter.theValue("Avila Tascon").into(StepOnePage.INPUT_LAST_NAME),
                Enter.theValue("julian326avila@hotmail.com").into(StepOnePage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("March").from(StepOnePage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("26").from(StepOnePage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText("1984").from(StepOnePage.SELECT_BIRTH_YEAR),
                Enter.theValue("Spanish").into(StepOnePage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(StepOnePage.BUTTON_NEXT_LOCATION)
        );

    }
}
