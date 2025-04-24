package com.aliexpress.es.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.aliexpress.es.userInterface.HomeUI.IPT_BUSCAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductoTask implements Task {

    private String busqueda;

    BuscarProductoTask(String busqueda){
        this.busqueda = busqueda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IPT_BUSCAR, isVisible()).forNoMoreThan(120).seconds(),
                Enter.keyValues(busqueda).into(IPT_BUSCAR).thenHit(Keys.ENTER)
        );
        if(!IPT_BUSCAR.resolveFor(actor).isPresent()){
            //throw new FacturacionInaccesibleException("El formulario es inaccesible, cambiar el correo de uso");
        }
    }

    public static BuscarProductoTask conLaBusqueda(String busqueda){
        return new BuscarProductoTask(busqueda);
    }
}
