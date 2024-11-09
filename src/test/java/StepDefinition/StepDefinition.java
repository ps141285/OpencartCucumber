package StepDefinition;

import PageObject.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class StepDefinition extends BaseClass
{
    @Given("User Launch Chrome Browser")
    public void Setup()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        lp=new LoginPage(driver);
        hp=new HomePage(driver);
        lo=new LogoutPage(driver);
        alp=new AccounLogoutPage(driver);
        rp=new RegisterPage(driver);
        acp=new AccountCreationPage(driver);
    }

    @When("User opens url {string}")
    public void userOpensUrl(String url) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Then("navigate to login page")
    public void navigateToLoginPage()
    {
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
    public void logout() throws InterruptedException {
        lo.click_logout();
        Thread.sleep(3000);
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
    public void click_on_continue_button() throws InterruptedException {
        Thread.sleep(3000);
        alp.Click_continue();
    }

    @Then("Close the browser")
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    //creating Methods for Register Account Page
    @Then("navigate to Register Page")
    public void navigate_to_register_page()
    {
        hp.click_MyAcc();
        hp.click_register();
    }
    @Then("provide all value {string},{string},{string},{string},{string},{string}")
    public void provideAllValue(String fname, String lname, String email, String ph, String pwd, String act_pwd)
    {
        rp.setFname(RandomData());
        rp.setLname(RandomData());
        rp.setEmail(RandomAlphaNumeric()+"@gmail.com");
        rp.setTel_ph_no(RandomNumberData());
        rp.setAct_pwd(PWD);
        rp.setCnf_pwd(PWD);

    }

    @Then("click on privacy policy checkbox")
    public void click_on_privacy_policy_checkbox()
    {
        rp.click_on_chkbox();
    }
    @Then("click on continue button of the reg page")
    public void click_on_continue_button_of_the_reg_page()
    {
        rp.click_on_continue();

    }
    @Then("verify {string} displayed on page")
    public void verify_displayed_on_page(String exp_msg)
    {
        if(acp.displayed_cnf_msg().equals(exp_msg))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }
    }



}
