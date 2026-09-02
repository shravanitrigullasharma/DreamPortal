package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    private By myDreamsButton =
            By.xpath("//button[contains(text(),'My Dreams')]");
    private By loadingAnimation =
            By.xpath("//*[@id='loadingAnimation']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://arjitnigam.github.io/myDreams/");
    }

    public boolean isMyDreamsButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(myDreamsButton)
        ).isDisplayed();
    }
    public boolean isLoadingAnimationDisplayed() {
        return driver.findElement(loadingAnimation).isDisplayed();
    }
    public boolean isLoadingAnimationDisappeared() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(loadingAnimation)
        );
    }
    public void clickMyDreams() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(
                ExpectedConditions.elementToBeClickable(myDreamsButton)
        ).click();
    }
}