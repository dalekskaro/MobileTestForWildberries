package com.daleks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    SkipPage skipPage = new SkipPage();
    CataloguePage cataloguePage = new CataloguePage();
    FiltersPage filtersPage = new FiltersPage();
    BasketPage basketPage = new BasketPage();


    @BeforeEach
    public void setUp() throws InterruptedException {
        Configuration.browserSize = null;
        Configuration.browser = Settings.class.getName();
        open();
        skipPage.clickChooseCountryBtn();
        skipPage.clickSkipBtn();
        cataloguePage.clickCatalogueBtn();
        cataloguePage.clickHomeBtn();
        cataloguePage.clickMirrorBtn();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
