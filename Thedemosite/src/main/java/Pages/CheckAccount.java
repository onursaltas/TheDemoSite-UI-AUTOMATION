package Pages;
/**
 * Created by onur on 20/04/21.
 */
import Locators.Locator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class CheckAccount extends Locator {

    private WebDriverWait wait;
    private WebDriver driver;


    public CheckAccount(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
    //public String loginStatus = "//*[text()[contains(.,\"**No login attempted**\")]]";
    public String loginStatus = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b";
    public static String expectedSuccesfulStatusName="**Successful Login**";
    public static String expectedFailedfStatusName = "**Failed Login**";
    public static String shortUsernameWarning = "Username too short.  The username must be at least 4 characters in length.";
    public static String shortPasswordWarning = "Password too short.  The password must be at least 4 characters in length.";

    public void SuccesfulStatusControl(){
        String actualStatusName=GetTextByXpath(loginStatus);
        Assert.assertEquals(expectedSuccesfulStatusName, actualStatusName);
    }
    public void FailedStatusControl(){
        String actualStatusName=GetTextByXpath(loginStatus);
        Assert.assertEquals(expectedFailedfStatusName, actualStatusName);
    }
    public void ShortNameStatusControl(){
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        assertEquals(alertText,shortUsernameWarning);
    }
    public void ShortPasswordStatusControl(){
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        assertEquals(alertText,shortPasswordWarning);
    }






}
