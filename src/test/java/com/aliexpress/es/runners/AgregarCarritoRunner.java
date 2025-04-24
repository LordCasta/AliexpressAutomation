package com.aliexpress.es.runners;

import com.aliexpress.es.utils.BeforeSuite;
import com.aliexpress.es.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features",
        tags =  "@SmokeTest",
        glue = "com.aliexpress.es.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(DataExcelRunner.class)
public class AgregarCarritoRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/realizarCompra.feature");
    }
}
