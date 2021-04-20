package Tests;
/**
 * Created by onur on 20/04/21.
 */
import Locators.*;
import Pages.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialTest {

    private static WebDriver driver;
    public static HomePage homePage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://thedemosite.co.uk/login.php");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login example page to test the PHP MySQL online system";
        Assert.assertEquals(expectedTitle, actualTitle);
        homePage = new HomePage(driver);


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
