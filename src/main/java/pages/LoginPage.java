package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.home.HomePage;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.xpath("//input[@autocomplete='username']");
    private By nextButton = By.xpath("//span[text()='Next']");
    private By passwordField = By.xpath("//input[@autocomplete='current-password']");
    private By loginButton = By.xpath("//span[text()='Log in']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage Login(String username, String password){
        driver.findElement(emailField).sendKeys(username);
        driver.findElement(nextButton).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
