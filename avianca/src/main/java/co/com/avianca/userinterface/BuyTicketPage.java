<<<<<<< HEAD
package co.com.avianca.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyTicketPage {

    public static final Target BOTTON_COKIES = Target.the("El boton cookies")
            .located(By.xpath("//*[@id=\"cookiePolicy\"]/div/div/div[2]/button"));
    public static final Target TEXT_ORIGIN = Target.the("texto origen")
            .located(By.xpath("(//input[@class='form-control airport pbOrigen airport_ida airport_mvvn'])[2]"));

    public static final Target ORIGIN = Target.the(" primer dato del desplegable origen")
            .located(By.xpath("//li[@class='item itemKeySelected']"));

    public static final Target TEXT_DESTINATION = Target.the("texto destino")
            .located(By.xpath("(//input[@class='form-control airport pbDestino airport_regreso airport_mvvn'])[2]"));

    public static final Target DESTINATION = Target.the("primer dato del desplegable destino")
            .located(By.xpath("(//li[@class='item itemKeySelected'])[2]"));

    public static final Target DEPARTURE_DATE = Target.the("fecha salida")
            .located(By.xpath("(//input[@class='fechas-integradas form-control fecha-integrada-ida fecha-integrada-vuelta x-mvvm'])[1]"));

    public static final Target DEPARTURE_DATE_CLICK = Target.the("click fecha salida")
            .located(By.xpath("(//div[@data-day='2023.7.7'])[1]"));

    public static final Target RETURN_DATE_CLICK = Target.the("fecha regreso")
            .located(By.xpath("(//div[@data-day='2023.7.15'])[1]"));


    public static final Target BUTTON_SEARCH_FLIGHT = Target.the("boton buscar vuelos")
            .located(By.id("iniciaFlujo"));
}
=======
package co.com.avianca.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyTicketPage {

    public static final Target BOTTON_COKIES = Target.the("El boton cookies")
            .located(By.xpath("//*[@id=\"cookiePolicy\"]/div/div/div[2]/button"));
    public static final Target TEXT_ORIGIN = Target.the("texto origen")
            .located(By.xpath("(//input[@class='form-control airport pbOrigen airport_ida airport_mvvn'])[2]"));

    public static final Target ORIGIN = Target.the(" primer dato del desplegable origen")
            .located(By.xpath("//li[@class='item itemKeySelected']"));

    public static final Target TEXT_DESTINATION = Target.the("texto destino")
            .located(By.xpath("(//input[@class='form-control airport pbDestino airport_regreso airport_mvvn'])[2]"));

    public static final Target DESTINATION = Target.the("primer dato del desplegable destino")
            .located(By.xpath("(//li[@class='item itemKeySelected'])[2]"));

    public static final Target DEPARTURE_DATE = Target.the("fecha salida")
            .located(By.xpath("(//input[@class='fechas-integradas form-control fecha-integrada-ida fecha-integrada-vuelta x-mvvm'])[1]"));

    public static final Target DEPARTURE_DATE_CLICK = Target.the("click fecha salida")
            .located(By.xpath("(//div[@data-day='2023.7.7'])[1]"));

    public static final Target RETURN_DATE_CLICK = Target.the("fecha regreso")
            .located(By.xpath("(//div[@data-day='2023.7.15'])[1]"));


    public static final Target BUTTON_SEARCH_FLIGHT = Target.the("boton buscar vuelos")
            .located(By.id("iniciaFlujo"));
}
>>>>>>> 09b51e2ee3e4e47a8cb01dceb33611ab9fe71eb5
