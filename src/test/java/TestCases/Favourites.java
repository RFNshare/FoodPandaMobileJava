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

public class Favourites extends BaseTest {

    AndroidDriver<AndroidElement> driver = capabilities();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();

    public Favourites() throws MalformedURLException {
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
    public void favTest() {
        buttonAndTexts.btnClick(Locators.leftSidebar);
        timeOut.timeOut();
        buttonAndTexts.BtnSClick(Locators.allSidebarMenu, 0);
        timeOut.timeOut();
        buttonAndTexts.BtnSClick(Locators.deliveryOrPickup, 1);
        timeOut.timeOut();
        buttonAndTexts.BtnSClick(Locators.resOrShops, 2);
        timeOut.timeOut();


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
