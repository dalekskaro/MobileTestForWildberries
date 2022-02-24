package com.daleks;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Selenide.$;

public class SkipPage {

    /*@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    SelenideElement skipButton;*/

    private SelenideElement skipButton = $(MobileBy.id("tt"));

    public void clickSkipBtn() {
        skipButton.click();
    }
}
