package com.testing.Automation.Test.utils;

import com.relevantcodes.extentreports.LogStatus;
import com.testing.Automation.Test.pages.BasePage;
import com.testing.Automation.Test.testcore.TestCore;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ScreenShotUtility extends BasePage {
    String name = "Saucedemo Test Casses";

    public ScreenShotUtility(WebDriver driver) throws MalformedURLException {
        super(driver);
        PageFactory.initElements(factory, this);
    }

    private static String getTimeStamp() {
        return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()).replaceAll("[-: ]", "_");
    }

    private static String captureScreenShot(String name, WebDriver driver) {
        String screenShotPath = System.getProperty("user.dir") + "\\screenshots\\" + name + ".png";
        TakesScreenshot screenShot = (TakesScreenshot) driver;
        File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(screenShotPath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenShotPath;
    }

    public void addScreenShot(WebDriver driver) {
        TestCore.test.log(LogStatus.PASS, TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));
    }

    public void addScreenShotForException(Exception e, String logMessage, WebDriver driver) {

        String strException = e.toString();

        try {
            if (strException.contains("NoSuchElementException")) {

                TestCore.test.log(LogStatus.FAIL, logMessage + "," + " <br> <b> Exception Details: </b>" + strException.substring(0, strException.indexOf("}") + 1) + "<br> <b> Attaching screenshot below : </b>" + TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));

            } else if (strException.contains("TimeoutException")) {

                TestCore.test.log(LogStatus.FAIL, logMessage + "," + " <br> <b> Exception Details: </b>" + strException.substring(0, strException.indexOf("Build")) + "<br> <b> Attaching screenshot below : </b>" + TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));
            } else if (strException.contains("StaleElementReferenceException")) {

                TestCore.test.log(LogStatus.FAIL, logMessage + "," + " <br> <b> Exception Details: </b>" + strException.substring(0, strException.indexOf("(") + 1) + "<br> <b> Attaching screenshot below : </b>" + TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));
            } else if (strException.contains("AssertionError")) {

                TestCore.test.log(LogStatus.FAIL, logMessage + "," + " <br> <b> Exception Details: </b>" + strException + "<br> <b> Attaching screenshot below : </b>" + TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));
            } else {

                TestCore.test.log(LogStatus.FAIL, logMessage + "," + " <br> <b> Exception Details: </b>" + strException + "<br> <b> Attaching screenshot below : </b>" + TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));
            }
        } catch (Exception ex) {
            TestCore.test.log(LogStatus.FAIL, logMessage + "," + " <br> <b> Exception Details: </b>" + strException.substring(0, strException.indexOf("at") + 1) + "<br> <b> Attaching screenshot below : </b>" + TestCore.test.addScreenCapture(captureScreenShot(name + "_" + "_" + getTimeStamp(), driver)));
        }
        TestCore.app_logs.info(logMessage + "\n");

        e.printStackTrace();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {

        }
    }
}

