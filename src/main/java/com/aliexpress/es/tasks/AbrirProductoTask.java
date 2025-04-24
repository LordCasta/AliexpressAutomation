package com.aliexpress.es.tasks;

import com.aliexpress.es.interactions.ScrollJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.aliexpress.es.userInterface.HomeUI.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AbrirProductoTask implements Task {

    public static String texto;
    public AbrirProductoTask( ){

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        texto = Text.of(TXT_PRECIO).answeredBy(actor);
        actor.attemptsTo(

                WaitUntil.the(PRODUCTO, isVisible()).forNoMoreThan(60).seconds(),
                ScrollJavaScript.to(PRODUCTO),
                JavaScriptClick.on(PRODUCTO)

        );
    }

    public static AbrirProductoTask conElProducto( ){
        return new AbrirProductoTask();
    }
}
