package com.testing.Automation.Test.pageobject;

import com.testing.Automation.Test.pages.BasePage;
import com.testing.Automation.Test.utils.LoginDataProvider;
import com.testing.Automation.Test.webelements.LoginWebElement;
import org.json.JSONException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class LoginPageObject extends BasePage {
    public static Logger reslogger = Logger.getLogger("LoginPage");
    LoginWebElement loginWebElement;

    public LoginPageObject(WebDriver driver) throws MalformedURLException {
        super(driver);
        PageFactory.initElements(factory, this);
        loginWebElement = new LoginWebElement(driver);
    }

    public void enterUserName(ArrayList<String> test_steps) throws JSONException {
        loginWebElement.enterUserName.sendKeys(LoginDataProvider.getUsername());
        test_steps.add("Enter User Name: " + LoginDataProvider.getUsername());
        reslogger.info("Enter User Name:" + LoginDataProvider.getUsername());

    }

    public void enterPassword(ArrayList<String> test_steps) throws JSONException {
        loginWebElement.enterPassword.sendKeys(LoginDataProvider.getPassword());
        test_steps.add("Enter Password: " + LoginDataProvider.getPassword());
        reslogger.info("Enter Password:" + LoginDataProvider.getPassword());

    }

    public void clickLoginButton(ArrayList<String> test_steps) throws JSONException {
        loginWebElement.clickLoginButton.click();
        test_steps.add("Click Login Button");
        reslogger.info("Click Login Button");

    }


}

