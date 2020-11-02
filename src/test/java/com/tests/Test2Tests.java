package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.Test2Impl;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

@Epic("Test2")
public class Test2Tests extends OpenBrowser {

    private final String email = "testerthree@skipso.com";
    private final String password = " TESTer3ree";

    LoginImpl login;
    Test2Impl test2impl;


    @Test(priority = 1, description = "Experts profile")
    @Description("Test Description: This test case tests if user can navigate to expert page, view profile and send message!")
    private void expertsProfilePage() throws InterruptedException {

        login = new LoginImpl(chrome);
        test2impl = new Test2Impl(chrome);

        login.loginUser(email, password);
        test2impl.expertPage("Tech Mentor")
                .profilePage();


    }
}
