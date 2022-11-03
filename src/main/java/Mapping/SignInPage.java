package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public static Class<Object> java;
    WebDriver driver;

    //define logo element as xpath
    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    public static WebElement Logo;
    //define signinbutton as xpath
    @FindBy(xpath ="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public static WebElement SignInButton;
    //define contact us button as xpath
    @FindBy(xpath = "//*[@id='contact-link']/a")
    public static WebElement ContactUsButton;
    //define Sava as x path
    @FindBy(xpath = "//*[@id='header']/div[1]/div/div/a/img")
    public static WebElement Save;
    //define Search field as x path
    @FindBy(xpath = "//*[@id='search_query_top']")
    public static WebElement Search;
    //define Cart as x path
    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a)")
    public static WebElement Cart;
    //define Women as x path
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public static WebElement Women;
    // define Dresses as x path
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    public static WebElement Dresses;
    //define T-shirt as x path
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public static WebElement T_shirts;
    //define authentication as x path
    @FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
    public static WebElement Authentication;
    //define e mail column as x path
    @FindBy(xpath = "//*[@id='email_create']")
    public static WebElement Emailcolumn;
    //define Create an account as x path
    @FindBy(xpath = "//*[@id='SubmitCreate']/span")
    public static WebElement CreateAnAccount;
    //define EmailAdress  text box as x path
    @FindBy(xpath = "//*[@id='email']")
    public static WebElement Emailadress;
    //define Password text box as x path
    @FindBy(xpath ="//*[@id='password']" )
    public static WebElement Password;
    //define Forget your password as x path
    @FindBy(xpath = " //*[@id='login_form']/div/p[1]/a" )
    public static WebElement  ForgetPassword;
    //define sign in as x path
    @FindBy(xpath = "//*[@id='SubmitLogin']/span" )
    public static WebElement   Signin;
    //define already registered  as x path
    @FindBy(xpath = "//*[@id='login_form']/h3"  )
    public static WebElement   Alreadyregistered;
    //define Create An Account title as x path
    @FindBy(xpath = " //*[@id='create-account_form']/h3"  )
    public static WebElement   CreatwAnAccounttittle;




    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }}