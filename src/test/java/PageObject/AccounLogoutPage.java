package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccounLogoutPage extends BasePage
{
    public AccounLogoutPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()=\"Continue\"]")
    WebElement btn_continue;

    public void Click_continue()
    {
        btn_continue.click();
    }

}
