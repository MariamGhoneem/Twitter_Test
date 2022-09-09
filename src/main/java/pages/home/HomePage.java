package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    protected By dmDrawer = By.xpath("//*[@data-testid='DMDrawerHeader']");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void sendMessage(String receiver,String message){
        Messaging messaging = new Messaging(driver);
        messaging.SendMessage(receiver,message);
    }
}
