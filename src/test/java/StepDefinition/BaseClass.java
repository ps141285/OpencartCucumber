package StepDefinition;

import PageObject.*;
import Utilities.WaitHelper;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass
{
    WebDriver driver;
    HomePage hp;
    LoginPage lp;
    LogoutPage lo;
    AccounLogoutPage alp;
    RegisterPage rp;
    AccountCreationPage acp;


    //created random string
    public static String PWD=RandomAlphaNumeric();
    public static String  RandomData()
    {
        String RandomName;
        RandomName = RandomStringUtils.randomAlphabetic(7);
        return RandomName;
    }
    public static String  RandomNumberData()
    {
        String Random_num;
        Random_num = RandomStringUtils.randomNumeric(10);
        return Random_num;
    }
    public static String RandomAlphaNumeric()
    {
        String Random_data=RandomStringUtils.randomAlphabetic(4);
        String Random_num=RandomStringUtils.randomNumeric(3);
        return (Random_data+Random_num);
    }

}

