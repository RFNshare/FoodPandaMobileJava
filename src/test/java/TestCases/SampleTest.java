package TestCases;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SampleTest extends BaseTest {
    public static void main(String[] args) throws MalformedURLException {
     AndroidDriver<AndroidElement> driver = capabilities();
     driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
     driver.findElementByXPath("//android.widget.TextView[@text='Allow Location Access']").click();
//     driver.quit();
    }
}
