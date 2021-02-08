package scenarios;


import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;


public class nativeMobileTests extends BaseTest {


    @Test(groups = {"native"}, description = "Test to register")
    public void registerTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
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
    }
}
