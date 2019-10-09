package NopCommerceProjectFive;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutPage extends UtilsPage{



    private By _dropDownCountry = By.id("BillingNewAddress_CountryId");
    private By _enterCityName = By.id("BillingNewAddress_City");
    private By _enterAddress = By.id("BillingNewAddress_Address1");
    private By _actualResult  = By.xpath("//div[@class=\"page-title\"]");
    private  By _enterPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _enterPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _clickContinueButtonOne = By.xpath("//input[@class=\"button-1 new-address-next-step-button\"]");
    private By _clickContinueButtonTwo = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input");
    private By _clickRadioButtonSelector = By.id("paymentmethod_1");
    private By _clickContinueButtonThree = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    private By _clickDropdownButton = By.xpath("//select[@name=\"CreditCardType\"]");
    private By _cardHolderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _expiryMonth = By.id("ExpireMonth");
    private By _expiryYear = By.id("ExpireYear");
    private By _cardCode = By.id("CardCode");
    private By _clickContinueButtonFour = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _actualResultConfirm = By.xpath("//div[@class=\"page-title\"]");
    private By _clickConfirmButton = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");
    private By _checkoutAsGuest = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");
    private By _guestFirstName = By.id("BillingNewAddress_FirstName");
    private By _guestLastName = By.id("BillingNewAddress_LastName");
    private By _guestEmail = By.id("BillingNewAddress_Email");




    public void toVerifyUserIsOnCheckOutPage(){

        String actualResult = extractText(_actualResult);
        String expectedResult = ("Checkout");

        Assert.assertEquals(actualResult,expectedResult);
    }

    public void enterDetailsCountryCityPostCodeAddress1AndPhoneNumber(){

        selectByValue(_dropDownCountry,"133");
        enterText(_enterCityName,getProperty("City"));
        enterText(_enterAddress,getProperty("Address"));
        enterText(_enterPostalCode,getProperty("PostalCode"));
        enterText(_enterPhoneNumber,getProperty("PhoneNumber"));
    }



    public void clickContinueButtonOne(){
        clickElement(_clickContinueButtonOne);

    }


    public void clickContinueButtonTwo(){

        clickElement(_clickContinueButtonTwo);

    }


    public void selectRadioButtonCreditCard(){

        clickElement(_clickRadioButtonSelector);
        }


        public void clickContinueButtonThree(){

        clickElement(_clickContinueButtonThree);
        }


        public void enterMasterCardDetails(){

        selectByVisibleText(_clickDropdownButton,"Master card");
       enterText(_cardHolderName,getProperty("CardName"));
       enterText(_cardNumber,getProperty("CardNumber"));
       selectByValue(_expiryMonth,"11");
       selectByValue(_expiryYear,"2026");
       enterText(_cardCode,getProperty("CardCvv"));
        }


        public void clickContinueButtonFour(){

        clickElement(_clickContinueButtonFour);
        }


        public void clickConfirmButton(){

        clickElement(_clickConfirmButton);
        }


        public void toVerifyOrderIsConfirmed(){

            String actualResult2 = extractText(_actualResultConfirm);
            String expectedResult2 = ("Checkout");
            Assert.assertEquals(actualResult2,expectedResult2);
        }




        public void checkoutAsGuest(){

            clickElement(_checkoutAsGuest);
        }




        public void enterGuestDetails(){

            enterText(_guestFirstName,getProperty("GuestFirstName"));
            enterText(_guestLastName,getProperty("GuestLastName"));
            enterText(_guestEmail,generateEmail());
            selectByValue(_dropDownCountry,"133");
            enterText(_enterCityName,getProperty("City"));
            enterText(_enterAddress,getProperty("Address"));
            enterText(_enterPostalCode,getProperty("PostalCode"));
            enterText(_enterPhoneNumber,getProperty("PhoneNumber"));

    }
}
