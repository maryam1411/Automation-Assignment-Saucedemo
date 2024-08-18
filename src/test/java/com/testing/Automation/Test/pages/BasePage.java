package com.testing.Automation.Test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private static final String SITE_URL = "https://www.saucedemo.com";
    protected final WebDriver driver;
    protected AjaxElementLocatorFactory factory;
    protected WebDriverWait webDriverWait;


    protected BasePage(WebDriver driver) {
        this.driver = driver;
        factory = new AjaxElementLocatorFactory(driver, 10);
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.driver.get(SITE_URL);
        this.driver.manage().window().maximize();

    }


    public void waitForPageLoad() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

}

