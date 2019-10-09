package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends UtilsPage{


    private By _clickTermsAndCondtionsSelector = By.id("termsofservice");
    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");
    private By _clickCheckout = By.id("checkout");


    public void toVerifyUserIsOnShoppingCartPage(){

        String actualResult = extractText(_actualResult);
        String expectedResult = ("Shopping cart");
        Assert.assertEquals(actualResult,expectedResult);

    }

    public void clickSelector(){

        clickElement(_clickTermsAndCondtionsSelector);

    }

public void clickCheckOut(){

        clickElement(_clickCheckout);
}
}
