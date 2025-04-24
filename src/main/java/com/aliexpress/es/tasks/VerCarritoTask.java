package com.aliexpress.es.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.aliexpress.es.userInterface.CarritoUI.BTN_ABRIR_CARRITO;

public class VerCarritoTask implements Task {

    public VerCarritoTask(){}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_ABRIR_CARRITO)
        );
    }

    public static VerCarritoTask conLosProductos(){
        return new VerCarritoTask();
    }
}
