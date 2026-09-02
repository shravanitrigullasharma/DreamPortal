package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DreamDiaryPage {

    private WebDriver driver;

    private By dreamNameCells =
            By.xpath("//*[@id='dreamsDiary']/tbody/tr/td[1]");

    private By dreamTypeCells =
            By.xpath("//*[@id='dreamsDiary']/tbody/tr/td[3]");
    private By daysAgoCells =
            By.xpath("//*[@id='dreamsDiary']/tbody/tr/td[2]");
    private By flyingDream =
            By.xpath("//*[@id='dreamsDiary']/tbody/tr/td[1][normalize-space()='Flying over mountains']");

    private By mazeDream =
            By.xpath("//*[@id='dreamsDiary']/tbody/tr/td[1][normalize-space()='Lost in maze']");

    public DreamDiaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-diary.html");
    }

    public int getDreamNameCount() {
        return driver.findElements(dreamNameCells).size();
    }

    public int getDreamTypeCount() {
        return driver.findElements(dreamTypeCells).size();
    }

    public boolean areDreamTypesValid() {
        for (WebElement element : driver.findElements(dreamTypeCells)) {
            String dreamType = element.getText();

            if (!dreamType.equals("Good") && !dreamType.equals("Bad")) {
                return false;
            }
        }

        return true;
    }
    public boolean areDaysAgoFilled() {
        for (WebElement element : driver.findElements(daysAgoCells)) {
            if (element.getText().trim().isEmpty()) {
                return false;
            }
        }

        return true;
    }
    public boolean areRecurringDreamsPresent() {
        int flyingCount = driver.findElements(flyingDream).size();
        int mazeCount = driver.findElements(mazeDream).size();

        return flyingCount > 1 && mazeCount > 1;
    }
}