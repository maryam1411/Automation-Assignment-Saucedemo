package com.testing.Automation.Test.webelements;

import com.testing.Automation.Test.pages.ProductDetailsPage;
import com.testing.Automation.Test.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailWebElement {
    WebDriver driver;
    public ProductDetailWebElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = ProductDetailsPage.CLICK_PRODUCT)
    public WebElement clickProduct;
    @FindBy(xpath = ProductDetailsPage.ADD_TO_CART)
    public WebElement addToCart;
    @FindBy(xpath = ProductDetailsPage.REMOVE_BUTTON)
    public WebElement removeButton;
    @FindBy(xpath = ProductDetailsPage.BACK_TO_PRODUCT)
    public WebElement backToProduct;
    @FindBy(xpath = ProductDetailsPage.ADD_TO_CART_TILE)
    public WebElement addToCartTile;
    @FindBy(xpath = ProductDetailsPage.SHOPPING_CART)
    public WebElement shoppingCart;
}
