package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends UtilsPage{

    private By _actualResult = By.xpath("//div[@class=\"result\"]");
    private By _homePageButton = By.xpath("//img[@alt=\"nopCommerce demo store\"]");

    public void userShouldBeAbleToSeeRegistrationSuccessfulMessage(){


        String expectedResult ="Your registration completed";
        String actualResult = extractText(_actualResult);

        Assert.assertEquals(actualResult,expectedResult);
    }

    public void clickHomepageButton(){

        clickElement(_homePageButton);
    }

}
