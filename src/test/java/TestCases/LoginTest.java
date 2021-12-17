package TestCases;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.findElementByXPath("//android.widget.TextView[@text='Allow Location Access']").click();
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Navigation menu\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@text=\"Log in / Create account\"]").click();

//        driver.findElementById("com.global.foodpanda.android:id/userNameTextView").click();
        driver.findElementById("com.global.foodpanda.android:id/coreButtonTitleTextView").click();

        // Email
        driver.findElementById("com.global.foodpanda.android:id/inputFieldEditText").sendKeys("af.qups@gmail.com");
        driver.findElementById("com.global.foodpanda.android:id/coreButtonTitleTextView").click();
        // Password
        driver.findElementById("//android.widget.EditText[@text=\"Password\"]").sendKeys("asdfgh123");
        driver.findElementById("com.global.foodpanda.android:id/coreButtonTitleTextView").click();
    }

}
