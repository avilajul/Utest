package co.com.choucair.certification.utestjulian.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThreePage extends PageObject {


    public static final Target DIV_MOBILE_DEVICE = Target.the("donde se selecciona la lista de marcas dispositivos movil")
            .located(By.name("handsetMakerId"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("donde se escribe el nombre de la marca del dispositivo movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target DIV_MODEL = Target.the("donde selecciona el modelo del dispositivo movil")
            .located(By.name("handsetModelId"));
    public static final Target INPUT_MODEL = Target.the("donde se escribe el modelo del dispositivo movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));


    public static final Target DIV_OPERATING_SYSTEM = Target.the("donde selecciona el nombre del Sistema Operativo")
            .located(By.name("handsetOSId"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("donde se escribe el nombre del Sistema Operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_LAST_STEP = Target.the("boton que muestra el paso cuatro del formulario")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
