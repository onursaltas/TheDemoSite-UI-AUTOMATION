package Tests;
/**
 * Created by onur on 20/04/21.
 */

import Pages.*;
import Users.AccountInformation;
import Users.UserPool;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import pageObject.loginPageObjects;

import static org.junit.Assert.assertEquals;


public class MainTest extends InitialTest {

    WebDriverWait wait;
    WebDriver driver;

    @Test
    public void Enter_correct_username_and_correct_password(){

        homePage.TopicControl();
        CreateUser createUser = homePage.createUser();
        AccountInformation accountInformation = UserPool.getUserFirst();
        createUser.Username(accountInformation.getEmail());
        createUser.Password(accountInformation.getPassword());
        createUser.Save();
        LoginPage loginPage = createUser.clickLogin();
        loginPage.Username(accountInformation.getEmail());
        loginPage.Password(accountInformation.getPassword());
        CheckAccount checkAccount = loginPage.LoginButton();
        checkAccount.SuccesfulStatusControl();
    }
    @Test
    public void Enter_incorrect_username_and_correct_password(){

        homePage.TopicControl();
        CreateUser createUser = homePage.createUser();
        AccountInformation accountInformation = UserPool.getUserSecond();
        LoginPage loginPage = createUser.clickLogin();
        loginPage.Username(accountInformation.getEmail());
        loginPage.Password(accountInformation.getPassword());
        CheckAccount checkAccount = loginPage.LoginButton();
        checkAccount.FailedStatusControl();
    }

    @Test
    public void BoundaryTestForUsername1_Enter_3_characters_on_username_field(){

        homePage.TopicControl();
        CreateUser createUser = homePage.createUser();
        AccountInformation accountInformation = UserPool.getUserThird();
        LoginPage loginPage = createUser.clickLogin();
        loginPage.Username(accountInformation.getEmail());
        loginPage.Password(accountInformation.getPassword());
        CheckAccount checkAccount = loginPage.LoginButton();
        checkAccount.ShortNameStatusControl();
    }
    @Test
    public void BoundaryTestForPassword1_Enter_3_characters_on_password_field(){

        homePage.TopicControl();
        CreateUser createUser = homePage.createUser();
        AccountInformation accountInformation = UserPool.getUserFourth();
        LoginPage loginPage = createUser.clickLogin();
        loginPage.Username(accountInformation.getEmail());
        loginPage.Password(accountInformation.getPassword());
        CheckAccount checkAccount = loginPage.LoginButton();
        checkAccount.ShortPasswordStatusControl();
    }


}
