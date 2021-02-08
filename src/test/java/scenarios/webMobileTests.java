package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.WebPageObject;
import setup.BaseTest;

public class webMobileTests extends BaseTest {
    WebPageObject webPageObject;


    @Test(groups = {"web"}, description = "Make sure that we've opened found some EPAM result on page")
    public void simpleGoogleSearchTest() throws InterruptedException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        getDriver().get("https://www.google.com/"); // open Google homepage

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 20).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        // Check Google homepage title
        assert ((WebDriver) getDriver()).getTitle().equals("Google") : "This is not Google homepage";


        getPo().getWelement("chooseSearchField").click();
        getPo().getWelement("chooseSearchField").sendKeys("EPAM");
        getPo().getWelement("chooseFirstResult").click();
        Assert.assertTrue(getPo().getWelement("resultString").isDisplayed());

    }

}
