package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
    //Constructor
   public RegisterPage(WebDriver driver)
    {
        super(driver);
    }

    //Xpath for each element present on the web page
    @FindBy(xpath="//input[@id=\"input-firstname\"]")
    WebElement fname;

    @FindBy(xpath="//input[@id=\"input-lastname\"]")
    WebElement lname;

    @FindBy(xpath="//input[@id=\"input-email\"]")
    WebElement email;

    @FindBy(xpath="//input[@id=\"input-telephone\"]")
    WebElement tel_ph_no;

    @FindBy(xpath = "//input[@id=\"input-password\"]")
    WebElement act_pwd;

    @FindBy(xpath="//input[@id=\"input-confirm\"]")
    WebElement cnf_pwd;

    @FindBy(xpath="//input[@name=\"agree\"]")
    WebElement pp_chk_box;

    @FindBy(xpath="//input[@value=\"Continue\"]")
    WebElement btn_continue;

    //Action method
    public void setFname(String f_name)
    {
        fname.sendKeys(f_name);
    }
    public void setLname(String l_name)
    {
        lname.sendKeys(l_name);
    }
    public void setEmail(String Email)
    {
        email.sendKeys(Email);
    }
    public void setTel_ph_no(String tel)
    {
        tel_ph_no.sendKeys(tel);
    }
    public void setAct_pwd(String pwd)
    {
        act_pwd.sendKeys(pwd);
    }
    public void setCnf_pwd(String pwd_c)
    {
        cnf_pwd.sendKeys(pwd_c);
    }
    public void click_on_chkbox()
    {
        pp_chk_box.click();
    }
    public void click_on_continue()
    {
        btn_continue.click();
    }




}
