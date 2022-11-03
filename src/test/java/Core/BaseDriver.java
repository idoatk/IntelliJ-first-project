package Core;

import Utiles.PropertyUtil;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    public WebDriver driver;
    String path = System.getProperty("user.dir");

    public WebDriver getDriver() {
        return driver;
    }

    public void startSession() {
        try {
            PropertyUtil pus = new PropertyUtil(path + "\\selenium.properties");
            String grid = pus.getProperty("grid");
            String browser = pus.getProperty("browser");
            String gridUrl = pus.getProperty("gridUrl");

            if (browser.equalsIgnoreCase("firefox")) {
                if (grid.equalsIgnoreCase("true")) {
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setBrowserName("firefox");
                    cap.setPlatform(Platform.WINDOWS);
                    driver = new RemoteWebDriver(new URL(gridUrl), cap);
                } else {
                    driver = new FirefoxDriver();
                }
            } else if (browser.equalsIgnoreCase("chrome")) {
                if (grid.equalsIgnoreCase("true")) {
                    System.setProperty("webdriver.chrome.driver",
                            path + "\\src\\ExternalJars\\chromeDriver\\chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    // set some options
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                    Capabilities cap = null;
                    driver = new RemoteWebDriver(new URL(gridUrl), cap);
                } else {
                    System.setProperty("webdriver.chrome.driver", path + "\\Automation\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                }

            } else if (browser.equalsIgnoreCase("ie")) {
                DesiredCapabilities ieCapabilities = null;
                if (grid.equalsIgnoreCase("true")) {
                    System.setProperty("webdriver.ie.driver",
                            path + "\\Automation\\drivers\\IEDriverServer.exe");

                    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                    capabilities.setCapability("requireWindowFocus", true);
                    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                    driver = (WebDriver) new InternetExplorerOptions(ieCapabilities);
                } else {
                    System.setProperty("webdriver.ie.driver",
                            path + "\\Automation\\drivers\\IEDriverServer.exe");

                    ieCapabilities = DesiredCapabilities.internetExplorer();
                    ieCapabilities.setCapability(
                            InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                    driver = (WebDriver) new InternetExplorerOptions(ieCapabilities);
                }
            }

            String url = pus.getProperty("url");
            driver.get(url);
            driver.manage().window().maximize();

        } catch (Exception ex) {

        }

    }

    public void stopSession() {
        driver.quit();
    }

}

