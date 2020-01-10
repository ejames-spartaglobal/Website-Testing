package com.spartaglobal.seleniumproject3.Tests;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.seleniumproject3.Pages.Homepage;
import com.spartaglobal.seleniumproject3.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static Homepage homepage;
    private static SeleniumConfig seleniumConfig;

    @BeforeClass
    public static void setup() {
        seleniumConfig = new SeleniumConfig("chrome", "D:\\Docs\\Engineering43\\Engineering43\\chromedriver_win32\\chromedriver.exe");
        homepage = new Homepage(seleniumConfig.getDriver());
    }

    @Test
    public void TestHomepageNavigation(){
        homepage.goToHomepage();
    }

    @Test
    public void TestNewInNavigationFromHomepage(){
        homepage.goToHomepage().navigateToNewIn();
    }

    @Test
    public void TestTrendNavigationFromHomepage(){
        homepage.goToHomepage().navigateToTrends();
    }

    @Test
    public void TestClothingNavigationFromHomepage(){
        homepage.goToHomepage().navigateToClothing();
    }

    @Test
    public void TestDressesNavigationFromHomepage(){
        homepage.goToHomepage().navigateToDresses();
    }

    
}
