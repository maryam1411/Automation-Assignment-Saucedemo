package com.testing.Automation.Test.testcore;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class TestCore {
    public static String extentReportsPath = System.getProperty("user.dir") + "\\extent-reports";
    public static Logger app_logs = Logger.getLogger("Testcore");
    public static WebDriver driver;
    public static ExtentReports reports = new ExtentReports(extentReportsPath + "\\Saucedemo_Report_" + getTimeStamp() + ".html");
    public static ExtentTest test;

    public static void addTestStepsIntoReport(ArrayList<String> test_steps) {
        for (String testStep : test_steps) {
            test.log(LogStatus.PASS, testStep);
        }
        test_steps.clear();

    }

    public static void createTest(String TestName) {
        test = reports.startTest(TestName);
    }

    private static String getTimeStamp() {
        return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()).replaceAll("[-: ]", "_");
    }
    @BeforeClass
    public static void setUpDriver() {
        try {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
            driver = new ChromeDriver();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @AfterClass
    public static void publishReport() {
        reports.flush();
        driver.quit();
    }

}
