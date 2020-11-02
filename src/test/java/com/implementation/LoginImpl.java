package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class LoginImpl {

    private final By emailHolder = By.xpath("//input[@id='signin_username']");
    private final By passwordHolder = By.xpath("//input[@id='signin_password']");
    private final By signInBtn = By.xpath("//a[contains(@id, 'signin') and contains (.,' Login ')]");
    private final By loginBtn2 = By.xpath("//button[contains(@id, 'submit-signin') and contains (.,'Log In')]");
    private final By cookiesBanner = By.cssSelector(".cc_banner.cc_container.cc_container--open");

    WebDriver chrome;

    public LoginImpl(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void loginUser(String email, String password) throws InterruptedException {
        chrome.findElement(signInBtn).click();
        Thread.sleep(1000);
        chrome.findElement(emailHolder).sendKeys(email);
        chrome.findElement(passwordHolder).sendKeys(password);
        chrome.findElement(loginBtn2).click();
        Thread.sleep(3000);
        assertTrue(chrome.getCurrentUrl().contains("https://internal.eu-demo.skipsolabs.com/en/challenge"), "User was not redirected to Call For Startups page");
        chrome.findElement(cookiesBanner).findElement(By.cssSelector(".cc_btn.cc_btn_accept_all")).click();

    }

//    public void chooseOption(String optionName) {
//        List<WebElement> options = chrome.findElements(optionHolder);
//
//        for (WebElement option : options) {
//            String name = option.findElement(By.tagName("h4")).getText();
//            if (name.equalsIgnoreCase(optionName)) {
//                option.click();
//                break;
//            }
//        }
//    }
//
//    public void checkOption()
//    {
//      try
//      {
//          new WebDriverWait(chrome, 60)
//                  .until(ExpectedConditions.visibilityOf(chrome.findElement(By.cssSelector(".front-door-selection.ng-star-inserted"))));
//      }
//      catch(Exception e)
//      {
//          fail("User was not redirected to Storage");
//      }
//
//      assertTrue(chrome.getCurrentUrl().contains(storageLink), "link is not the same");
//
//    }
//
//    public void dropdown(String drowpdownName)
//    {
//        List<WebElement> options = chrome.findElements(dropdownOption);
//
//        assertNotNull(options, "this is null");
//
//        chrome.findElement(dropdownOption).click();
//
//        List<WebElement> optionss = chrome.findElements(dropdownItem);
//
//        for(WebElement option :optionss)
//        {
//            String name = option.getText();
//            if (name.equalsIgnoreCase(drowpdownName)){
//                option.click();
//                break;
//            }
//        }


}
