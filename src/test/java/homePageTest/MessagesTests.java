package homePageTest;

import basics.BaseTest;
import org.testng.annotations.Test;


public class MessagesTests extends BaseTest {

    @Test
    public void testSuccessfulMessaging(){
        //write the receiver name and the message you want to send
        homePage.sendMessage("receiver","message");
    }
}
