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
    public void estoyEnLaPagina(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Ingrese las credenciales$")
    public void ingreseLasCredenciales(DataTable arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @Then("^valido que el usuario creado tenga asignado un numero$")
    public void validoQueElUsuarioCreadoTengaAsignadoUnNumero() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @After
    public void afterTest(){
        System.out.println("@After");

}
