package com.libreriaNacional.stepDefinitions;

import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;
import steps.BusquedaSteps;
import steps.LoginSteps;

import java.io.IOException;

public class loginLibreriaStepDefinitions {

    @Steps
    LoginSteps loginSteps;
    @Steps
    BusquedaSteps busquedaSteps;


    @Dado("^J se encuentra en la pagina libreria nacional$")
    public void j_se_encuentra_en_la_pagina_libreria_nacional() {
        loginSteps.abrirNavegador();
    }


    @Cuando("^J ingresa los datos de login correctamente$")
    public void j_ingresa_los_datos_de_login_correctamente() throws IOException {
        loginSteps.clickBtnMiCuenta();
        loginSteps.clickBtnLogin();
        loginSteps.clickBtnIngresarEmailContrasena();
        loginSteps.ingresarCorreoUsuario();
        loginSteps.ingresarContrasenaUsuario();
        loginSteps.clickBtnInicioSesion();
    }

    @Entonces("^J se encuentra dentro de la plataforma$")
    public void j_se_encuentra_dentro_de_la_plataforma() {
        loginSteps.validarMsjLoginExitoso();
    }

    //BUSQUEDA

    @Cuando("^J ingresa parametros de busqueda$")
    public void j_ingresa_parametros_de_busqueda() throws IOException {
        busquedaSteps.ingresarParametroBusqueda();
        busquedaSteps.accionBuscar();
    }


    @Entonces("^J encuentra el articulo$")
    public void j_encuentra_el_articulo() {
        busquedaSteps.validarResultadosBusqueda();
    }
}
