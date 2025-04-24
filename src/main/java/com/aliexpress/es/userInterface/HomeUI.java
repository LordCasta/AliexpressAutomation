package com.aliexpress.es.userInterface;

import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target IPT_BUSCAR = Target.the("Barra de búsqueda")
            .locatedBy("//input[@name='searchWords']");


    public static final Target TXT_PRECIO = Target.the("")
            .locatedBy("//span[@class='price--currentPriceText--V8_y_b5 pdp-comp-price-current']");

    public static final Target PRODUCTO = Target.the("")
            .locatedBy("(//span[@class='mk_a8'])[1]"); // //span[@class='mk_a8'])[1]




}
