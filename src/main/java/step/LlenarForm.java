package step;
import pageobject.PaginaUrl;
import net.thucydides.core.annotations.Step;

public class LlenarForm {

    private PaginaUrl paginaUrl;

    @Step
    public void llenarForm(){
        paginaUrl.first_Name.sendKeys("campoA");
        paginaUrl.last_Name.sendKeys("campoB");
        paginaUrl.address_Street.sendKeys("campoC");
        paginaUrl.address_City.sendKeys("campoD");
        paginaUrl.address_state.sendKeys("campoE");
        paginaUrl.address_zip_Code.sendKeys("campoF");
        paginaUrl.customer_phoneNumber.sendKeys("campoG");
        paginaUrl.customer_ssn.sendKeys("campoH");
        paginaUrl.customer_username.sendKeys("campoI");
        paginaUrl.customer_password.sendKeys("campoJ");
        paginaUrl.repeated_Password.sendKeys("campoK");
    }

}
