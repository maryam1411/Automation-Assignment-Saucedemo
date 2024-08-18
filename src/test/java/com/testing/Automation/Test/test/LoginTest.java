package com.testing.Automation.Test.test;

import com.testing.Automation.Test.pageobject.LoginPageObject;
import com.testing.Automation.Test.pageobject.ProductPageObject;
import com.testing.Automation.Test.testcore.TestCore;
import com.testing.Automation.Test.utils.ScreenShotUtility;
import com.testing.Automation.Test.webelements.LoginWebElement;
import org.junit.Before;
import org.junit.Test;
import org.testng.xml.dom.Tag;

import java.net.MalformedURLException;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class LoginTest extends TestCore {
    ArrayList<String> test_steps = new ArrayList<String>();
    LoginWebElement loginWebElement;
    ScreenShotUtility screenShotUtility;
    LoginPageObject loginPageObject;
    ProductPageObject productPageObject;


    @Before
    public void setupDrivers() throws MalformedURLException {
        loginWebElement = new LoginWebElement(driver);
        loginPageObject = new LoginPageObject(driver);
        screenShotUtility = new ScreenShotUtility(driver);
        productPageObject = new ProductPageObject(driver);


    }

    @Test
    @Tag(name = "login")
    public void verifyThatUserLoginSuccessfullyAndLandOnProductPage() {
        String testName = "Verify That User Login Successfully And Land On ProductPage";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            assertTrue(productPageObject.isProductPageDisplayed(test_steps));
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
        screenShotUtility.addScreenShotForException(ex, "Unable To Login Successfully", driver);
        }
    }
}

