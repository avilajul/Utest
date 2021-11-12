package co.com.choucair.certification.utestjulian.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage extends PageObject {
    public static final Target LABEL_WELCOME = Target.the("Mensaje de Bienvenida al usuario que completa el registro")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
