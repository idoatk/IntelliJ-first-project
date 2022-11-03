import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        //clicking the checkbox x path
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
        Thread.sleep(5000);
        //find element
        driver.findElement(By.xpath("//*[@id=\"checkboxes]")).click();
        //find element
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]")).click();
        Thread.sleep(3000);
        driver.quit();




    }

}
