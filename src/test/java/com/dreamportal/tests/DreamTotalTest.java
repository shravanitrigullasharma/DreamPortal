package com.dreamportal.tests;

import com.dreamportal.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DreamTotalPage;
import org.testng.annotations.AfterMethod;
public class DreamTotalTest {

    private WebDriver driver;
    private DreamTotalPage totalPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
        totalPage = new DreamTotalPage(driver);
        totalPage.open();
    }

    @Test
    public void verifyGoodDreamsCount() {
        Assert.assertEquals(
                totalPage.getGoodDreamsCount(),
                6,
                "Good Dreams count should be 6"
        );
    }
    @Test
    public void verifyBadDreamsCount() {
        Assert.assertEquals(
                totalPage.getBadDreamsCount(),
                4,
                "Bad Dreams count should be 4"
        );
    }
    @Test
    public void verifyTotalDreamsCount() {
        Assert.assertEquals(
                totalPage.getTotalDreamsCount(),
                10,
                "Total Dreams count should be 10"
        );
    }
    @Test
    public void verifyRecurringDreamsCount() {
        Assert.assertEquals(
                totalPage.getRecurringDreamsCount(),
                2,
                "Recurring Dreams count should be 2"
        );
    }
    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}