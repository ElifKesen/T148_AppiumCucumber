package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;

public class ObiletPage {
    public ObiletPage() {
        PageFactory.initElements(BrowserDriver.getBrowserDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='sidebar toggle'])[1]")
    public WebElement HamburgerButon;

    @FindBy(xpath = "//*[@class='language']")
    public WebElement DilSecmeButon;

    @FindBy(xpath = "(//*[@data-language='tr-TR'])[1]")
    public WebElement TurkceButon;

    @FindBy(xpath = "//*[@class='currency']")
    public WebElement ParaBirimiSecmeButonu;


    @FindBy(xpath = "(//*[@class='currency-name'])[1]")
    public WebElement TLButonu;

    @FindBy(xpath = "//*[@id='search-button']")
    public WebElement SearchButonu;

    @FindBy(xpath = "(//span[@class='amount-sign'])[1]")
    public WebElement FiyatBilgisi;



}
