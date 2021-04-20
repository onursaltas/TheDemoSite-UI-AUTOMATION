package Pages;
/**
 * Created by onur on 20/04/21.
 */
import Locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUser extends Locator {

    private WebDriverWait wait;
    private WebDriver driver;
    private String loginUrl="//a[@href='login.php']";
    public CreateUser(WebDriver driver) {
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
    public void Save(){
        ClickByName(loginButton);
    }

    public LoginPage clickLogin() {
        ClickByXpath(loginUrl);
        return new LoginPage(driver);
    }

}
