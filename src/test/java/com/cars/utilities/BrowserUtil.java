package com.cars.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;

public class BrowserUtil {


    public static void ScrollUp(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
    }

    public static void ScrollDown(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue(element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }
    public static void doubleClick(WebElement element) {
        new Actions(Driver.get()).doubleClick(element).build().perform();
    }
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }
    public static void takeSnapShot(WebElement webdriver, String file) {
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File paymentFile = scrShot.getScreenshotAs(OutputType.FILE);
    }

}
