package com.dreamportal.tests;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import com.dreamportal.utils.DriverFactory;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;
    @BeforeMethod
    public void setUp(){
        driver= com.dreamportal.utils.DriverFactory.getDriver();
        homePage= new HomePage(driver);
        homePage.open();

    }
    @Test
    public void verifyMyDreamsButtonIsDisplayed() {
        Assert.assertTrue(homePage.isMyDreamsButtonDisplayed(),
        "My dream button should be dispalyed"
        );

    }
    @Test
    public void verifyLoadingAnimationIsDisplayed() {
        Assert.assertTrue(
                homePage.isLoadingAnimationDisplayed(),
                "Loading animation should be displayed"
        );
    }
    @Test
    public void verifyLoadingAnimationDisappears() {
        Assert.assertTrue(
                homePage.isLoadingAnimationDisappeared(),
                "Loading animation should disappear after page loading"
        );
    }
    @Test
    public void verifyMyDreamsOpensTwoTabs() {
        homePage.clickMyDreams();

        Assert.assertEquals(
                driver.getWindowHandles().size(),
                3,
                "My Dreams should open two tabs"
        );
    }
    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
