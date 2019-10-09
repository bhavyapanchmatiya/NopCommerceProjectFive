package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.net.URL;

public class RegisterPage extends UtilsPage{

    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _companyName = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private By _actualResult = By.xpath("//div[@class=\"page-title\"]");


public void verifyUserIsOnRegisterPage(){

    String expectedResult = "Register";
    String actualResult = extractText(_actualResult);
    Assert.assertEquals(actualResult,expectedResult);
}

public void userEnterRegistrationDetails(){


    enterText(_firstName,getProperty("FirstName"));
    enterText(_lastName,getProperty("LastName"));
    enterText(_email,generateEmail());
    enterText(_companyName,getProperty("CompanyName"));
    enterText(_password,getProperty("PassWord"));
    enterText(_confirmPassword,getProperty("PassWord"));
    clickElement(_registerButton);
}

}
