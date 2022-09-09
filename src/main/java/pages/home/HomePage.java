package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    protected By dmDrawer = By.xpath("//*[@data-testid='DMDrawerHeader']");
    protected By tweetTextArea = By.xpath("//*[@data-testid='tweetTextarea_0']");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void sendMessage(String receiver,String message){
        Messaging messaging = new Messaging(driver);
        messaging.SendMessage(receiver,message);
    }

    public void addTweet(String tweetText){
        Tweet tweet = new Tweet(driver);
        tweet.tweet(tweetText);
    }
}
