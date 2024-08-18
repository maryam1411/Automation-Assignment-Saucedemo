package com.testing.Automation.Test.test;

import com.testing.Automation.Test.pageobject.LoginPageObject;
import com.testing.Automation.Test.pageobject.ProductPageObject;
import com.testing.Automation.Test.testcore.TestCore;
import com.testing.Automation.Test.utils.ScreenShotUtility;
import com.testing.Automation.Test.webelements.LoginWebElement;
import com.testing.Automation.Test.webelements.ProductWebElement;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.xml.dom.Tag;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest extends TestCore {
    public static String SHOPPING_CART_COUNT_VALUE = "3";
    public static String CART_COUNT_VALUE = "3";
    ArrayList<String> test_steps = new ArrayList<String>();
    LoginWebElement loginWebElement;
    ScreenShotUtility screenShotUtility;
    LoginPageObject loginPageObject;
    ProductPageObject productPageObject;
    ProductWebElement productWebElement;

    @Before
    public void setupDrivers() throws MalformedURLException {
        loginWebElement = new LoginWebElement(driver);
        loginPageObject = new LoginPageObject(driver);
        screenShotUtility = new ScreenShotUtility(driver);
        productPageObject = new ProductPageObject(driver);
        productWebElement = new ProductWebElement(driver);


    }

    @Test
    @Tag(name = "Cart Count")
    public void verifyTheCartItemCount() {
        String testName = "Verify the cart Item Count";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            productPageObject.addItemsIntoTheCart(test_steps);
            Assert.assertEquals(productPageObject.getShoppingCartCount(test_steps), SHOPPING_CART_COUNT_VALUE);
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Unable To Add Items Into The Cart", driver);
        }
    }

    @Test
    @Tag(name = "ProductTile")
    public void VerifyAddToCartOptionReturnsForTheProductTileAfterRemoveItemsIntoTheCart() {
        String testName = "Verify Add to Cart Option Returns For The Product Tile After Remove Items Into The Cart";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            productPageObject.addItemsIntoTheCart(test_steps);
            productPageObject.clickRemoveButton(test_steps);
            Assert.assertTrue(productPageObject.addToCartTile1IsDisplayed(test_steps));
            Assert.assertTrue(productPageObject.addToCartTile2IsDisplayed(test_steps));
            Assert.assertTrue(productPageObject.addToCartTile3IsDisplayed(test_steps));
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Unable To See Add to The Cart Product Tile", driver);
        }
    }

    @Test
    @Tag(name = "Checkout")
    public void AddItemsToTheCartAndRemoveThemFromTheCheckoutPageVerifyThatItIsRemovedFromTheCartSuccessfully() {
        String testName = "Add Items to The Cart and Remove Them from the Checkout Page Verify that it is removed from the cart successfully";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            productPageObject.addItemsIntoTheCart(test_steps);
            productPageObject.clickShoppingCartButton(test_steps);
            productPageObject.clickCheckOutButton(test_steps);
            productPageObject.enterFirstName(test_steps);
            productPageObject.enterLastName(test_steps);
            productPageObject.enterPostalCode(test_steps);
            productPageObject.clickContinueShopping(test_steps);
            productPageObject.clickItemOnCheckOutPage(test_steps);
            productPageObject.removeItemOnCheckOutPage(test_steps);
            Assert.assertEquals(productPageObject.getShoppingCartCount(test_steps), "2");
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Unable To Remove Item On CheckOut Page", driver);
        }
    }

    @Test
    @Tag(name = "BuyItems")
    public void verifyItemsBuySuccessfully() {
        String testName = "verify Items Buy Successfully";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            productPageObject.addItemsIntoTheCart(test_steps);
            productPageObject.clickShoppingCartButton(test_steps);
            productPageObject.clickCheckOutButton(test_steps);
            productPageObject.enterFirstName(test_steps);
            productPageObject.enterLastName(test_steps);
            productPageObject.enterPostalCode(test_steps);
            productPageObject.clickContinueShopping(test_steps);
            productPageObject.clickFinishButton(test_steps);
            Assert.assertTrue(productPageObject.thanksOrderMessageIsDisplayed(test_steps), "2");
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Unable To See Successfully Order Completion message", driver);
        }
    }

    @Test
    @Tag(name = "CartPersistence")
    public void addItemsToTheCartLogOutLogBackInAndVerifyThatTheCartRetainsTheItems() {
        String testName = "Add Items To The Cart LogOut LogBack In And Verify That The Cart Retains The Items";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            productPageObject.addItemsIntoTheCart(test_steps);
            productPageObject.clickSideBarPanel(test_steps);
            productPageObject.clickLogoutButton(test_steps);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            Assert.assertEquals(productPageObject.getShoppingCartCount(test_steps), "3");
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, " Cart is not displaying the right count", driver);
        }
    }

    @Test
    @Tag(name = "SortingAscendingOrderOnNameOfProduct")
    public void verifySortingNameInAscendingOrder() throws JSONException {
        String testName = "Sorting Name In Ascending Order";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            List<String> sortedNames =  getInventoryProductsNames();
            List<String> expectedSortedNames = new ArrayList<>(sortedNames);
            Collections.sort(expectedSortedNames);
            Assert.assertEquals(sortedNames, expectedSortedNames, "Product list name is sorted in ascending order");
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Product list name is not sorted in ascending order", driver);
        }
    }
    @Test
    @Tag(name = "SortingDescendingOrderOnNameOfProduct")
    public void verifySortingInDescendingOrder() throws JSONException {
        String testName = "Sorting Name In Descending Order";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            List<String> unsortedNames =  getInventoryProductsNames();
            productPageObject.clickSortDropDown(test_steps);
            productPageObject.clickDescendingNameMenu(test_steps);
            List<String> actualSortedNames =  getInventoryProductsNames();
            List<String> expectedSortedNames = new ArrayList<>(unsortedNames);
            expectedSortedNames.sort(Collections.reverseOrder());
            Assert.assertEquals(actualSortedNames, expectedSortedNames);
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Product list is not sorted in Descending order", driver);
        }
    }
    @Test
    @Tag(name = "SortingAscendingOrderOnPriceOfProduct")
    public void verifySortingPriceInAscendingOrder() throws JSONException {
        String testName = "Sorting Price In Ascending Order";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            List<Double> unsortedProductsPrices = getInventoryProductsPrices();
            productPageObject.clickSortDropDown(test_steps);
            productPageObject.clickAscendingOrderPriceMenu(test_steps);
            List<Double> actualSortedProductsPrices = getInventoryProductsPrices();
            List<Double> expectedSortedPrices = new ArrayList<>(unsortedProductsPrices);
            Collections.sort(expectedSortedPrices);
            Assert.assertEquals(actualSortedProductsPrices, expectedSortedPrices, "Product list price is sorted in ascending order");
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Product list price is not sorted in ascending order", driver);
        }
    }
    @Test
    @Tag(name = "InventoryItemSortingOnPriceInDescendingOrder")
    public void verifyInventoryItemSortingOnPriceInDescendingOrder() throws JSONException {
        String testName = "Sorting Price In Descending Order";
        try {
            test_steps.add("Access the web application");
            createTest(testName);
            loginPageObject.enterUserName(test_steps);
            loginPageObject.enterPassword(test_steps);
            loginPageObject.clickLoginButton(test_steps);
            List<Double> unsortedProductsPrices = getInventoryProductsPrices();
            productPageObject.clickSortDropDown(test_steps);
            productPageObject.clickDescendingPriceMenu(test_steps);
            List<Double> actualSortedProductsPrices = getInventoryProductsPrices();
            List<Double> expectedSortedPrices = new ArrayList<>(unsortedProductsPrices);
            expectedSortedPrices.sort(Collections.reverseOrder());
            Assert.assertEquals(actualSortedProductsPrices,expectedSortedPrices );
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShot(driver);
        } catch (Exception ex) {
            TestCore.addTestStepsIntoReport(test_steps);
            screenShotUtility.addScreenShotForException(ex, "Product list is not sorted in Descending order", driver);
        }
    }

    private List<Double> getInventoryProductsPrices() {
        List<WebElement> inventoryItems =productPageObject.getInventoryList(test_steps);
        List<Double> productPrices = new ArrayList<>();
        for (WebElement element : inventoryItems) {
            productPrices.add(productPageObject.getInventoryItemPrice(test_steps,element));
        }
        return productPrices ;
    }
    private List<String> getInventoryProductsNames() {
        List<WebElement> inventoryItems =productPageObject.getInventoryList(test_steps);
        List<String> productNames = new ArrayList<>();
        for (WebElement element : inventoryItems) {
            productNames.add(productPageObject.getInventoryItemName(test_steps,element));
        }
        return productNames ;
    }
}


