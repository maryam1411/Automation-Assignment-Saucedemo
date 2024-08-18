package com.testing.Automation.Test.webelements;

import com.testing.Automation.Test.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElement {
    WebDriver driver;
    public LoginWebElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = LoginPage.USER_NAME)
    public WebElement enterUserName;
    @FindBy(xpath = LoginPage.PASSWORD)
    public WebElement enterPassword;
    @FindBy(xpath = LoginPage.LOGIN_BUTTON)
    public WebElement clickLoginButton;
}
