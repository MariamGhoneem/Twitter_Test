package homePageTest;

import basics.BaseTest;
import org.testng.annotations.Test;

public class TweetTests extends BaseTest {
    @Test
    public void testSuccessfulTweet(){
        homePage.addTweet("Test!");
    }
}
