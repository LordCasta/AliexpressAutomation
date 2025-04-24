package com.aliexpress.es.questions;

import com.aliexpress.es.tasks.AbrirProductoTask;
import com.aliexpress.es.userInterface.CarritoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static com.aliexpress.es.userInterface.CarritoUI.TXT_VALIDAR_PRECIO;
import static com.aliexpress.es.userInterface.HomeUI.PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarPrecio implements Task {
    String precio = AbrirProductoTask.texto;

    public ValidarPrecio(){}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_VALIDAR_PRECIO, isVisible()).forNoMoreThan(60).seconds()
        );

        String lst_validar = TXT_VALIDAR_PRECIO.resolveFor(actor).getText();

        Assert.assertTrue("El precio no coincide", lst_validar.contains(precio));

    }

    public static ValidarPrecio conElPrecio(){
        return new ValidarPrecio();
    }
}
