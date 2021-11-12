package co.com.choucair.certification.utestjulian.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepFourPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("donde se escribe el password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("donde se escribe nuevamente el password para confirmar")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERM_OF_USE = Target.the("donde se chequea que acepta los terminos de uso")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("donde se chequea que acepta las politicas de seguridad y privacidad")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("boton que muestra el mensaje de bienvenida al usuario registrado")
            .located(By.id("laddaBtn"));
}
