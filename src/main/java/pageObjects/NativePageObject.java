package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativePageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    WebElement signInBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Register new account']")
    WebElement registerBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    WebElement loginEmail;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    WebElement loginPassword;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='user@example.com']")
    WebElement email;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='TimApple']")
    WebElement username;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Required']")
    WebElement password;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Repeat please']")
    WebElement confirmPassword;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android." +
            "widget.ScrollView/android.widget.LinearLayout/android.widget.CheckedTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch")
    WebElement agreeCheckbox;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Register new account']")
    WebElement registerNewAccBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android" +
            ".widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Budget']")
    WebElement budgetActivityTitle;

    public NativePageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}