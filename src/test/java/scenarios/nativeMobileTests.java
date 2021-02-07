package scenarios;

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
        getPo().getWelement("registerBtn").click();
        System.out.println("New page opened");

    }




}
