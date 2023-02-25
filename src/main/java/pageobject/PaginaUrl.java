package pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

@DefaultUrl("https://parabank.parasoft.com/")
public class PaginaUrl  extends PageObject{

    @FindBy(id = "Register")
    public WebElementFacade btn_Register;
    @FindBy(id="customer.firstName")
    public WebElementFacade first_Name;
    @FindBy(id="customer.lastName")
    public WebElementFacade last_Name;
    @FindBy(id="customer.address.street")
    public WebElementFacade address_Street;
    @FindBy(id="customer.address.city")
    public WebElementFacade address_City;
    @FindBy(id="customer.address.state")
    public WebElementFacade address_state;
    @FindBy(id="customer.address.zipCode")
    public WebElementFacade address_zip_Code;
    @FindBy(id="customer.phoneNumber")
    public WebElementFacade customer_phoneNumber;
    @FindBy(id="customer.ssn")
    public WebElementFacade customer_ssn;
    @FindBy(id="customer.username")
    public WebElementFacade customer_username;
    @FindBy(id="customer.password")
    public WebElementFacade customer_password;
    @FindBy(id="repeatedPassword")
    public WebElementFacade repeated_Password;
    @FindBy(xpath = "//input[@value=\"Register\"]")
    public WebElementFacade btn_Register1;

}
