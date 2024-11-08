package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    //Finding X path

    @FindBy(xpath="//span[normalize-space()=\"My Account\"]")
        WebElement MyAcc_link;

    @FindBy(xpath="//a[normalize-space()=\"Login\"]")
    WebElement Login_link;

    //Action Method
    public void click_MyAcc()
    {
        MyAcc_link.click();
    }
    public void click_login()
    {
        Login_link.click();
    }

}
