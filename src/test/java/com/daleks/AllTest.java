package com.daleks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AllTest extends BaseTest {

    @Test
    public void productHaveFilters1() throws InterruptedException {
        cataloguePage.clickCatalogueFiltersBtn();
        Assertions.assertEquals("Вид", filtersPage.viewText());
        Assertions.assertEquals("Бренд", filtersPage.brandText());
        Assertions.assertEquals("Цена, руб.", filtersPage.priceText());
        Assertions.assertEquals("Скидка", filtersPage.discountText());
    }

    @Test
    public void sorterProduct2() throws InterruptedException {
        cataloguePage.clickCatalogueSortButton();
        Thread.sleep(3000);
        Assertions.assertEquals("По популярности", cataloguePage.sortPopularText());
        Assertions.assertEquals("По рейтингу", cataloguePage.sortRatingText());
        Assertions.assertEquals("По увеличению цены", cataloguePage.sortPriceUpText());
        Assertions.assertEquals("По уменьшению цены", cataloguePage.sortPriceDownText());
        Assertions.assertEquals("По скидке", cataloguePage.sortDiscountText());
        Assertions.assertEquals("По обновлению", cataloguePage.sortUpdateText());
    }

    @Test
    public void productCount3() {
        cataloguePage.productCountText();
    }

    @Test
    public void addInPostpone4() throws InterruptedException {
        cataloguePage.clickAddInPostpone();
        Thread.sleep(3000);
    }

    @Test
    public void addProductInBasket5() throws InterruptedException {
        Thread.sleep(3000);
        String cost = cataloguePage.productCostText();
        String costMax = cataloguePage.productCostMaxText();
        String strCost = cost.concat(" " + costMax);
        System.out.println("общий ценик: " + strCost);

        cataloguePage.clickAddInBasket();
        cataloguePage.clickBasketBtn();

        Thread.sleep(10000);
        Assertions.assertEquals(strCost, basketPage.productCostText());

    }
}