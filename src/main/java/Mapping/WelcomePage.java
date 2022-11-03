package Mapping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    public static Class<Object> java;
    WebDriver driver;

    //define logo element as xpath
    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    public static WebElement Logo;
    //define SignInButton as xpath
    @FindBy(xpath ="//*[@id='header']/div[2]/div/div/nav/div[1]/a)")
    public static WebElement SignInButton;
    // define ContactUsButton as xpath
    @FindBy(xpath = "//*[@id='contact-link']/a")
    public static WebElement ContactUsButton;
    //define Save70 button as xpath
    @FindBy(xpath = "//*[@id='header']/div[1]/div/div/a/img")
    public static WebElement Sava70Button;
    //Call us as x p
    // define searchField x path
    @FindBy(xpath = "//*[@id='search_query_top']")
    public static WebElement SearchField;
    //define SearchIn as xpath
    @FindBy(xpath = "//*[@id='searchInbox']/button")
    public static WebElement SearchInbox;
    //define  CartField as xpath
    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a/b")
    public static WebElement  CartField;
    //define WomenLink as xpath
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public static WebElement WomenLink;
    //define DressesLink as xpath
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    public static WebElement DressesLink;
    // define TshirtsLinkas xpath
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public static WebElement TshirtsLink;
    // define ShopNow as xpath
    @FindBy(xpath = "//*[@id='homeslider']/li[2]/div/p[1")
    public static WebElement ShopNow;

    //define RightShopNow as x path
    @FindBy(xpath = " //*[@id='homepage-slider']/div/div[2]/div/a[2]")
    public static WebElement RightShopNow;

    //define  LeftShopNow as xpath
    @FindBy(xpath = "//*[@id='homepage-slider']/div/div[2]/div/a[1]")
    public static WebElement LeftShopNow;
    //define Sale as xpath
    @FindBy(xpath = "//*[@id='htmlcontent_top']/ul/li[1]/a/img")
    public static WebElement Sale;
    //define Summer as x path
    @FindBy(xpath = "//*[@id='htmlcontent_top']/ul/li[2]/a/img")
    public static WebElement Summer;
    //define PupolarTab as xpath
    @FindBy(xpath = "//*[@id='home-page-tabs']/li[1]/a")
    public static WebElement PupolarTab;
    //define BestsellerTab as x path
    @FindBy(xpath = "//*[@id='home-page-tabs']/li[2]/a")
    public static WebElement BestsellerTab;
    //  define TshirtPicture as xpath
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
    public static WebElement TshirtPicture;
    //define blouse picture (more) as xpath
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
    public static WebElement BlouseMore;
    //define blouse add to cart as x path
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
    public static WebElement BlouseAddtocart;
    //define PrintedDressAddtocard as xpath
    @FindBy(xpath = "//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]/span")
    public static WebElement PrintedDressAddtocard;
    //define PrintedDressMores as xpath
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
    public static WebElement PrintedDressMore;

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
    public static WebElement PrintedDress2;



    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
