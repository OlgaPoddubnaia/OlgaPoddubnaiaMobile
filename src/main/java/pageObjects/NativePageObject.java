package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativePageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    @iOSXCUITFindBy()
    WebElement signInBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    @iOSXCUITFindBy()
    WebElement registerBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    @iOSXCUITFindBy()
    WebElement loginEmail;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    @iOSXCUITFindBy()
    WebElement loginPassword;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    @iOSXCUITFindBy()
    WebElement email;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    @iOSXCUITFindBy()
    WebElement username;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    @iOSXCUITFindBy()
    WebElement password;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    @iOSXCUITFindBy()
    WebElement confirmPassword;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android." +
            "widget.ScrollView/android.widget.LinearLayout/android.widget.CheckedTextView")
    @iOSXCUITFindBy()
    WebElement agreeCheckbox;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    @iOSXCUITFindBy()
    WebElement registerNewAccBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android" +
            ".widget.TextView")
    @iOSXCUITFindBy()
    WebElement budgetActivityTitle;

    public NativePageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}
