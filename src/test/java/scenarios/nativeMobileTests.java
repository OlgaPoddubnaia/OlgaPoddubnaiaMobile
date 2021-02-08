package scenarios;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.ConfProperties;


public class nativeMobileTests extends BaseTest {


    @Test(groups = {"native"}, description = "Test to register")
    public void registerTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPo().getWelement("registerBtn").click();
        System.out.println("New account registration page opened");
        getPo().getWelement("email").sendKeys(ConfProperties.getProperty("EMAIL"));
        getPo().getWelement("username").sendKeys(ConfProperties.getProperty("USERNAME"));
        getPo().getWelement("password").sendKeys(ConfProperties.getProperty("PASSWORD"));
        getPo().getWelement("confirmPassword").sendKeys(ConfProperties.getProperty("PASSWORD"));
        //может не сработать клик на чекбокс
        getPo().getWelement("agreeCheckbox").click();
        getPo().getWelement("registerNewAccBtn").click();
        System.out.println("Sign in page opened");
        getPo().getWelement("loginEmail").sendKeys(ConfProperties.getProperty("EMAIL"));
        getPo().getWelement("loginPassword").sendKeys(ConfProperties.getProperty("PASSWORD"));
        getPo().getWelement("signInBtn").click();
        System.out.println("Budget Activity page opened");
        Assert.assertEquals(getPo().getWelement("budgetActivityTitle").getText(),
                ConfProperties.getProperty("BUDGET_TITLE"));
    }
}
