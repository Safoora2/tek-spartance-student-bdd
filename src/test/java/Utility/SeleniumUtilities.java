package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;
import java.time.Duration;
public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait(){ return new WebDriverWait(getDriver(),
            Duration.ofSeconds(20));}
   // create a method to click on a given Locator
     public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
     }
    public void sendText(By locator, String value)
    { getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
    }
}
//create method fr getting the text of a locator

