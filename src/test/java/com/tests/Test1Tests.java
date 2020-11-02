package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.Test1Impl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

@Epic("Test1")
public class Test1Tests extends OpenBrowser {

    private final String email = "testerthree@skipso.com";
    private final String password = " TESTer3ree";
    private final String productFeature = "Product Features";
    private final String CostReduction = "Cost Reduction";
    private final String HumanResources = "Human Resources";
    private final String SearchInput = "proposal name";
    private final String leaderboardSearch = "Anna Siani";
    private final String proposalName = "Testerthreee";
    private final String describeOther = "Tester33333";
    private final String contributename = "Tester3";
    private final String contributelastname = "hasani";
    private final String emailUpdated = "tester@skipso.com";
    private final String autoText = "AutoSimpleText";
    private final String autoTextUpdated = "AutoSimpleTextUpdated";
    private final String website = "https://www.youtube.com/watch?v=z05IO3gWlog&t=5586s";
    private final String textUpdated = "TextUpdated123";
    private final String editWebsite = "https://www.youtube.com/watch?v=z05IO3gWlog&t=5586s";

    LoginImpl login;
    Test1Impl test1;

    @Test(priority = 1, description = "Call For Startups Page")
    @Description("Test Description: This test case tests if user can access call for startups page successfully!")
    private void callForStartupsPage() throws InterruptedException {

        login = new LoginImpl(chrome);
        test1 = new Test1Impl(chrome);

        login.loginUser(email, password);
        test1.clickCallForStartupsPage()
                .overviewTab()
                .rulesTab()
                .ideasTab(productFeature, CostReduction, HumanResources)
                .searchInput(SearchInput)
                .sortMenu()
                .favoriteAndVoted()
                .leaderBoardPage(leaderboardSearch)
                .submitNow(proposalName, describeOther, contributename, contributelastname, email, email, email, autoText, autoText, website)
                .submissionEdit(textUpdated, textUpdated, textUpdated, textUpdated, emailUpdated, emailUpdated, emailUpdated, autoTextUpdated, autoTextUpdated, editWebsite)
                .deletePost();
    }
}
