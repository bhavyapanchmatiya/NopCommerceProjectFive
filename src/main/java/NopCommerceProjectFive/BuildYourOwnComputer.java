package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BuildYourOwnComputer extends UtilsPage{

    SoftAssert softAssert = new SoftAssert();


    private By _buildYourOwnComputer = By.xpath("//div[@data-productid=\"1\"]");
    private By _actualResult1 = By.xpath("//h1[@itemprop=\"name\"]");
    private By _selector400Gb = By.id("product_attribute_3_7");
    private By _addToCart = By.id("add-to-cart-button-1");
    private By _actualResult2 = By.xpath("//div[@class=\"page-title\"]");
    private By _clickShoppingCartLink = By.xpath("//span[@class=\"cart-label\"]");
    private By _clickCheckboxTermsandConditions = By.id("termsofservice");
    private By _clickCheckOutButton = By.id("checkout");






    public void clickBuildYourOwnComputerLink(){

        clickElement(_buildYourOwnComputer);
    }

    public void toVerifyUserIsOnBuildYourcomputerPage(){

        String expectedResult1 ="Build your own computer";
        String actualResult1 = extractText(_actualResult1);
        Assert.assertEquals(actualResult1,expectedResult1);
    }

    public void toClickSelector400Gb(){

        clickElement(_selector400Gb);
    }

    public void clickAddToCart(){

        clickElement(_addToCart);
    }

    public void toVerifyTheProductHasBeenAddedToCart(){


        String actualResult2 = extractText(_actualResult2);
        String expectedResult2 = ("Shopping cart");

        softAssert.assertEquals(actualResult2,expectedResult2);
        softAssert.assertAll();

    }

        public void toClickShoppingCartLink(){

        clickElement(_clickShoppingCartLink);

        }




        }







