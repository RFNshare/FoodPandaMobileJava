package TestCases;

import Models.ButtonAndTexts;
import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Locators;
import utilities.TimeOut;

import java.net.MalformedURLException;

public class logout extends BaseTest {

    AndroidDriver<AndroidElement> driver = capabilities();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();

    public logout() throws MalformedURLException {
    }

    @BeforeTest
    public void beforeTests() {
        timeOut.timeOut();
        buttonAndTexts.BtnSClick(Locators.enterMyLocation, 2);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.confirmLoc);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.leftSidebar);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginBtn);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginBtnWithEmail);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.emailField, Locators.emailText);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.emailFieldConfirm);
        timeOut.timeOut();
        buttonAndTexts.textField(Locators.passwordField, Locators.passwordText);
        timeOut.timeOut();
        buttonAndTexts.btnClick(Locators.loginConfirm);
        timeOut.timeOut();
        timeOut.timeOutFixed(30000);
    }


    @Test
    public void logoutTest() {
        buttonAndTexts.btnClick(Locators.leftSidebar);
        timeOut.timeOut();
        String name = "Log out";
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + name + "\").instance(0))");
        buttonAndTexts.BtnSClick(Locators.allSidebarMenu, 9);
        timeOut.timeOut();
        buttonAndTexts.BtnSClick(Locators.logoutBtn, 1);
        timeOut.timeOut();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
