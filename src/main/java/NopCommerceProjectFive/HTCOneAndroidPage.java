package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HTCOneAndroidPage extends UtilsPage {

    private By _actualResultLink = By.xpath("//h1[@itemprop=\"name\"]");
    private By _emailAFriend = By.xpath("//input[@value=\"Email a friend\"]");


    public void toVerifyUserIsOnHTCAndroidPage(){

        String expectedResult ="HTC One M8 Android L 5.0 Lollipop";
        String actualResult = extractText(_actualResultLink);
        Assert.assertEquals(actualResult,expectedResult);

    }

    public void clickOnEmailAFriendButton(){

        clickElement(_emailAFriend);
    }
}
