package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage
{
    public LogoutPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//a[@class=\"list-group-item\"][normalize-space()=\"Logout\"]")
    WebElement lnk_logout;

    public void click_logout()
    {
        lnk_logout.click();
    }
}
