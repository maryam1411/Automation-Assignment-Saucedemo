package com.testing.Automation.Test.pageobject;

import com.testing.Automation.Test.pages.BasePage;
import com.testing.Automation.Test.webelements.ProductDetailWebElement;
import org.json.JSONException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ProductDetailObject extends BasePage {
    public static Logger reslogger = Logger.getLogger("Product Page");
    ProductDetailWebElement productDetailWebElement;

    public ProductDetailObject(WebDriver driver) throws MalformedURLException {
        super(driver);
        PageFactory.initElements(factory, this);
        productDetailWebElement = new ProductDetailWebElement(driver);
    }

    public void clickProduct(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Product");
        reslogger.info("Click Product");
        productDetailWebElement.clickProduct.click();
    }

    public void clickAddToCart(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Add To Cart on Product Detail Page");
        reslogger.info("Click Add To Cart on Product Detail Page");
        productDetailWebElement.addToCart.click();
    }

    public void removeProduct(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Remove Product On Product Detail Page");
        reslogger.info("Remove Product On Product Detail Page");
        productDetailWebElement.removeButton.click();
    }

    public void backToProduct(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Click Back To Product Button");
        reslogger.info("Click Back To Product Button");
        productDetailWebElement.backToProduct.click();
    }

    public boolean addToCartTileIsDisplayed(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Add To Cart Tile Is Displayed");
        reslogger.info("Add To Cart Tile Is Displayed");
       return productDetailWebElement.addToCartTile.isDisplayed();
    }

    public String getShoppingCartCount(ArrayList<String> test_steps) throws JSONException {
        test_steps.add("Display Shopping Cart Count");
        reslogger.info("Display Shopping Cart Count");
        return productDetailWebElement.shoppingCart.getText();
    }


}
