package com.libreriaNacional.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.librerianacional/loginLibreria.feature",
        glue = "com.libreriaNacional.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class loginLibreriaRunner {
}
