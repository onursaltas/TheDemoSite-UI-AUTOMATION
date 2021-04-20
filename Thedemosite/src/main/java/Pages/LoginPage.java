package Pages;
/**
 * Created by onur on 20/04/21.
 */
import Locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Locator {


    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    private String nameField = "username";
    private String passwordField = "password";
    private String loginButton = "FormsButton2";

    public void Username(String name) {
        SendByName(nameField,name);
    }

    public void Password(String password) {
        SendByName(passwordField,password);
    }

    public CheckAccount LoginButton() {
        ClickByName(loginButton);
        return new CheckAccount(driver);
    }


}
