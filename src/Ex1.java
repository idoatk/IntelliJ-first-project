import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex1 {
    public static void main(String[] args) {

        String driverPath ="c:\\Automation\\Drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",driverPath);
        //new instance chrome driver
        WebDriver driver = new ChromeDriver();
        //  Make the url a string
        String url = "https://www.saucedemo.com/";
        // Launch to site url
        driver.get(url);
        //Make the title a string
        String title = driver.getTitle();
        //store the title length in the int variable
        int titlelength = driver.getTitle().length();
        ///printing title and titlelength in console window
        System.out.println("title is: " + title);
        System.out.println("Length title is:" + titlelength);
        // make actualUrl a string
        String actualUrl = driver.getCurrentUrl();
        //vertification url
        if (actualUrl.equals(url)) {
            System.out.println("url is fantastic");
        } else
            System.out.println("error url");
            //in case of fail,print the actual url and the expected url - for record purpose
        System.out.println("actualUrl is :" + actualUrl);
        System.out.println("expected url is" + url);

            // Make source a string
            String pageSource = driver.getPageSource();
            //store page source length in int variable
            int pageSourceLength = driver.getPageSource().length();
            //print it
            System.out.println("the length of the code in letters is; " + pageSourceLength);

            driver.close();

        }
    }
