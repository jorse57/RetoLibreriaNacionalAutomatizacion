package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaPageObjects extends PageObject {

    By inputBusqueda = By.xpath("(//*[@formcontrolname='buscar'])[2]");
    By btnBuscar = By.xpath("(//*[@class='icon-search text-white text-md'])[2]");
    By validarLibro = By.xpath("//a[contains(.,'DON QUIJOTE DE LA MANCHA')][1]");

    public By getInputBusqueda() {
        return inputBusqueda;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getValidarLibro() {
        return validarLibro;
    }
}
