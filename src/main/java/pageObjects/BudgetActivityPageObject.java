package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BudgetActivityPageObject extends AbstractNativePageObject{

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android" +
            ".widget.TextView")
    WebElement budgetActivityTitle;

    public BudgetActivityPageObject(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

/*
    public BudgetActivityPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }*/

}
