package com.aliexpress.es.stepDefinitions;

import com.aliexpress.es.questions.ValidarPrecio;
import com.aliexpress.es.questions.ValidarPrecioFinal;
import com.aliexpress.es.tasks.AbrirProductoTask;
import com.aliexpress.es.tasks.AñadirCarritoTask;
import com.aliexpress.es.tasks.BuscarProductoTask;
import com.aliexpress.es.tasks.VerCarritoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.cucumber.java.tr.Ve;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AgregarCarritoStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("Que me encuentro en la página {string}")
    public void queMeEncuentroEnLaPágina(String url) {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        theActorCalled("robot").wasAbleTo(Open.url(url));
    }
    @Cuando("busco el producto {string}")
    public void buscoElProducto(String busqueda) {
        // Write code here that turns the phrase above into concrete actions
       OnStage.theActorInTheSpotlight()
                .attemptsTo(
                       BuscarProductoTask.conLaBusqueda(busqueda)
                );
    }
    @Cuando("escojo el producto")
    public void escojoElProducto() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        AbrirProductoTask.conElProducto()
                );
    }

    @Cuando("añado al carrito")
    public void añadoAlCarrito() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        AñadirCarritoTask.conElCarrito()
                );
    }
    @Entonces("verifico el precio")
    public void verificoElPrecio() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ValidarPrecio.conElPrecio()
                );
    }

    @Entonces("visualizo el carrito")
    public void visualizoElCarrito() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        VerCarritoTask.conLosProductos(),
                        ValidarPrecioFinal.conElPrecioFinal()
                );

    }

}
