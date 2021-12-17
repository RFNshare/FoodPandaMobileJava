package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
//        File appDir = new File("apk");
        File app =  new File("apk", "foodpanda.apk");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung S9+");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.UDID, "2220c33e10037ece");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }
}

