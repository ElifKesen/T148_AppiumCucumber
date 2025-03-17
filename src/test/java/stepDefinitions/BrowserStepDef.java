package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDef {
    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Ilgili kutucugun oldugunu dogrular")
    public void ilgili_kutucugun_oldugunu_dogrular() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("arama kutusu",BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='searchBoxMobile-DmpWM5eCRfKtYEKA7pC5']").isDisplayed());
        Thread.sleep(5000);
        BrowserDriver.getBrowserDriver().findElementByXPath("(//*[@class='IDVNGX_TmY60KRz5vjC_'])[1]']").click();
        Thread.sleep(5000);
       // Assert.assertTrue("Listenin tümü",BrowserDriver.getBrowserDriver().findElementByXPath("///*[@class='sf-index-SGIfx4jN2uLPJUF5zlbj sf-index-dJhot6HvGL_3RLN4dINs']']").isDisplayed());

    }











}
