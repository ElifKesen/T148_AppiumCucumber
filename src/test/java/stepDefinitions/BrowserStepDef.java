package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ObiletPage;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDef {
    ObiletPage page=new ObiletPage();
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

       BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='sf-DownloadAppIcon-HqDeeweXhmgtqbV9yykK']").click();//app indir
    }

    @When("Dil olarak Turkce secer")
    public void dil_olarak_turkce_secer() throws InterruptedException {
        page.HamburgerButon.click();
        Thread.sleep(2000);
        page.DilSecmeButon.click();
        Thread.sleep(2000);
        page.TurkceButon.click();
        Thread.sleep(2000);
    }

    @When("Para birimi olarak TL secer")
    public void para_birimi_olarak_tl_secer() throws InterruptedException {
        page.HamburgerButon.click();
        Thread.sleep(2000);
        page.ParaBirimiSecmeButonu.click();
        Thread.sleep(2000);
        page.TLButonu.click();
    }

    @When("Bul secenegine tiklar")
    public void bul_secenegine_tiklar() {
        page.SearchButonu.click();
    }

    @Then("Gelen bilet fiyatinin TL oldugunu dogrular")
    public void gelen_bilet_fiyatinin_tl_oldugunu_dogrular() {
       String TurkLirasi =page.FiyatBilgisi.getText();
       Assert.assertTrue(TurkLirasi.equals("TL"));

    }












}
