package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    //Finding X path

    @FindBy(xpath="//span[normalize-space()=\"My Account\"]")
     public WebElement MyAcc_link;

    @FindBy(xpath="//a[normalize-space()=\"Login\"]")
    public WebElement Login_link;

    @FindBy(xpath="//a[normalize-space()='Register']")
    public WebElement Register_link;

    //Action Method
    public void click_MyAcc()
    {
        wait.waitForElement(MyAcc_link,20);
        MyAcc_link.click();
    }
    public void click_login()
    {
        Login_link.click();
    }
    public void click_register()
    {
        Register_link.click();
    }

}
