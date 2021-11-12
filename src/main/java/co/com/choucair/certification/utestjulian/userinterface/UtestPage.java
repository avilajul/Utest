package co.com.choucair.certification.utestjulian.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("boton que nos muestra el formulario de inscripcion")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}
