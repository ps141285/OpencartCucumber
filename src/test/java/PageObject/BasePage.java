package PageObject;

import Utilities.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
    WebDriver driver;
    WaitHelper wait=new WaitHelper(driver);

    BasePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



}
