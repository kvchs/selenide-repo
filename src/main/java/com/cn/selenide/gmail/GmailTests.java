package com.cn.selenide.gmail;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.addListener;

public abstract class GmailTests {
    private static String gmailUsername = System.getProperty("gmail.username", "enter-your-gmail-username");
    private static String gmailPassword = System.getProperty("gmail.password", "enter-your-gmail-password");

    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @BeforeClass
    public static void openInbox() {
        Configuration.timeout = 10000;
        Configuration.baseUrl = "http://gmail.com";
        Configuration.startMaximized = false;
        Configuration.browser = "chrome";
        Configuration.browserPosition = "890x10";
        Configuration.browserSize = "780x950";
        addListener(new Highlighter());

        open("/");
        login();
        waitUntilPagesIsLoaded();
    }

    protected static void waitUntilPagesIsLoaded() {
        $(byText("Loading")).waitUntil(disappears, 20000);
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

    private static void login() {
        $("#identifierId").val(gmailUsername).pressEnter();
        $("#password input").val(gmailPassword).pressEnter();
    }
}
