package StepDefinition;

import PageObject.AccounLogoutPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.LogoutPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition
{
    WebDriver driver;
    HomePage hp;
    LoginPage lp;
    LogoutPage lo;
    AccounLogoutPage alp;



    @Given("User Launch Chrome Browser")
    public void Setup()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        lp=new LoginPage(driver);
        hp=new HomePage(driver);
        lo=new LogoutPage(driver);
        alp=new AccounLogoutPage(driver);
    }

    @When("User opens url {string} and navigate to login page")
    public void open_url(String url) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        hp.click_MyAcc();
        hp.click_login();

    }

    @When("User enters Email as {string} and password is {string}")
    public void provide_login_data(String email, String pwd)
    {
        lp.setEmail(email);
        lp.setPwd(pwd);
    }

    @When("click on Login")
    public void Open_login_page()
    {
        lp.Click_login();
    }

    @Then("Page Title should be {string}")
    public void validate_page_title(String Page_title)
    {
        String title=driver.getTitle();
        if(Page_title.equals(title))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }
    }

    @When("User click on Logout Link")
    public void logout()
    {
        lo.click_logout();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String Page_title)
    {
        String title=driver.getTitle();
        if(Page_title.equals(title))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }

    }
    @Then("click on continue button")
    public void click_on_continue_button()
    {
        alp.Click_continue();
    }

    @Then("Close the browser")
    public void TearDown()
    {
        driver.quit();
    }

}
