package com.daleks;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Selenide.$;

public class SkipPage {

    private SelenideElement chooseCountryButton = $(MobileBy.xpath("//android.view.ViewGroup[1]/android.widget.RadioButton"));

    private SelenideElement skipButton = $(MobileBy.id("com.wildberries.ru:id/skip"));

    public void clickChooseCountryBtn() throws InterruptedException {
        Thread.sleep(2000);
        chooseCountryButton.click();
    }

    public void clickSkipBtn() throws InterruptedException {
        Thread.sleep(2000);
        skipButton.click();
    }

}
