package co.com.choucair.certification.utestjulian.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class StepTwoPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("donde se escribe el nombre de la ciudad")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("donde se escribe el codigo postal")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("boton que muestra el paso tres del formulario")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
