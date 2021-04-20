package Pages;
/**
 * Created by onur on 20/04/21.
 */
import Locators.Locator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Locator  {

    private WebDriverWait wait;
    private WebDriver driver;

    private String login=".account-user";
    String topic = "//script[@language='javaScript']//following::p[1]//child::big";
    private String AddUser = "//a[@href='addauser.php']";
    String expectedAccountName="4. Login";
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    public void TopicControl(){
        String actualAccountName=GetTextByXpath(topic);
        Assert.assertEquals(expectedAccountName, actualAccountName);
    }


    public CreateUser createUser() {
        ClickByXpath(AddUser);
        return new CreateUser(driver);
    }

}
