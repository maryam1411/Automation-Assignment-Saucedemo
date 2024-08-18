package com.testing.Automation.Test.pageobject;

import com.testing.Automation.Test.pages.BasePage;
import com.testing.Automation.Test.pages.ProductsPage;
import com.testing.Automation.Test.webelements.ProductWebElement;
import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ProductPageObject extends BasePage {
    public static Logger reslogger = Logger.getLogger("Product Page");
    ProductWebElement productWebElement;

    public ProductPageObject(WebDriver driver) throws MalformedURLException {
        super(driver);
        PageFactory.initElements(factory, this);
        productWebElement = new ProductWebElement(driver);
    }

    public boolean isProductPageDisplayed(ArrayList<String> test_steps) {
        test_steps.add("Products page displaying after successful login");
        reslogger.info("Products page displaying after successful login");
        return productWebElement.getProductPageText.isDisplayed();
    }

    public void addItemsIntoTheCart(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Add Items In to The Shopping Cart");
        reslogger.info("Add Items In to The Shopping Cart");
        productWebElement.addToCartTile1.click();
        productWebElement.addToCartTile2.click();
        productWebElement.addToCartTile3.click();

    }

    public void clickRemoveButton(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Remove Items In to The Shopping Cart");
        reslogger.info("Remove Items In to The Shopping Cart");
        productWebElement.removeTile1Button.click();
        productWebElement.removeTile2Button.click();
        productWebElement.removeTile3Button.click();

    }

    public void clickShoppingCartButton(ArrayList<String> test_steps) {
        test_steps.add("Click Shopping Cart Button");
        reslogger.info("Click Shopping Cart Button");
        productWebElement.shoppingCart.click();
    }

    public String getShoppingCartCount(ArrayList<String> test_steps) {
        test_steps.add("Shopping Cart is displaying right Item Count");
        reslogger.info("Shopping Cart is displaying right Item Count");
        return productWebElement.shoppingCart.getText();
    }

    public boolean addToCartTile1IsDisplayed(ArrayList<String> test_steps) {
        test_steps.add("Add To Cart Tile 1 Is Displayed.");
        reslogger.info("Add To Cart Tile 1 Is Displayed.");
        return productWebElement.addToCartTile1.isDisplayed();
    }

    public boolean addToCartTile2IsDisplayed(ArrayList<String> test_steps) {
        test_steps.add("Add To Cart Tile 2 Is Displayed.");
        reslogger.info("Add To Cart Tile 2 Is Displayed.");
        return productWebElement.addToCartTile2.isDisplayed();
    }

    public boolean addToCartTile3IsDisplayed(ArrayList<String> test_steps) {
        test_steps.add("Add To Cart Tile 3 Is Displayed.");
        reslogger.info("Add To Cart Tile 3 Is Displayed.");
        return productWebElement.addToCartTile3.isDisplayed();
    }

    public void clickCheckOutButton(ArrayList<String> test_steps) {
        test_steps.add("Click Checkout Button");
        reslogger.info("Click Checkout Button");
        productWebElement.checkOutButton.click();

    }

    public void enterFirstName(ArrayList<String> test_steps) {
        test_steps.add("Enter First Name: " + "Maryam");
        reslogger.info("Enter First Name: " + "Maryam");
        productWebElement.firstName.sendKeys("Maryam");
    }

    public void enterLastName(ArrayList<String> test_steps) {
        test_steps.add("Enter Last Name: " + "Tanveer");
        reslogger.info("Enter Last Name: " + "Tanveer");
        productWebElement.lastName.sendKeys("Tanveer");
    }

    public void enterPostalCode(ArrayList<String> test_steps) {
        test_steps.add("Enter Postal Code: " + "7100");
        reslogger.info("Enter Postal Code: " + "7100");
        productWebElement.postalCode.sendKeys("7100");
    }

    public void clickContinueShopping(ArrayList<String> test_steps) {
        test_steps.add("Click Continue Shopping Button");
        reslogger.info("Click Continue Shopping Button");
        productWebElement.continueButton.click();
    }

    public void clickItemOnCheckOutPage(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Item On CheckOut Page");
        reslogger.info("Click Item On CheckOut Page");
        productWebElement.productOnCheckoutPage.click();

    }

    public void removeItemOnCheckOutPage(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Remove Item On CheckOut Page");
        reslogger.info("Remove Item On CheckOut Page");
        productWebElement.removeButtonOnCheckout.click();
        productWebElement.backToProductPage.click();
    }

    public void clickFinishButton(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Finish Button");
        reslogger.info("Click Finish Button");
        productWebElement.finishButton.click();

    }

    public boolean thanksOrderMessageIsDisplayed(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Thanks Order Message Is Displayed");
        reslogger.info("Thanks Order Message Is Displayed");
        return productWebElement.thanksMessage.isDisplayed();

    }

    public void clickSideBarPanel(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Side Bar Panel");
        reslogger.info("Click Side Bar Panel");
        productWebElement.sideBar.click();

    }

    public void clickLogoutButton(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Logout Button");
        reslogger.info("Click Logout Button");
        productWebElement.logout.click();

    }

    public boolean firstNameRequiredErrorIsDisplayed(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("First Name Required Error Is Displayed");
        reslogger.info("First Name Required Error Is Displayed");
        return productWebElement.firstNameRequiredError.isDisplayed();

    }

    public List<WebElement> getInventoryList(ArrayList<String> test_steps) {
        test_steps.add("Get All Inventory List Items");
        reslogger.info("Get All Inventory List Items");
        return driver.findElements(By.xpath(ProductsPage.INVENTORY_LIST));
    }

    public String getInventoryItemName(ArrayList<String> test_steps, WebElement element) {
        String result = element.findElement(By.className(ProductsPage.INVENTORY_ITEM_CLASS_NAME)).getText();
        test_steps.add("Getting Inventory Name From List Item " + result);
        reslogger.info("Getting Inventory Name From List Item " + result);
        return result;
    }
    public double getInventoryItemPrice(ArrayList<String> test_steps, WebElement element) {
        String result = element.findElement(By.className(ProductsPage.INVENTORY_ITEM_CLASS_PRICE)).getText();
        String cleanedString = result.replace("$", "");
        double number = Double.parseDouble(cleanedString.trim());
        test_steps.add("Getting Inventory Price From List Item " + result);
        reslogger.info("Getting Inventory Price From List Item " + result);
        return number;
    }

    public void clickDescendingNameMenu(ArrayList<String> test_steps) throws JSONException {
        productWebElement.nameDescendingValueOption.click();
        test_steps.add("Click Descending Value Option");
        reslogger.info("Click Descending Value Option");

    }
    public void clickDescendingPriceMenu(ArrayList<String> test_steps) throws JSONException {
        productWebElement.priceDescendingValueOption.click();
        test_steps.add("Click On Price Descending Value Option");
        reslogger.info("Click On Price Descending Value Option");

    }
    public void clickAscendingOrderPriceMenu(ArrayList<String> test_steps) throws JSONException {
        productWebElement.priceAscendingValueOption.click();
        test_steps.add("Click On Price Ascending Value Option");
        reslogger.info("Click On Price Ascending Value Option");

    }

    public void clickSortDropDown(ArrayList<String> test_steps) throws JSONException {
        productWebElement.sortDropDown.click();
        test_steps.add("Click On Sort Drop Down");
        reslogger.info("Click On Sort Drop Down");

    }
}
