package com.aliexpress.es.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target BTN_AÑADIR = Target.the("Botón para añadir al carrito")
            .locatedBy("//button[@class='comet-v2-btn comet-v2-btn-primary comet-v2-btn-large add-to-cart--addtocart--Qhoji3M comet-v2-btn-important']");

    public static final Target BTN_SUMAR = Target.the("Botón para sumar al carrito")
            .locatedBy("//div[@class='comet-v2-input-number-btn comet-v2-input-number-btn-increase']");

    public static final Target TXT_VALIDAR_PRECIO = Target.the("Texto del precio del producto")
            .locatedBy("//div[@class='cart-product-price-text']");


    public static final Target BTN_ABRIR_CARRITO = Target.the("Botón para abrir el carrito")
            .locatedBy("//span[@class='comet-icon comet-icon-shoppingcart shop-cart--shoppingCartIcon--d5W36TW']");

    public static final Target VALIDAR_PRECIO_FINAL = Target.the("Texto final con el precio")
            .locatedBy("//div[@class='cart-product-block-price-wrapper']");

}
