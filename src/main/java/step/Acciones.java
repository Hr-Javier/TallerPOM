package step;
import net.thucydides.core.annotations.Step;
import pageobject.PaginaUrl;



public class Acciones {

    private PaginaUrl paginaUrl;

    @Step
    public void btnRegister(){
        paginaUrl.btn_Register.click();
    }

    @Step
    public void btnRegister1(){
        paginaUrl.btn_Register1.click();
    }

}
