package com.aliexpress.es.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class AgregarCarritoStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("Que me encuentro en la página {string}")
    public void queMeEncuentroEnLaPágina(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Cuando("busco el producto {string}")
    public void buscoElProducto(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Cuando("escojo el producto {string}")
    public void escojoElProducto(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entonces("verifico el precio {string}")
    public void verificoElPrecio(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entonces("añado al carrito")
    public void añadoAlCarrito() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Entonces("visualizo el producto {string} con el precio {string}")
    public void visualizoElProductoConElPrecio(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }

}
