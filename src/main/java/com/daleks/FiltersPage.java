package com.daleks;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Selenide.$;

public class FiltersPage {

    private SelenideElement filtersView = $(MobileBy.id(
            "com.wildberries.ru:id/filterDisplayModeTitle"));

    private SelenideElement filtersBrand = $(MobileBy.xpath(
            "/hierarchy//android.widget.LinearLayout[2]//android.widget.FrameLayout[1]/android.widget.TextView"));

    private SelenideElement filtersPrice = $(MobileBy.xpath(
            "/hierarchy//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView" +
                    "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView"));

    private SelenideElement filtersDiscount = $(MobileBy.xpath(
            "/hierarchy//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView" +
                    "/android.widget.FrameLayout[2]/android.widget.TextView"));

    public String viewText() {
        System.out.println(filtersView.getText());
        return filtersView.getText();
    }

    public String brandText() {
        System.out.println(filtersBrand.getText());
        return filtersBrand.getText();
    }

    public String priceText() {
        System.out.println(filtersPrice.getText());
        return filtersPrice.getText();
    }

    public String discountText() {
        System.out.println(filtersDiscount.getText());
        return filtersDiscount.getText();
    }
}
