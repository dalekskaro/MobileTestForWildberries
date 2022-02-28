package com.daleks;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private SelenideElement productCost = $(MobileBy.id("com.wildberries.ru:id/productPrice"));

    public String productCostText() {
        System.out.println("цена в корзине: " + productCost.getText());
        return productCost.getText();
    }


}
