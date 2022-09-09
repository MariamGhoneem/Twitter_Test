package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Messaging extends HomePage{

    private String receiverName;
    private By messageField = By.xpath("//*[@data-testid='dmComposerTextInput']");
    private By sendMessageButton = By.xpath("//*[@data-testid='dmComposerSendButton']");
    public Messaging(WebDriver driver) {
        super(driver);
    }

    public void SendMessage(String receiver,String message){
        driver.findElement(dmDrawer).click();
        this.receiverName = receiver;
        By receiverText = By.xpath("//span[text()='"+receiverName+"']");
        driver.findElement(receiverText).click();
        driver.findElement(messageField).sendKeys(message);
        driver.findElement(sendMessageButton).click();
        driver.findElement(dmDrawer).click();
    }
}
