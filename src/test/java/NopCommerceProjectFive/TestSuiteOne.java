package NopCommerceProjectFive;

import org.testng.annotations.Test;

public class TestSuiteOne extends BaseTest {

    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    HTCOneAndroidPage hTCOneAndroidPage = new HTCOneAndroidPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    //SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test

    public void userShouldBeAbleToRegisterSuccessfully() {

        //To click On Register
            homepage.clickOnRegister();
        //To Verify User is on Register Page
            registerPage.verifyUserIsOnRegisterPage();
        //To Enter Registration Details
            registerPage.userEnterRegistrationDetails();
        //To Verify User is registered SuccessFully
            registrationResultPage.userShouldBeAbleToSeeRegistrationSuccessfulMessage();
    }

    @Test

     public void userShouldBeAbleToRegisterAndReferAProductToFriend(){

        //To click On Register
            homepage.clickOnRegister();
        //To Verify User is on Register Page
            registerPage.verifyUserIsOnRegisterPage();
        //To Enter Registration Details
            registerPage.userEnterRegistrationDetails();
        //To Verify User is registered SuccessFully
            registrationResultPage.userShouldBeAbleToSeeRegistrationSuccessfulMessage();
        //click on Homepage
            registrationResultPage.clickHomepageButton();
        //Click On Product Htc Phone
            homepage.clickOnProductHtcAndroidMobilePhone();
        //To Verify User is on the Htc Page
            hTCOneAndroidPage.toVerifyUserIsOnHTCAndroidPage();
        //click Email a Friend
            hTCOneAndroidPage.clickOnEmailAFriendButton();
        //To verify User is on Email a Friend Page
            emailAFriend.toVerifyUserIsOnEmailAFriendPage();
        //Enter Details
            emailAFriend.enterEmailAFriendDetailsWithoutUserEmail();
        //Click Send Button
            emailAFriend.clickSendEmail();
        //To Verify Email Has been Sent
            emailAFriend.toVerifyEmailHasBeenSentSuccessfully();

    }

    @Test

    public void unregisteredUserShouldNotBeAbleToReferAFriend(){

        //Click on HTC Android Phone
            homepage.clickOnProductHtcAndroidMobilePhone();
        //To Verify User Is on HTC Page
            hTCOneAndroidPage.toVerifyUserIsOnHTCAndroidPage();
        //click Email a Friend
            hTCOneAndroidPage.clickOnEmailAFriendButton();
        //To verify User is on email a friend Page
            emailAFriend.toVerifyUserIsOnEmailAFriendPage();
        //Enter Details with User email
            emailAFriend.enterEmailAFriendDetailsWithUserEmail();
        //click Send Email
            emailAFriend.clickSendEmail();
        //To confirm Error message is shown
            emailAFriend.toVerifyUnregisteredUserCannotReferAFriend();

    }

    @Test

    public void registeredUserShouldBeAbleToBuyProductSuccessfully(){

        //To click On Register
            homepage.clickOnRegister();
        //To Verify User is on Register Page
            registerPage.verifyUserIsOnRegisterPage();
        //To Enter Registration Details
            registerPage.userEnterRegistrationDetails();
        //To Verify User is registered SuccessFully
            registrationResultPage.userShouldBeAbleToSeeRegistrationSuccessfulMessage();
        //To Go Back On Homepage
            registrationResultPage.clickHomepageButton();
        //To Click The Product Computer
            buildYourOwnComputer.clickBuildYourOwnComputerLink();
        //To Verify User Is On Computer Page
            buildYourOwnComputer.toVerifyUserIsOnBuildYourcomputerPage();
        //To Select 400Gb Radio Button
            buildYourOwnComputer.toClickSelector400Gb();
            sleep(3000);
        //To Add to Cart
            buildYourOwnComputer.clickAddToCart();
        //To click Cart Page Link
            buildYourOwnComputer.toClickShoppingCartLink();
        //To Check the correct product has been added to cart
            buildYourOwnComputer.toVerifyTheProductHasBeenAddedToCart();
        //To confirm user is on right page
            shoppingCartPage.toVerifyUserIsOnShoppingCartPage();
        //To select the radio Button for terms and conditions
            shoppingCartPage.clickSelector();
        //To Checkout
            shoppingCartPage.clickCheckOut();
        //To Verify user is on checkout page
            checkOutPage.toVerifyUserIsOnCheckOutPage();
        //To Enter details
            checkOutPage.enterDetailsCountryCityPostCodeAddress1AndPhoneNumber();
        //To click Continue Button
            checkOutPage.clickContinueButtonOne();
            sleep(3000);
        //To click Continue Button
            checkOutPage.clickContinueButtonTwo();
            sleep(3000);
        //To Select Credit card radio button
            checkOutPage.selectRadioButtonCreditCard();
        //To click Continue Button
            checkOutPage.clickContinueButtonThree();
            sleep(3000);
        //To enter card Details
            checkOutPage.enterMasterCardDetails();
        //To click Continue Button
            checkOutPage.clickContinueButtonFour();
            sleep(3000);
        //To click Confirm
            checkOutPage.clickConfirmButton();
        //To verify the order is confirmed
            checkOutPage.toVerifyOrderIsConfirmed();
    }

@Test

    public void unregisteredUserCanCheckout(){

    //To click computer link
        buildYourOwnComputer.clickBuildYourOwnComputerLink();
    //To Verify User Is On Computer Page
        buildYourOwnComputer.toVerifyUserIsOnBuildYourcomputerPage();
    //To Select 400Gb Radio Button
        buildYourOwnComputer.toClickSelector400Gb();
        sleep(3000);
    //To Add to Cart
        buildYourOwnComputer.clickAddToCart();
    //To click Cart Page Link
        buildYourOwnComputer.toClickShoppingCartLink();
    //To Check the correct product has been added to cart
        buildYourOwnComputer.toVerifyTheProductHasBeenAddedToCart();
    //To confirm user is on right page
        shoppingCartPage.toVerifyUserIsOnShoppingCartPage();
    //To select the radio Button for terms and conditions
        shoppingCartPage.clickSelector();
    //To Checkout
        shoppingCartPage.clickCheckOut();
    //To click Checkout as Guest
        checkOutPage.checkoutAsGuest();
    //To Enter Guest Details
        checkOutPage.enterGuestDetails();
    //To click Continue Button
        checkOutPage.clickContinueButtonOne();
        sleep(3000);
    //To click Continue Button
        checkOutPage.clickContinueButtonTwo();
        sleep(3000);
    //To Select Credit card radio button
        checkOutPage.selectRadioButtonCreditCard();
    //To click Continue Button
        checkOutPage.clickContinueButtonThree();
        sleep(3000);
    //To enter card Details
        checkOutPage.enterMasterCardDetails();
    //To click Continue Button
        checkOutPage.clickContinueButtonFour();
        sleep(3000);
    //To click Confirm
        checkOutPage.clickConfirmButton();
    //To verify the order is confirmed
        checkOutPage.toVerifyOrderIsConfirmed();

    }



    }

