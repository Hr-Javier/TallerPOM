package definition;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import step.OpenApp;
import step.Acciones;

public class DefinitionTaller {


    @Before
    public void beforeTest(){
        System.out.println("@Before");
    }

    @Steps
    OpenApp openApp;
    Acciones acciones;

    @Dado("^Deseo registrme en la pagina \"([^\"]*)\"$")
    public void deseoRegistrmeEnLaPagina() throws InterruptedException {
        openApp.appUrl();
        Thread.sleep(5000);
    }

    @Cuando("^Haga click en el boton '(\\d+)'$")
    public void hagaClickEnElBoton(){
    acciones.btnRegister();

    }

    @Cuando("^Escriba el campoA '(\\d+)'$")
    public void escribaElCampoA(String campoA){

    }

    @Cuando("^Escriba el campoB '(\\d+)'$")
    public void escribaElCampoB(String campoB){

    }

    @Cuando("^Escriba el campoC '(\\d+)'$")
    public void escribaElCampoC(int arg1) {

    }

    @Cuando("^Escriba el campoD '(\\d+)'$")
    public void escribaElCampoD() {

    }

    @Cuando("^Escriba el campoE '(\\d+)f'$")
    public void escribaElCampoE(){

    }

    @Cuando("^Escriba el campoF '(\\d+)f'$")
    public void escribaElCampoF(int arg1){

    }

    @Cuando("^Escriba el campoG '(\\d+)f'$")
    public void escribaElCampoG(int arg1){

    }

    @Cuando("^Escriba el campoH '(\\d+)'$")
    public void escribaElCampoH(int arg1) {

    }

    @Cuando("^Escriba el campoI '(\\d+)'$")
    public void escribaElCampoI(int arg1){

    }

    @Cuando("^Escriba el campoJ '(\\d+)'$")
    public void escribaElCampoJ(int arg1){

    }
    @Cuando("^Escriba el campoK '(\\d+)'$")
    public void escribaElCampok(int arg1){

    }

    @Cuando("^haga clic en el boton \"([^\"]*)\"$")
    public void hagaClicEnElBoton(String arg1){
        acciones.btnRegister1();
    }

    @Entonces("^El registro sea realizado correctamente$")
    public void elRegistroSeaRealizadoCorrectamente(){

    }


        @After
        public void afterTest() {
            System.out.println("@After");

        }
    }