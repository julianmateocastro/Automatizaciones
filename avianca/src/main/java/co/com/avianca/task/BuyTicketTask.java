package co.com.avianca.task;

import co.com.avianca.userinterface.BuyTicketPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class BuyTicketTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BuyTicketPage.BOTTON_COKIES),
                Enter.theValue("Medellin").into(BuyTicketPage.TEXT_ORIGIN),
                Click.on(BuyTicketPage.ORIGIN),
                Enter.theValue("San").into(BuyTicketPage.TEXT_DESTINATION),
                Click.on(BuyTicketPage.DESTINATION),
                Click.on(BuyTicketPage.DEPARTURE_DATE),
                JavaScriptClick.on(BuyTicketPage.DEPARTURE_DATE_CLICK),
                JavaScriptClick.on(BuyTicketPage.RETURN_DATE_CLICK),
                Click.on(BuyTicketPage.BUTTON_SEARCH_FLIGHT)
                 );
      if(BuyTicketPage.BOTTON_COKIES.isVisibleFor(actor)){
            System.out.println("es visible");
        }else {
            System.out.println("no es visible");
        }

    }


    public static BuyTicketTask start() {
        return Tasks.instrumented(BuyTicketTask.class);
    }
}
