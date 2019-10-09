package NopCommerceProjectFive;

import org.openqa.selenium.By;

public class HomePage extends UtilsPage{

    private By _registerLink = By.xpath("//a[@class=\"ico-register\"]");
    private By _htcAndroidLink = By.xpath("//a[@href=\"/htc-one-m8-android-l-50-lollipop\"]");



    public void clickOnRegister(){

        clickElement(_registerLink);

    }

    public void clickOnProductHtcAndroidMobilePhone(){

        clickElement(_htcAndroidLink);


    }

}
