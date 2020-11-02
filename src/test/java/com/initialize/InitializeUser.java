package com.initialize;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class InitializeUser {

    public WebDriver instance;

    public WebDriver initializeInstance() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriverManager.chromedriver().setup();

        instance = new ChromeDriver(options);
        instance.manage().window().maximize();
        instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return instance;
    }
}
