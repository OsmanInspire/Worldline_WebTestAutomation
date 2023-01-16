package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void waitForVisibilityOfElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofMillis(500L));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
