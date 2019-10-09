package NopCommerceProjectFive;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.session.InternetExplorerFilter;

public class BrowserSelector extends UtilsPage {

    public void setUpBrowser(){

        String browser = getProperty("Browser");

        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowswerDriver\\chromedriver.exe");

            driver = new ChromeDriver();

            }else if(browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowswerDriver\\geckodriver.exe");

            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("opera")){

            System.setProperty("webdriver.opera.driver","src\\test\\Resources\\BrowswerDriver\\operadriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\SOFT");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(ChromeOptions.CAPABILITY,options);
            OperaDriver browser1 = new OperaDriver(capabilities);

            driver = browser1;


        }else{

            System.out.println("Browser Name is Empty or Wrong: " + browser);
        }


    }


}
