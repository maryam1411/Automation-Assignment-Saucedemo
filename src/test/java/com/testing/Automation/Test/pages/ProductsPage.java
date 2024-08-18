package com.testing.Automation.Test.pages;

public class ProductsPage {
    public static final String PRODUCT_PAGE = "//span[contains(text(),'Products')]";
    public static final String ADD_TO_CART_TILE_1 = "//button[contains(@name,'add-to-cart-sauce-labs-backpack')]";
    public static final String ADD_TO_CART_TILE_2 = "//button[contains(@name,'add-to-cart-sauce-labs-bike-light')]";
    public static final String ADD_TO_CART_TILE_3 = "//button[contains(@name,'add-to-cart-sauce-labs-bolt-t-shirt')]";
    public static final String REMOVE_TILE_1_BUTTON = "//button[contains(@name,'remove-sauce-labs-backpack')]";
    public static final String REMOVE_TILE_2_BUTTON = "//button[contains(@name,'remove-sauce-labs-bike-light')]";
    public static final String REMOVE_TILE_3_BUTTON = "//button[contains(@name,'remove-sauce-labs-bolt-t-shirt')]";
    public static final String SHOPPING_CART = "//div[@id='shopping_cart_container']";
    public static final String CHECK_OUT_BUTTON = "//button[contains(@name,'checkout')]";

    //CheckOut Details
    public static final String FIRST_NAME = "//input[contains(@name,'firstName')]";
    public static final String LAST_NAME = "//input[contains(@name,'lastName')]";
    public static final String POSTAL_CODE = "//input[contains(@name,'postalCode')]";
    public static final String CONTINUE_BUTTON = "//input[contains(@name,'continue')]";
    public static final String BACK_TO_PRODUCT = "//button[contains(@name,'back-to-products')]";
    public static final String PRODUCT_ON_CHECKOUT_PAGE = "//div[@class='inventory_item_name' and @data-test='inventory-item-name']";
    public static final String REMOVE_BUTTON_ON_CHECKOUT = "//button[contains(@data-test,'remove')]";
    public static final String FINISH_BUTTON = "//button[contains(@data-test,'finish')]";
    public static final String THANKS_MESSAGE = "//h2[contains(@data-test,'complete-header')]";
    public static final String LOGOUT = "//a[contains(@data-test,'logout-sidebar-link')]";
    public static final String CLICK_SIDE_BAR = "//button[contains(@id,'react-burger-menu-btn')]";

    //Required Field Error
    public static final String FIRST_NAME_REQUIRED = "//div[contains(@class,'error-message-container error')]";
    // sorting
    public static final String SORT_DROPDOWN = "//select[contains(@data-test,'product-sort-container')]";
    public static final String INVENTORY_LIST = "//div[@class='inventory_item']";
    public static final String INVENTORY_ITEM_CLASS_NAME = "inventory_item_name";
    public static final String INVENTORY_ITEM_CLASS_PRICE = "inventory_item_price";

    public static final String NAME_ASCENDING_VALUE_OPTION = "//select/option[@value='az']";
    public static final String NAME_DESCENDING_VALUE_OPTION = "//select/option[@value='za']";
    public static final String PRICE_ASCENDING_VALUE_OPTION = "//select/option[@value='lohi']";
    public static final String PRICE_DESCENDING_VALUE_OPTION = "//select/option[@value='hilo']";

}
