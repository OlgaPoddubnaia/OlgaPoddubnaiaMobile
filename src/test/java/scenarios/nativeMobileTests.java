package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.ConfProperties;


public class nativeMobileTests extends BaseTest {


    @Test(groups = {"native"}, description = "Test to register")
    public void registerTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        //open register page
        getPo().getWelement("registerBtn").click();
        System.out.println("New account registration page opened");

        //create new account
        getPo().getWelement("email").sendKeys(ConfProperties.getProperty("EMAIL"));
        getPo().getWelement("username").sendKeys(ConfProperties.getProperty("USERNAME"));
        getPo().getWelement("password").sendKeys(ConfProperties.getProperty("PASSWORD"));
        getPo().getWelement("confirmPassword").sendKeys(ConfProperties.getProperty("PASSWORD"));
        getPo().getWelement("agreeCheckbox").click();
        getPo().getWelement("registerNewAccBtn").click();
        System.out.println("Sign in page opened");

        //login with created account
        getPo().getWelement("loginEmail").sendKeys(ConfProperties.getProperty("EMAIL"));
        getPo().getWelement("loginPassword").sendKeys(ConfProperties.getProperty("PASSWORD"));
        getPo().getWelement("signInBtn").click();
        System.out.println("Budget Activity page opened");

        //check is budget activity page opened
        Assert.assertTrue(getPo().getWelement("budgetActivityTitle").getText()
                .contains(ConfProperties.getProperty("BUDGET_TITLE")));
    }
}