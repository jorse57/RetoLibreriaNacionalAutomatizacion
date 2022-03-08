package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import pageobjects.LoginPageObjects;
import utils.Datos;
import utils.EsperaExplicita;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    Datos datos = new Datos();

    public LoginSteps() throws IOException {
    }

    @Step
    public void abrirNavegador(){
        loginPageObjects.open();
    }

    @Step
    public void clickBtnMiCuenta(){
        esperaExplicita.esperaElementoClickleable(loginPageObjects.getDriver(),loginPageObjects.getBtnMiCuenta());
        loginPageObjects.getDriver().findElement(loginPageObjects.getBtnMiCuenta()).click();
    }

    @Step
    public void clickBtnLogin(){
        loginPageObjects.getDriver().findElement(loginPageObjects.getBtnLogin()).click();
    }

    @Step
    public void clickBtnIngresarEmailContrasena(){
        loginPageObjects.getDriver().findElement(loginPageObjects.getBtnIngresarConEmailContra()).click();

    }

    @Step
    public void ingresarCorreoUsuario() throws IOException {
        esperaExplicita.esperaElementoVisible(loginPageObjects.getDriver(),loginPageObjects.getTxtUsuario());
        loginPageObjects.getDriver().findElement(loginPageObjects.getTxtUsuario()).sendKeys(datos.obtenerDatos("Parametros","Datos.xlsx",1,0));
    }
    @Step
    public void ingresarContrasenaUsuario() throws IOException {
        loginPageObjects.getDriver().findElement(loginPageObjects.getTxtContrasena()).sendKeys(datos.obtenerDatos("Parametros","Datos.xlsx",1,1));
    }

    @Step
    public void clickBtnInicioSesion(){
        loginPageObjects.getDriver().findElement(loginPageObjects.getBtnInicioSesion()).click();
    }

    @Step
    public void validarMsjLoginExitoso(){
        esperaExplicita.esperaElementoVisible(loginPageObjects.getDriver(),loginPageObjects.getMsjLogin());
        assertThat(loginPageObjects.getDriver().findElement(loginPageObjects.getMsjLogin()).isDisplayed(), Matchers.is(true));
    }


}
