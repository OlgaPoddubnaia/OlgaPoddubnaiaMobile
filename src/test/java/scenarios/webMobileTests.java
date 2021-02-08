package scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.BaseTest;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Make sure that we've opened IANA homepage")
    public void simpleWebTest() throws InterruptedException {
        getDriver().get("http://iana.org"); // open IANA homepage

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        // Check IANA homepage title
        assert ((WebDriver) getDriver()).getTitle().equals("Internet Assigned Numbers Authority") : "This is not IANA homepage";

        // Log that test finished
        System.out.println("Site opening done");
    }
 @Test(groups = {"web"}, description = "Make sure that we've opened found some EPAM result on page")
    public void simpleGoogleSearchTest() throws InterruptedException {
        getDriver().get("https://www.google.com/"); // open Google homepage

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 20).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        // Check Google homepage title
        assert ((WebDriver) getDriver()).getTitle().equals("Google") : "This is not Google homepage";


    }

}
