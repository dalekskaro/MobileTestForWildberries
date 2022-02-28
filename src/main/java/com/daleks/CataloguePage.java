package com.daleks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Selenide.$;

public class CataloguePage {
    private SelenideElement catalogueButton = $(MobileBy.id("com.wildberries.ru:id/btnCatalogue"));

    private SelenideElement homeButton = $(MobileBy.xpath(
            "/hierarchy//android.view.ViewGroup[5]/android.widget.TextView")); //5

    private SelenideElement mirrorButton = $(MobileBy.xpath(
            "/hierarchy//android.view.ViewGroup[10]/android.widget.TextView")); //10

    private SelenideElement catalogueFiltersButton = $(MobileBy.id(
           "com.wildberries.ru:id/filterButton"));

    private SelenideElement catalougeSortButton = $(MobileBy.id("com.wildberries.ru:id/sortButton"));

    private SelenideElement sortPopular = $(MobileBy.xpath(
            "//android.widget.FrameLayout[1]/android.widget.TextView"));

    private SelenideElement sortRating = $(MobileBy.xpath(
            "//android.widget.FrameLayout[2]/android.widget.TextView"));

    private SelenideElement sortPriseUp = $(MobileBy.xpath(
            "//android.widget.FrameLayout[3]/android.widget.TextView"));

    private SelenideElement sortPriceDown = $(MobileBy.xpath(
            "//android.widget.FrameLayout[4]/android.widget.TextView"));

    private SelenideElement sortDiscount = $(MobileBy.xpath(
            "//android.widget.FrameLayout[5]/android.widget.TextView"));

    private SelenideElement sortUpdate = $(MobileBy.xpath(
            "//android.widget.FrameLayout[6]/android.widget.TextView"));

    private SelenideElement productCount = $(MobileBy.id(
            "com.wildberries.ru:id/productCount"));

    private SelenideElement addInPostpone = $(MobileBy.xpath(
            "//android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageButton[1]"));

    private SelenideElement addInBasket = $(MobileBy.xpath(
            "//android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageButton[2]"));

    private SelenideElement basketButton = $(MobileBy.id(
            "com.wildberries.ru:id/btnBasket"));

    private SelenideElement productCost = $(MobileBy.xpath(
            "//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/" +
                    "android.view.ViewGroup[2]/android.widget.TextView[1]"));

    private SelenideElement productCostMax = $(MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/" +
            "android.widget.TextView[2]"));

    public void clickCatalogueBtn() {
        $(catalogueButton).shouldBe(Condition.visible).click();
    }

    public void clickHomeBtn() {
        $(homeButton).shouldBe(Condition.visible).click();
    }

    public void clickMirrorBtn(){
        $(mirrorButton).shouldBe(Condition.visible).click();
    }

    public void clickCatalogueFiltersBtn() throws InterruptedException {
        Thread.sleep(3000);
        catalogueFiltersButton.click();
    }

    public void clickCatalogueSortButton() throws InterruptedException {
        Thread.sleep(3000);
        catalougeSortButton.click();
    }

    public String sortPopularText() {
        System.out.println(sortPopular.getText());
        return sortPopular.getText();
    }

    public String sortRatingText() {
        System.out.println(sortRating.getText());
        return sortRating.getText();
    }

    public String sortPriceUpText() {
        System.out.println(sortPriseUp.getText());
        return sortPriseUp.getText();
    }

    public String sortPriceDownText() {
        System.out.println(sortPriceDown.getText());
        return sortPriceDown.getText();
    }

    public String sortDiscountText() {
        System.out.println(sortDiscount.getText());
        return sortDiscount.getText();
    }

    public String sortUpdateText() {
        System.out.println(sortUpdate.getText());
        return sortUpdate.getText();
    }

    public String productCountText() {
        System.out.println(productCount.getText());
        return productCount.getText();
    }

    public void clickAddInPostpone() throws InterruptedException {
        Thread.sleep(3000);
        addInPostpone.click();
    }

    public void clickAddInBasket() throws InterruptedException {
        Thread.sleep(1000);
        addInBasket.click();
    }

    public void clickBasketBtn() {
        basketButton.click();
    }

    public String productCostText() {
        System.out.println("цена: " + productCost.getText());
        return productCost.getText();
    }

    public String productCostMaxText() {
        System.out.println("цена макс: " + productCostMax.getText());
        return productCostMax.getText();
    }
}
