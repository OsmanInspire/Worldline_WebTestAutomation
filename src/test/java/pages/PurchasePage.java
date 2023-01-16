package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class PurchasePage extends BasePage{
    @FindBy(xpath = "//*[@id='nav-logo-sprites']")
    public WebElement pageTitle;


    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBar;

    @FindBy(xpath = "//span[@id='nav-search-submit-text']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement verifySearchPage;

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement productLink;

    @FindBy(xpath = "(//input[@id='add-to-cart-button'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "//div[@id='nav-tools']/a[2]")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement inputEmail;

    @FindBy(xpath = "(//*[@id='continue'])[1]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id='ap_password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='signInSubmit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']//span")
    public WebElement verifyCart;

    @FindBy(xpath = "//div[@id='nav-tools']/a[5]")
    public WebElement cart;

    @FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
    public WebElement itemInfo;

    @FindBy(xpath = "//*[@id='attach-close_sideSheet-link']")
    public WebElement cartSubtotal;

    @FindBy(xpath = "//span[@class='a-size-small sc-action-delete']")
    public WebElement deleteItemFromCart;

    public boolean VerifyDashboard() {
        return pageTitle.isDisplayed();
    }
    public static String itemInfoText;

    public String verifyItem(){
        return Driver.get().findElement(By.xpath("//span/a/span/span/span[2]")).getText();
    }


}
