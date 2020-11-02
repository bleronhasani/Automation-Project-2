package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test1Impl {

    // ========== LOCATORS ==========
    private final By headerMenu = By.xpath("//nav[@id='main_header_nav']");

    private final By overviewTab = By.xpath("//a[@href='#show-overview']");
    private final By rulesTab = By.xpath("//a[@href='#show-rules']");
    private final By ideasTab = By.xpath("//a[@title='Ideas']");
    private final By leaderboard = By.xpath("//a[@title='Leaderboard']");
    private final By submitNowBtn = By.cssSelector("a[title ='Submit Now']");
    private final By byTrackDropdown = By.xpath("//*[@id=\"navbar-first\"]/div[1]/div/div[1]");
    private final By viewAllIdeasDropdown = By.xpath("//*[@id=\"navbar-first\"]/div[1]/div/div[2]/span/span[1]/span");
    private final By searchByTrack = By.xpath("/html/body/span/span/span[1]/input");
    private final By viewAllIdeasSearch = By.xpath("/html/body/span/span/span[1]/input");
    private final By search = By.xpath("//input[@name='search']");
    private final By clearSearch = By.xpath("//*[@id=\"main-filters\"]/section/div/div[1]/div[1]/button/i");
    private final By mostRecent = By.xpath("//*[@id=\"sort-by-date\"]");
    private final By mostCommented = By.xpath("//button[contains(@id, 'sort-by-date') and contains (.//span,'Commented')]");
    private final By mostVoted = By.xpath("//button[@id='sort-by-votes']");
    private final By mostViewed = By.xpath("//button[@id='sort-by-views']");
    private final By favorites = By.xpath("//button[@id='sort-by-favourites']");
    private final By favoriteIcon = By.xpath("//div[@class='absolute-tr']");
    private final By voted = By.xpath("//button[@id='sort-by-voted']");
    private final By alphabeticalLeaderBoard = By.xpath("//button[@title='Alphabetical']");
    private final By backLeaderBoard = By.xpath("//a[@title='Back']");
    private final By proposalName = By.xpath("//input[@id='Form_custom_title']");
    private final By selectCategory = By.xpath("//select[@name='Form[ch_phase_track_id]']");
    private final By selectCategoryOption = By.xpath("//option[contains(@value, '26') and contains (.,'Cost Reduction')]");
    private final By whoAreYouPraticipatingAs = By.xpath("//label[@layout='column1']");
    private final By describeOther = By.xpath("//input[@name='Form[872]']");
    private final By contributedFirstName = By.xpath("//input[@id='Form_458_1_first']");
    private final By contributedLastName = By.xpath("//input[@id='Form_458_1_last']");
    private final By contributedEmail = By.xpath("//input[@id='Form_458_1_email_address']");
    private final By addAnotherField = By.xpath("//a[@id='add_button_Form_458_team']");
    private final By addContributedFirstName = By.xpath("//input[@id='Form_458_2_first']");
    private final By addContributedLastName = By.xpath("//input[@id='Form_458_2_last']");
    private final By addContributedEmail = By.xpath("//input[@id='Form_458_2_email_address']");
    private final By teamMember = By.xpath("//label[@for='Form_918_759']");
    private final By emailfirst = By.xpath("//input[@id='Form_916']");
    private final By emailsecond = By.xpath("//input[@id='Form_917']");
    private final By editBtn = By.xpath("//*[@id=\"checkbox-448\"]/div/div/label");
    private final By boldBtn = By.xpath("//button[@id='bold-1']");
    private final By describeImpact = By.xpath("//*[@id=\"submission_form\"]/div[10]/div[2]/div/div[2]/div");
    private final By italicBtn = By.xpath("//button[@id='italic-1']");
    private final By underlineBtn = By.xpath("//button[@id='underline-1']");
    private final By strikeThroughBtn = By.xpath("//button[@id='strikeThrough-1']");
    private final By aliginBtn = By.xpath("//button[@id='align-1']");
    private final By aliginOption = By.xpath("//*[@id=\"dropdown-menu-align-1\"]/div/div/ul/li[2]/a");
    private final By embedetVideo = By.xpath("//input[@name='Form[482]']");
    private final By website = By.xpath("//input[@id='Form_483_1']");
    private final By addAnotherWebsite = By.xpath("//*[@id=\"Form_483_team\"]/a");
    private final By closeaddAnotherWebsite = By.xpath("//*[@id=\"Form_483_team\"]/div[2]/a");
    private final By saveToDraft = By.xpath("//*[@id=\"submission_form_button\"]/a");
    private final By submit = By.xpath("//input[@id='submission_form_button_submit']");
    private final By Testerdropdown = By.xpath("//*[@id=\"xtraoptions\"]/button");
    private final By mySubmission = By.xpath("//a[@title='My Submission']");
    private final By mySubmissionView = By.xpath("//*[@id=\"table_challenge_subs_1\"]/tbody/tr[1]/td[10]/div/button");
    private final By clickView = By.xpath("//a[contains(text(),'View')]");
    private final By editpost = By.xpath("//a[contains(@id, 'edit') and contains (.,' Edit ')]");
    private final By deletOption = By.xpath("//a[contains(text(),'Delete')]");


    private final WebDriver chrome;

    public Test1Impl(WebDriver chrome) {
        this.chrome = chrome;
    }

    // ========== METHODS ==========
    public Test1Impl clickCallForStartupsPage() throws InterruptedException {

        chrome.findElement(headerMenu).findElement(By.xpath("//a[@title='Call for Startups']")).click();
        Thread.sleep(1000);
        assertTrue(chrome.getCurrentUrl().contains("https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups"), "User was not redirected to Call For Startups page");
        return this;
    }

    public Test1Impl overviewTab() throws InterruptedException {

        chrome.findElement(overviewTab).click();
        String title = chrome.findElement(By.xpath("//h3[contains(@class, 'big-title') and contains (.,'Timeline for the Startup Competition')]")).getText();
        assertEquals("Timeline for the Startup Competition", title);
        return this;
    }

    public Test1Impl rulesTab() throws InterruptedException {

        chrome.findElement(rulesTab).click();
        Thread.sleep(1000);
        //fix assert
//        String title = chrome.findElement(By.xpath("//div[contains(@class, 'container') and contains (.//h3,'Terms and Conditions')]")).getText();
//        assertEquals("Terms and Conditions", title);
        return this;
    }

    public Test1Impl ideasTab(String firstItem, String CostReduction, String HumanResources) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        chrome.findElement(ideasTab).click();
        Thread.sleep(2000);
        chrome.findElement(byTrackDropdown).click();
        chrome.findElement(searchByTrack).sendKeys(firstItem);
        Thread.sleep(2000);
        chrome.findElement(searchByTrack).sendKeys(Keys.ENTER);
        //fix assert/until
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'category') and contains (.//b,'" + firstItem + "')]")));
        viewAllIdeaDropdown();
        chrome.findElement(byTrackDropdown).click();
        wait.until(ExpectedConditions.elementToBeClickable(byTrackDropdown));
        chrome.findElement(searchByTrack).clear();
        chrome.findElement(searchByTrack).sendKeys(CostReduction);
        chrome.findElement(searchByTrack).sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'category') and contains (.//b,'" + CostReduction + "')]")));
        viewAllIdeaDropdown();
        chrome.findElement(byTrackDropdown).click();
        wait.until(ExpectedConditions.elementToBeClickable(byTrackDropdown));
        chrome.findElement(searchByTrack).clear();
        chrome.findElement(searchByTrack).sendKeys(HumanResources);
        chrome.findElement(searchByTrack).sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'category') and contains (.//b,'" + HumanResources + "')]")));
        viewAllIdeaDropdown();

        return this;
    }

    public void viewAllIdeaDropdown() throws InterruptedException {
        chrome.findElement(viewAllIdeasDropdown).click();
        Thread.sleep(3000);
        chrome.findElement(viewAllIdeasSearch).sendKeys("HA POTENZIALE");
        chrome.findElement(viewAllIdeasSearch).sendKeys(Keys.ENTER);
        chrome.findElement(viewAllIdeasDropdown).click();
        Thread.sleep(1000);
        chrome.findElement(viewAllIdeasSearch).sendKeys("SCARSA");
        chrome.findElement(viewAllIdeasSearch).sendKeys(Keys.ENTER);
        chrome.findElement(viewAllIdeasDropdown).click();
        chrome.findElement(viewAllIdeasSearch).sendKeys("OTTIMA");
        chrome.findElement(viewAllIdeasSearch).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        chrome.findElement(viewAllIdeasDropdown).click();
        chrome.findElement(viewAllIdeasSearch).sendKeys("DA RIVEDERE");
        chrome.findElement(viewAllIdeasSearch).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        chrome.findElement(viewAllIdeasDropdown).click();
        chrome.findElement(viewAllIdeasSearch).sendKeys("Has Potential");
        chrome.findElement(viewAllIdeasSearch).sendKeys(Keys.ENTER);
    }

    public Test1Impl searchInput(String SearchInput) throws InterruptedException {
        chrome.findElement(search).click();
        chrome.findElement(search).sendKeys(SearchInput);
        chrome.findElement(search).sendKeys(Keys.ENTER);
        //fix assert
//        String post = chrome.findElement(By.xpath("//input[contains(@name, 'search')")).getText();
//        assertEquals("Timeline for the Startup Competition", post);
        chrome.findElement(clearSearch).click();
        return this;
    }

    public Test1Impl sortMenu() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        chrome.findElement(mostRecent).click();
        wait.until(ExpectedConditions.elementToBeClickable(mostRecent));
        wait.until(ExpectedConditions.visibilityOfElementLocated(favoriteIcon));
        chrome.findElement(favoriteIcon).click();
        wait.until(ExpectedConditions.elementToBeClickable(favoriteIcon));
        chrome.findElement(mostCommented).click();
        wait.until(ExpectedConditions.elementToBeClickable(mostCommented));
        wait.until(ExpectedConditions.visibilityOfElementLocated(favoriteIcon));
        Thread.sleep(2000);
        chrome.findElement(favoriteIcon).click();
        chrome.findElement(mostVoted).click();
        Thread.sleep(2000);
        chrome.findElement(favoriteIcon).click();
        chrome.findElement(mostViewed).click();
        Thread.sleep(2000);
        chrome.findElement(favoriteIcon).click();
        return this;
    }

    public Test1Impl favoriteAndVoted() throws InterruptedException {
        chrome.findElement(favorites).click();
        chrome.findElement(favoriteIcon).click();
        chrome.findElement(voted).click();
        return this;
    }

    public Test1Impl leaderBoardPage(String leaderBoardSearch) throws InterruptedException {
        chrome.findElement(leaderboard).click();
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        chrome.findElement(search).sendKeys(leaderBoardSearch);
        Thread.sleep(2000);
        chrome.findElement(alphabeticalLeaderBoard).click();
        wait.until(ExpectedConditions.elementToBeClickable(alphabeticalLeaderBoard));
        Thread.sleep(1000);
        chrome.findElement(backLeaderBoard).click();
        return this;
    }

    public Test1Impl submitNow(String name, String describe, String contributeName, String contributeLastname, String contributeEmail, String firstEmail, String secondEmail, String descImpact, String embedetVideoText, String url) {
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        chrome.findElement(submitNowBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(proposalName));
        chrome.findElement(proposalName).sendKeys(name);
        chrome.findElement(selectCategory).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCategoryOption));
        chrome.findElement(selectCategoryOption).click();
        chrome.findElement(whoAreYouPraticipatingAs).click();
        chrome.findElement(describeOther).sendKeys(describe);
        chrome.findElement(contributedFirstName).sendKeys(contributeName);
        chrome.findElement(contributedLastName).sendKeys(contributeLastname);
        chrome.findElement(contributedEmail).sendKeys(contributeEmail);
        chrome.findElement(addAnotherField).click();
        chrome.findElement(addContributedFirstName).sendKeys(contributeName);
        chrome.findElement(addContributedLastName).sendKeys(contributeLastname);
        chrome.findElement(addContributedEmail).sendKeys(contributeEmail);
        chrome.findElement(teamMember).click();
        chrome.findElement(emailfirst).sendKeys(firstEmail);
        chrome.findElement(emailsecond).sendKeys(secondEmail);
        chrome.findElement(editBtn).click();
        chrome.findElement(boldBtn).click();
        chrome.findElement(describeImpact).sendKeys(descImpact);
        chrome.findElement(italicBtn).click();
        chrome.findElement(describeImpact).sendKeys(descImpact);
        chrome.findElement(underlineBtn).click();
        chrome.findElement(describeImpact).sendKeys(descImpact);
        chrome.findElement(strikeThroughBtn).click();
        chrome.findElement(describeImpact).sendKeys(descImpact);
        chrome.findElement(aliginBtn).click();
        chrome.findElement(aliginOption).click();
        chrome.findElement(describeImpact).sendKeys(describe);
        chrome.findElement(embedetVideo).sendKeys(embedetVideoText);
        chrome.findElement(website).sendKeys(url);
        chrome.findElement(addAnotherWebsite).click();
        chrome.findElement(closeaddAnotherWebsite).click();
        chrome.findElement(saveToDraft).click();
        chrome.findElement(submit).click();

        return this;
    }

    public Test1Impl submissionEdit(String name, String describe, String contributeName, String contributeLastname, String contributeEmail, String firstEmail, String secondEmail, String descImpact, String embedetVideoText, String url) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        chrome.findElement(Testerdropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mySubmission));
        chrome.findElement(mySubmission).click();
        Thread.sleep(1000);
        assertTrue(chrome.getCurrentUrl().contains("https://internal.eu-demo.skipsolabs.com/en/profile/my/submissions"), "User was not redirected to My Submission");
        chrome.findElement(mySubmissionView).click();
        chrome.findElement(clickView).click();
        Thread.sleep(3000);
        chrome.findElement(editpost).click();
        chrome.findElement(proposalName).clear();
        chrome.findElement(proposalName).sendKeys(name);
        chrome.findElement(describeOther).clear();
        chrome.findElement(describeOther).sendKeys(describe);
        chrome.findElement(contributedFirstName).clear();
        chrome.findElement(contributedFirstName).sendKeys(contributeName);
        chrome.findElement(contributedLastName).clear();
        chrome.findElement(contributedLastName).sendKeys(contributeLastname);
        chrome.findElement(contributedEmail).clear();
        chrome.findElement(contributedEmail).sendKeys(contributeEmail);
        chrome.findElement(emailfirst).clear();
        chrome.findElement(emailfirst).sendKeys(firstEmail);
        chrome.findElement(emailsecond).clear();
        chrome.findElement(emailsecond).sendKeys(secondEmail);
        chrome.findElement(describeImpact).clear();
        chrome.findElement(describeImpact).sendKeys(descImpact);
        chrome.findElement(embedetVideo).clear();
        chrome.findElement(embedetVideo).sendKeys(embedetVideoText);
        chrome.findElement(website).clear();
        chrome.findElement(website).sendKeys(url);
        chrome.findElement(submit).click();

        return this;
    }

    public Test1Impl deletePost() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        chrome.findElement(Testerdropdown).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mySubmission));
        chrome.findElement(mySubmission).click();
        Thread.sleep(2000);
        assertTrue(chrome.getCurrentUrl().contains("https://internal.eu-demo.skipsolabs.com/en/profile/my/submissions"), "User was not redirected to My Submission");
        chrome.findElement(mySubmissionView).click();
        chrome.findElement(deletOption).click();
        return this;
    }
}
