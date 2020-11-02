package com;

import com.initialize.InitializeUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {

    public WebDriver chrome;
    InitializeUser browser = new InitializeUser();

    @BeforeMethod
    public void openChrome() {
        chrome = browser.initializeInstance();
        chrome.get("https://internal.eu-demo.skipsolabs.com");
        System.out.println("------- Opening Browser -------");
    }

    @AfterMethod
    public void cleanUp() {
        chrome.quit();
    }

}
