import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c://Automation//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize page
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
            Thread.sleep(3000);
            // accept text from site,copy and placement.
            String usernameAre = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getText();
        System.out.println("the text of the x path is:" +usernameAre);
        //print the title name
        String Title = driver.getTitle();
        System.out.println("the title of the site is:"+Title);
          //shows the current url
           String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        //show the site code
        String PageSource = driver.getPageSource();
        System.out.println("the code is:" + PageSource);
            //find element and fill the form
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            Thread.sleep(3000);
            //find login element and click on it
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(3000);
            //open burger menu
            driver.findElement(By.id("react-burger-menu-btn")).click();
        //shows the current url
        String CurrentUrl1 = driver.getCurrentUrl();
        System.out.println(CurrentUrl1);
           Thread.sleep(3000);



            driver.quit();
            System.out.println("execution ended");

}}
