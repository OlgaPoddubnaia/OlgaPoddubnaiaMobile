package scenarios;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.util.concurrent.TimeUnit;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button")
    public void simpleNativeTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPo().getWelement("signInBtn").click();
        System.out.println("Simplest Android native test done");

    }

    @Test(groups = {"native"}, description = "Test to register")
    public void registerTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        // new WebDriverWait(getDriver(), 20).until(ExpectedConditions.elementToBeClickable(getPo().getWelement("registerBtn")));
        getPo().getWelement("registerBtn").click();
        System.out.println("New page opened");
        getPo().getWelement("email").sendKeys("hello@mail.ru");
        getPo().getWelement("username").sendKeys("helloWorld");
        getPo().getWelement("password").sendKeys("12345678");
        getPo().getWelement("confirmPassword").sendKeys("12345678");
        //может не сработать клик на чекбокс
        getPo().getWelement("agreeCheckbox").click();
        getPo().getWelement("registerNewAccBtn").click();
        getPo().getWelement("loginEmail").sendKeys("hello@mail.ru");
        getPo().getWelement("loginPassword").sendKeys("12345678");
        getPo().getWelement("signInBtn").click();
        Assert.assertEquals(getPo().getWelement("budgetActivityTitle").getText(), "BudgetActivity");
        Assert.assertEquals(getPo().getWelement(getDriver().getTitle()), "BudgetActivity");
    }


}
