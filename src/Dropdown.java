import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
       Thread.sleep(3300);
       //click on dropdown row
       driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a")).click();
       //mark as place
        Select select = new Select(driver.findElement(By.id("dropdown")));
        //printing the option of dropdown by list
        List<WebElement> lst = select.getOptions();
        System.out.println("the dropdown option are: ");
        for(WebElement option: lst)
            System.out.println(option.getText());
        Thread.sleep(5000);
        //select by index- select purple,selectByIndex
        System.out.println("select the option by index 2");
       select.selectByIndex(2);
        System.out.println("select value is:"+ select.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        //select by visible text
        System.out.println("select by text-option 1");
        select.selectByVisibleText("Option 1");
        System.out.println("select value is: " + select.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        //select by value
        System.out.println("selct by value 2");
        select. selectByValue("2");
        System.out.println("select value is: " + select.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        driver.quit();





    }
}