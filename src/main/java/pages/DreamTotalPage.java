package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DreamTotalPage {

    private WebDriver driver;

    private By goodDreamsValue =
            By.xpath("//*[@id='dreamsTotal']/tbody/tr[1]/td[2]");
    private By badDreamsValue =
            By.xpath("//*[@id='dreamsTotal']/tbody/tr[2]/td[2]");
    private By totalDreamsValue =
            By.xpath("//*[@id='dreamsTotal']/tbody/tr[3]/td[2]");
    private By recurringDreamsValue =
            By.xpath("//*[@id='dreamsTotal']/tbody/tr[5]/td[2]");
    public DreamTotalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-total.html");
    }

    public int getGoodDreamsCount() {
        return Integer.parseInt(
                driver.findElement(goodDreamsValue).getText()
        );
    }
    public int getBadDreamsCount() {
        return Integer.parseInt(
                driver.findElement(badDreamsValue).getText()
        );
    }
    public int getTotalDreamsCount() {
        return Integer.parseInt(
                driver.findElement(totalDreamsValue).getText()
        );
    }
    public int getRecurringDreamsCount() {
        return Integer.parseInt(
                driver.findElement(recurringDreamsValue).getText()
        );
    }
}