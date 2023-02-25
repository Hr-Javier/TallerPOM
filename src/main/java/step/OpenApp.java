package step;
import net.thucydides.core.annotations.Step;
import pageobject.PaginaUrl;


public class OpenApp {
    private PaginaUrl paginaUrl;

    @Step
    public void appUrl(){
        paginaUrl.open();
    }
}
