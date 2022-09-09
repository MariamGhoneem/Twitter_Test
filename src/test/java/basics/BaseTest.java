package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import pages.home.HomePage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;
    protected HomePage homePage;

    @BeforeSuite
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://twitter.com/i/flow/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }
    @BeforeTest
    public void testSuccessfulLogin(){
        loginPage = new LoginPage(driver);
        //write down your username and password
        homePage = loginPage.Login("@username","password");
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
