package TestCases;

import Base.BaseTest;
import Models.ButtonAndTexts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Locators;
import utilities.TimeOut;

import java.net.MalformedURLException;

public class search extends BaseTest {

    AndroidDriver<AndroidElement> driver = capabilities();
    ButtonAndTexts buttonAndTexts = new ButtonAndTexts(driver);
    TimeOut timeOut = new TimeOut();

    public search() throws MalformedURLException {
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
    public void searchTest() {
       buttonAndTexts.btnClick(Locators.clickSearchFiled);
       buttonAndTexts.textField(Locators.sendDataToSearchFiled, "Haji");
    }
}
