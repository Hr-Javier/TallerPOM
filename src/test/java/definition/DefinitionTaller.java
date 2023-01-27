package definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionTaller {

    @Before
    public void beforeTest(){
        System.out.println("@Before");
    }

    @Given("^estoy en la pagina \"([^\"]*)\"$")
    public void estoyEnLaPagina(String arg1) {

    }


        @When("^Ingrese las credenciales$")
        public void ingreseLasCredenciales (){

        }

        @Then("^valido que el usuario creado tenga asignado un numero$")
        public void validoQueElUsuarioCreadoTengaAsignadoUnNumero () {
        }

        @After
        public void afterTest() {
            System.out.println("@After");

        }
    }