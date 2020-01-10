package com.spartaglobal.seleniumproject3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
    private WebDriver driver;
    private String homepageURL = "https://www.topshop.com/";
    private By trendButton = By.cssSelector("#Sandbox-home > div > div > div:nth-child(1) > div > div > div > a > div > img");
    private By clothingButton = By.cssSelector("#root > div > div.HeaderBig > div > div.HeaderTopshop-navigation > div > ul > li.MegaNav-category.category_203984.MegaNav-category--isNotTouch > a");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage goToHomepage(){
        driver.navigate().to(homepageURL);
        return this;
    }

    public Homepage navigateToNewIn(){
        driver.findElement(By.cssSelector("#root > div > div.HeaderBig > div > div.HeaderTopshop-navigation > div > ul > li.MegaNav-category.category_208491.MegaNav-category--isNotTouch > a")).click();
        return this;
    }

    public Homepage navigateToTrends(){
        driver.findElement(trendButton).click();
        return this;
    }

    public Homepage navigateToClothing(){
        driver.findElement(clothingButton).click();
        return this;
    }

    public Homepage navigateToDresses(){
        driver.findElement(By.cssSelector("#root > div > div.HeaderBig > div > div.HeaderTopshop-navigation > div > ul > li.MegaNav-category.category_3775994.MegaNav-category--isNotTouch > a")).click();
        return this;
    }
}
