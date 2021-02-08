package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject {

    @FindBy(xpath = ("//input[@name='q']"))
    private WebElement chooseSearchField;

    @FindBy(className = "gNO89b")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[@role='heading']/div[contains(text(),'EPAM')]")
    private WebElement resultString;

@FindBy(css = " ul > li")
    private WebElement chooseFirstResult;


    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);

    }
}
