package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tweet extends HomePage{
    private By tweetButton = By.xpath("//*[@data-testid='tweetButtonInline']");
    public Tweet(WebDriver driver) {
        super(driver);
    }

    public void tweet(String tweet){
        driver.findElement(tweetTextArea).sendKeys(tweet);
        driver.findElement(tweetButton).click();
    }
}
