package com.testing.Automation.Test.test;

import com.testing.Automation.Test.pageobject.LoginPageObject;
import com.testing.Automation.Test.pageobject.ProductDetailObject;
import com.testing.Automation.Test.pageobject.ProductPageObject;
import com.testing.Automation.Test.testcore.TestCore;
import com.testing.Automation.Test.utils.ScreenShotUtility;
import com.testing.Automation.Test.webelements.LoginWebElement;
import com.testing.Automation.Test.webelements.ProductDetailWebElement;
import com.testing.Automation.Test.webelements.ProductWebElement;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import org.testng.xml.dom.Tag;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class ProductDetailTest extends TestCore {
    public static String SHOPPING_CART_COUNT_VALUE = "3";
    public static String CART_COUNT_VALUE = "3";
    ArrayList<String> test_steps = new ArrayList<String>();
    LoginWebElement loginWebElement;
    ScreenShotUtility screenShotUtility;
    LoginPageObject loginPageObject;
    ProductDetailObject productDetailObject;
    ProductDetailWebElement productDetailWebElement;

    @Before
    public void setupDrivers() throws MalformedURLException {
        loginWebElement = new LoginWebElement(driver);
        loginPageObject = new LoginPageObject(driver);
        screenShotUtility = new ScreenShotUtility(driver);
        productDetailObject = new ProductDetailObject(driver);
        productDetailWebElement = new ProductDetailWebElement(driver);


    }

    @Test
    @Tag(name = "ProductDetails")
    public void VerifyThatAddItemsToCartAndRemoveThemFromTheProductDetailsPage() {
        String testName = "Verify That Add Items to Cart and Remove Them from the Product Details Page:";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            productDetailObject.clickProduct(test_steps);
            productDetailObject.clickAddToCart(test_steps);
            productDetailObject.removeProduct(test_steps);
            productDetailObject.backToProduct(test_steps);
            Assert.assertTrue(productDetailObject.addToCartTileIsDisplayed(test_steps));
            Assert.assertEquals(productDetailObject.getShoppingCartCount(test_steps),"");
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Unable To Add Items Into The Cart", driver);
        }
    }

}
