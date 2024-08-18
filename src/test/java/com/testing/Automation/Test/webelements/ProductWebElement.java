package com.testing.Automation.Test.webelements;

import com.testing.Automation.Test.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductWebElement {
    @FindBy(xpath = ProductsPage.PRODUCT_PAGE)
    public WebElement getProductPageText;
    @FindBy(xpath = ProductsPage.ADD_TO_CART_TILE_1)
    public WebElement addToCartTile1;
    @FindBy(xpath = ProductsPage.ADD_TO_CART_TILE_2)
    public WebElement addToCartTile2;
    @FindBy(xpath = ProductsPage.ADD_TO_CART_TILE_3)
    public WebElement addToCartTile3;
    @FindBy(xpath = ProductsPage.REMOVE_TILE_1_BUTTON)
    public WebElement removeTile1Button;
    @FindBy(xpath = ProductsPage.REMOVE_TILE_2_BUTTON)
    public WebElement removeTile2Button;
    @FindBy(xpath = ProductsPage.REMOVE_TILE_3_BUTTON)
    public WebElement removeTile3Button;
    @FindBy(xpath = ProductsPage.SHOPPING_CART)
    public WebElement shoppingCart;
    @FindBy(xpath = ProductsPage.FIRST_NAME)
    public WebElement firstName;
    @FindBy(xpath = ProductsPage.LAST_NAME)
    public WebElement lastName;
    @FindBy(xpath = ProductsPage.POSTAL_CODE)
    public WebElement postalCode;
    @FindBy(xpath = ProductsPage.CONTINUE_BUTTON)
    public WebElement continueButton;
    @FindBy(xpath = ProductsPage.BACK_TO_PRODUCT)
    public WebElement backToProductPage;
    @FindBy(xpath = ProductsPage.CHECK_OUT_BUTTON)
    public WebElement checkOutButton;
    @FindBy(xpath = ProductsPage.PRODUCT_ON_CHECKOUT_PAGE)
    public WebElement productOnCheckoutPage;
    @FindBy(xpath = ProductsPage.REMOVE_BUTTON_ON_CHECKOUT)
    public WebElement removeButtonOnCheckout;
    @FindBy(xpath = ProductsPage.FINISH_BUTTON)
    public WebElement finishButton;
    @FindBy(xpath = ProductsPage.THANKS_MESSAGE)
    public WebElement thanksMessage;
    @FindBy(xpath = ProductsPage.LOGOUT)
    public WebElement logout;
    @FindBy(xpath = ProductsPage.CLICK_SIDE_BAR)
    public WebElement sideBar;
    @FindBy(xpath = ProductsPage.FIRST_NAME_REQUIRED)
    public WebElement firstNameRequiredError;
    @FindBy(xpath = ProductsPage.SORT_DROPDOWN)
    public WebElement sortDropDown;
    @FindBy(xpath = ProductsPage.INVENTORY_LIST)
    public WebElement inventoryList;
    @FindBy(xpath = ProductsPage.NAME_ASCENDING_VALUE_OPTION)
    public WebElement nameAscendingValueOption;
    @FindBy(xpath = ProductsPage.NAME_DESCENDING_VALUE_OPTION)
    public WebElement nameDescendingValueOption;
    @FindBy(xpath = ProductsPage.PRICE_ASCENDING_VALUE_OPTION)
    public WebElement priceAscendingValueOption;
    @FindBy(xpath = ProductsPage.PRICE_DESCENDING_VALUE_OPTION)
    public WebElement priceDescendingValueOption;
    WebDriver driver;
    public ProductWebElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}
