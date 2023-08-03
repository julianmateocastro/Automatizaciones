package co.com.avianca.stepsdefinitions;

import co.com.avianca.task.BuyTicketTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class BuyTicketStepdefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }
    @Given("^se ingresa a la pagina$")
    public void seIngresaALaPagina() {
     OnStage.theActorInTheSpotlight().wasAbleTo(
             Open.url("https://www.avianca.com/co/es/")
     );
    }

    @When("^se completan los campos para posteriormente realizar la busqueda de los vuelos$")
    public void seCompletanLosCamposParaPosteriormenteRealizarLaBusquedaDeLosVuelos() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                BuyTicketTask.start()
        );
    }

    @And("^se deben validar cada uno de los precios para seleccionar el vuelo mas economico de salida$")
    public void seDebenValidarCadaUnoDeLosPreciosParaSeleccionarElVueloMasEconomicoDeSalida() {
    }

    @And("^se realiza la seleccion del paquete mas economico salida$")
    public void seRealizaLaSeleccionDelPaqueteMasEconomicoSalida() {
    }

    @And("^se deben validar cada uno de los precios para seleccionar el vuelo mas economico de regreso$")
    public void seDebenValidarCadaUnoDeLosPreciosParaSeleccionarElVueloMasEconomicoDeRegreso() {
    }

    @And("^se realiza la seleccion del paquete mas economico regreso$")
    public void seRealizaLaSeleccionDelPaqueteMasEconomicoRegreso() {
    }

    @Then("^se valida que el precio final sea el esperado$")
    public void seValidaQueElPrecioFinalSeaElEsperado() {
    }
}
