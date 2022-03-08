package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.Datos;

import java.io.IOException;


@DefaultUrl("https://librerianacional.com/")

public class LoginPageObjects extends PageObject {
    Datos datos = new Datos();

    By btnMiCuenta = By.xpath("(//button[contains(.,'Mi cuenta')])[2]");
    By btnLogin = By.xpath("(//a[contains(.,' Iniciar Sesión ')])[2]");
    By btnIngresarConEmailContra = By.xpath("//div[text()=' Ingresar con Mail y contraseña '][1]");
    By txtUsuario = By.xpath("//*[@name='usuario']");
    By txtContrasena = By.xpath("//*[@name='contrasena']");
    By btnInicioSesion = By.xpath("//button[contains(.,'Iniciar sesión')]");
    By msjLogin = By.xpath("//*[text()='"+datos.obtenerDatos("Parametros","Datos.xlsx",1,3)+"']");

    public LoginPageObjects() throws IOException {
    }

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getBtnIngresarConEmailContra() {
        return btnIngresarConEmailContra;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

    public By getMsjLogin() {
        return msjLogin;
    }
}
