package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test2Impl {

    private final By headerMenu = By.xpath("//nav[@id='main_header_nav']");
    private final By ecosystemDropdown = By.xpath("//li[@id='menu-item-ecosystem']");
    private final By profile = By.cssSelector(".pe-ArticleList.am-TableCell.position-relative");
    private final By viewBtn = By.xpath("//div[@class='cta-cont']");
    private final By profileInfo = By.xpath("//section[@data-has-content='true']");
    private final By search = By.xpath("//input[@placeholder='Search']");
    private final By actionsBtn = By.cssSelector(".btn.btn-default.dropdown-toggle");
    private final By sendMessageItem = By.cssSelector(".contact-button.js-AddModalClass");
    private final By sendMessageModal = By.xpath("//div[@id='modal3']");
    private final By writeMessage = By.xpath("//textarea[@id='message']");
    private final By submitBtn = By.xpath("//button[contains(text(), 'Submit')]");
    private final By errorMsg = By.xpath("//div[contains(text(), 'The message cannot be empty.')]");

    WebDriver chrome;

    public Test2Impl(WebDriver chrome) {
        this.chrome = chrome;
    }

    public Test2Impl expertPage(String name) throws InterruptedException {
        chrome.findElement(headerMenu).findElement(ecosystemDropdown).click();
        chrome.findElement(ecosystemDropdown).findElement(By.xpath("//li[@class='li-experts']")).click();
        Thread.sleep(1000);
        assertTrue(chrome.getCurrentUrl().contains("https://internal.eu-demo.skipsolabs.com/en/custom/experts/directory"), "User was not redirected to Call For Startups page");
        chrome.navigate().refresh();
        chrome.findElement(search).sendKeys(name);
        chrome.findElement(search).sendKeys(Keys.ENTER);
        chrome.findElement(profile).findElement(viewBtn).click();
        //this is used to switch to new tab in order to perform next steps
        ArrayList<String> tabs2 = new ArrayList<>(chrome.getWindowHandles());
        chrome.switchTo().window(tabs2.get(0));
        chrome.close();
        chrome.switchTo().window(tabs2.get(1));
        new WebDriverWait(chrome, 10).until(ExpectedConditions.visibilityOfElementLocated(profileInfo));
        return this;
    }

    public Test2Impl profilePage() throws InterruptedException {
        chrome.findElement(actionsBtn).click();
        chrome.findElement(sendMessageItem).click();
        new WebDriverWait(chrome, 10).until(ExpectedConditions.visibilityOfElementLocated(sendMessageModal));
        chrome.findElement(sendMessageModal).findElement(submitBtn).click();
        new WebDriverWait(chrome, 10).until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        chrome.findElement(By.xpath("//button[contains(., 'OK')]")).click();
        chrome.findElement(actionsBtn).click();
        chrome.findElement(sendMessageItem).click();
        chrome.findElement(writeMessage).sendKeys("This is a simple message");
        chrome.findElement(sendMessageModal).findElement(submitBtn).click();
        chrome.findElement(By.xpath("//button[contains(., 'OK')]")).click();
        chrome.findElement(actionsBtn).click();
        String requestSent = chrome.findElement(By.cssSelector(".contact-button.js-AddModalClass.remove-request")).getText();
        assertEquals("Request sent", requestSent);

        return this;
    }
}

