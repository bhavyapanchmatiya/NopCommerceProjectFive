package NopCommerceProjectFive;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends UtilsPage{

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod

    public void setUpBrowser(){

        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get(getProperty("url"));
    }
@AfterMethod

    public void closeBrowser(ITestResult result){

        if(ITestResult.FAILURE==result.getStatus()){

            takeSnapShot(result.getName());
        }
        driver.quit();
}

}
