package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends BasePage {

    //constructor
    public AccountCreationPage(WebDriver driver)
    {
        super(driver);
    }

    //xpath for web page element
    @FindBy(xpath = "//h1[normalize-space()=\"Your Account Has Been Created!\"]")
    WebElement cnf_msg;


    //Action Method
    public String displayed_cnf_msg()
    {
        return(cnf_msg.getText());
    }
}