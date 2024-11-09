package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper
{
    WebDriver driver;
    public WaitHelper(WebDriver driver)
    {
        this.driver=driver;
    }
    public void waitForElement(WebElement element,long timeoutsec)
    {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeoutsec));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
