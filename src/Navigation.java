import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        // chrome init
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver entering site
        driver.get("www.https://saucedemo.com");
        Thread.sleep(5000);
        //driver entering second site
        driver.navigate().to("https://smart-group.ltd");
        Thread.sleep(5000);
        // back to first site
        driver.navigate().back();
        Thread.sleep(5000);
        // back to second site
        driver.navigate().forward();
        Thread.sleep(5000);
        //refresh page
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();


    }
}