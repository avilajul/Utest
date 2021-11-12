package co.com.choucair.certification.utestjulian.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepOnePage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("donde se escribe el nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("donde se escribe el apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("donde se escribe el correo electronico")
            .located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("donde se escribe el mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("donde se escribe el dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("donde se escribe el año del nacimiento")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("donde se escribe el idioma que habla")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("boton que muestra el paso dos del formulario")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
