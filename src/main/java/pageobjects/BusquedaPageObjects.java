package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaPageObjects extends PageObject {

    By txtBusqueda = By.xpath("(//*[@formcontrolname='buscar'])[2]");
    By msjLibro = By.xpath("//a[contains(.,'DON QUIJOTE DE LA MANCHA')][1]");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }


    public By getMsjLibro() {
        return msjLibro;
    }
}
