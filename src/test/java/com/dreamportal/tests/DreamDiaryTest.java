package com.dreamportal.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DreamDiaryPage;
import com.dreamportal.utils.DriverFactory;
import org.testng.annotations.AfterMethod;
public class DreamDiaryTest {

    private WebDriver driver;
    private DreamDiaryPage diaryPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
        diaryPage = new DreamDiaryPage(driver);
        diaryPage.open();
    }

    @Test
    public void verifyDreamCount() {
        Assert.assertEquals(
                diaryPage.getDreamNameCount(),
                10,
                "Dream Diary should contain exactly 10 dreams"
        );
    }
    @Test
    public void verifyDreamTypesAreValid() {
        Assert.assertTrue(
                diaryPage.areDreamTypesValid(),
                "Dream Type should be only Good or Bad"
        );
    }
    @Test
    public void verifyDaysAgoAreFilled() {
        Assert.assertTrue(
                diaryPage.areDaysAgoFilled(),
                "Days Ago should be filled for every dream"
        );
    }
    @Test
    public void verifyDreamTypeCount() {
        Assert.assertEquals(
                diaryPage.getDreamTypeCount(),
                10,
                "Every dream row should have a Dream Type"
        );
    }
    @Test
    public void verifyRecurringDreamsArePresent() {
        Assert.assertTrue(
                diaryPage.areRecurringDreamsPresent(),
                "Flying over mountains and Lost in maze should be recurring dreams"
        );
    }
    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
