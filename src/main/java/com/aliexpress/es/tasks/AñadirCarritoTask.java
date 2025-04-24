package com.aliexpress.es.tasks;

import com.aliexpress.es.exceptions.SinMasProductosException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.aliexpress.es.userInterface.CarritoUI.BTN_AÑADIR;
import static com.aliexpress.es.userInterface.CarritoUI.BTN_SUMAR;
import static com.aliexpress.es.userInterface.HomeUI.PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AñadirCarritoTask implements Task {

    public AñadirCarritoTask(){}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_AÑADIR, isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(BTN_AÑADIR),
                WaitUntil.the(BTN_SUMAR, isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(BTN_SUMAR),
                JavaScriptClick.on(BTN_SUMAR)
        );
        if(!BTN_SUMAR.resolveFor(actor).isPresent()){
            throw new SinMasProductosException("Solo se puede tener un producto, probar otro producto");
        }
    }

    public static AñadirCarritoTask conElCarrito(){
        return new AñadirCarritoTask();
    }
}
