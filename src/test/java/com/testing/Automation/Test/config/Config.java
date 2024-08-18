//package com.testing.Automation.Test.config;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class Config {
//
//
//    private static final Properties properties = new Properties();
//
//    static {
//        try (FileInputStream fis = new FileInputStream("resources/config.properties")) {
//            properties.load(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String getBrowser() {
//        return properties.getProperty("browser", "chrome");
//    }
//
//    public static String getBaseUrl() {
//        return properties.getProperty("base_url", "https://www.saucedemo.com");
//    }
//
//    public static String getGridUrl() {
//        return properties.getProperty("grid_url", "http://localhost:4444/wd/hub");
//    }
//}
//
