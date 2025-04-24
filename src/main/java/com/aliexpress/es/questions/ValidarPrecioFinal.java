package com.aliexpress.es.questions;

import com.aliexpress.es.tasks.AbrirProductoTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static com.aliexpress.es.userInterface.CarritoUI.TXT_VALIDAR_PRECIO;
import static com.aliexpress.es.userInterface.CarritoUI.VALIDAR_PRECIO_FINAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarPrecioFinal implements Task {
    String precio = AbrirProductoTask.texto;

    public ValidarPrecioFinal(){}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(VALIDAR_PRECIO_FINAL, isVisible()).forNoMoreThan(60).seconds()
        );

        String lst_validar = VALIDAR_PRECIO_FINAL.resolveFor(actor).getText();

        Assert.assertTrue("El precio no coincide", lst_validar.contains(precio));

    }

    public static ValidarPrecioFinal conElPrecioFinal(){
        return new ValidarPrecioFinal();
    }
}
