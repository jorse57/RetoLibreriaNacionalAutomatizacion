package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import pageobjects.BusquedaPageObjects;
import utils.Datos;
import utils.EsperaExplicita;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class BusquedaSteps {
    BusquedaPageObjects busquedaPageObjects= new BusquedaPageObjects();
    EsperaExplicita esperaExplicita= new EsperaExplicita();
    Datos datos = new Datos();

    @Step
    public void ingresarParametroBusqueda() throws IOException {
        busquedaPageObjects.getDriver().findElement(busquedaPageObjects.getInputBusqueda()).sendKeys(datos.obtenerDatos("Parametros","Datos.xlsx",1,2));
    }

    @Step
    public void accionBuscar(){
        busquedaPageObjects.getDriver().findElement(busquedaPageObjects.getInputBusqueda()).sendKeys(Keys.ENTER);
    }
    @Step
    public void validarResultadosBusqueda(){
        esperaExplicita.esperaElementoVisible(busquedaPageObjects.getDriver(),busquedaPageObjects.getValidarLibro());
        assertThat(busquedaPageObjects.getDriver().findElement(busquedaPageObjects.getValidarLibro()).isDisplayed(), Matchers.is(true));
    }
}
