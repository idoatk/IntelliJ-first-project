package Mapping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    public static Class<Object> java;
    WebDriver driver;

    //define logo element as xpath
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    public static WebElement Logo;
     //define SignInButton as xpath
    @FindBy(xpath ="//*[@id='header']/div[2]/div/div/nav/div[1]/a)")
    public static WebElement SignInButton;


    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
