package com.daleks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    SkipPage page = new SkipPage();

    @BeforeEach
    public void setUp() {
        //closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = Settings.class.getName();
        open();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
