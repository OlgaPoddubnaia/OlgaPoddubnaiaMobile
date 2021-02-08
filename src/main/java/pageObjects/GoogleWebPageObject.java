package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleWebPageObject extends WebPageObject {


    @FindBy(className = "pR49Ae gsfi")
    private WebElement searchField;
    @FindBy(className = "gLFyf")
    private WebElement chooseSearchField;

    @FindBy(className = "gNO89b")
    private WebElement searchBtn;

    //https://www.google.com/#sbfbu=1&pi=

    public GoogleWebPageObject(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void inputSearch(String searchString) {
        //chooseSearchField.click();
        chooseSearchField.sendKeys(searchString);
        //searchField.sendKeys(searchString);
        searchBtn.click();
    }
}
