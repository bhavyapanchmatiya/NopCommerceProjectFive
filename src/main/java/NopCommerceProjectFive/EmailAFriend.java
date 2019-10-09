package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriend extends UtilsPage {

    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");
    private By _enterFriendsEmail = By.xpath("//input[@placeholder=\"Enter friend's email.\"]");
    private By _personalMessage = By.id("PersonalMessage");
    private By _userEmail = By.xpath("//input[@placeholder=\"Enter your email address.\"]");
    private By _sendEmail = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");
    private By _actualResult2 = By.xpath("//div[@class=\"result\"]");
    private By _actualResult3 = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");


    public void toVerifyUserIsOnEmailAFriendPage(){

        String expectedResult ="Email a friend";
        String actualResult = extractText(_actualResult);
        Assert.assertEquals(actualResult,expectedResult);

    }

    public void enterEmailAFriendDetailsWithoutUserEmail(){

        enterText(_enterFriendsEmail,getProperty("FriendEmail"));
        enterText(_personalMessage,getProperty("Comment"));

    }

    public void enterEmailAFriendDetailsWithUserEmail(){

        enterText(_enterFriendsEmail,getProperty("FriendEmail"));
        enterText(_userEmail, getProperty("FirstName")+ getProperty("Email"));
        enterText(_personalMessage,getProperty("Comment"));
    }

    public void clickSendEmail(){

        clickElement(_sendEmail);
    }

    public void toVerifyEmailHasBeenSentSuccessfully(){

        String expectedResult2 ="Your message has been sent.";
        String actualResult2 = extractText(_actualResult2);
        Assert.assertEquals(actualResult2,expectedResult2);

    }

    public void toVerifyUnregisteredUserCannotReferAFriend(){

        String expectedResult3 ="Only registered customers can use email a friend feature";
        String actualResult3 = extractText(_actualResult3);
        Assert.assertEquals(actualResult3,expectedResult3);

    }

}
