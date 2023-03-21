package com.cars.tests;

import com.cars.pages.FindMakePage;
import com.cars.pages.SearchToolPage;
import com.cars.pages.UsedCarPages;
import com.cars.utilities.BrowserUtil;
import com.cars.utilities.ConfigurationReader;
import com.cars.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UsedCarTest extends FindMakePage{










    @Test
    public void UsedCarSearch(){
        FindMakePage used = new FindMakePage();
        FindMakePage.


    }
//    public void UsedCarSearch{() {
//        SearchToolPage selectFilter = new SearchToolPage();
//        selectFilter.searchByMake.click();
//        selectFilter.usedCars.click();
//      //  selectFilter.make.click();
//        selectFilter.allModel.click();
//        selectFilter.noMaxPrice.click();
//        selectFilter.noMilesFrom.click();
//        selectFilter.zip.click();
//        selectFilter.zip.clear();
//        selectFilter.zip.sendKeys("60008");
//        selectFilter.search.click();
//        BrowserUtil.verifyElementDisplayed(selectFilter.MaxPriceFilter);
//        BrowserUtil.verifyElementDisplayed(selectFilter.HondaFilter);
//        BrowserUtil.verifyElementDisplayed(selectFilter.PilotFilter);
//        BrowserUtil.verifyElementDisplayed(selectFilter.UsedFilter);
//
//        BrowserUtil.ScrollDown(selectFilter.NewAndUsedFilter);
//        selectFilter.newRadioButton.click();
//        BrowserUtil.ScrollUp(selectFilter.newRadioButton);
//        BrowserUtil.waitFor(5);
//        BrowserUtil.verifyElementDisplayed(selectFilter.newFilterDisplayed);
//        BrowserUtil.ScrollDown(selectFilter.trimBox);
//        BrowserUtil.waitFor(5);
//        BrowserUtil.clickWithJS(selectFilter.trimTouring8Passenger);
//        BrowserUtil.clickWithJS(selectFilter.trimTouring8Passenger);
//        BrowserUtil.ScrollUp(selectFilter.touring8PassengerFilter);
//        BrowserUtil.verifyElementDisplayed(selectFilter.touring8PassengerFilter);
//        BrowserUtil.clickWithJS(selectFilter.selectSecondCar);
//        BrowserUtil.doubleClick(selectFilter.selectSecondCar);
//
//
//            Driver.get().getTitle().equalsIgnoreCase("Honda Pilot 8-Passenger For Sale");
//            BrowserUtil.clickWithJS(selectFilter.checkAvailability1);
//            selectFilter.checkAvailability.click();
//            Driver.get().manage().deleteAllCookies();
//            BrowserUtil.clickWithTimeOut(selectFilter.firsName, 3);
//            BrowserUtil.doubleClick(selectFilter.firsName);
//            selectFilter.firsName.click();
//            selectFilter.firsName.sendKeys("car");
//            BrowserUtil.clickWithTimeOut(selectFilter.lastName, 3);
//            selectFilter.lastName.click();
//            selectFilter.lastName.sendKeys("Owner");
//            BrowserUtil.clickWithTimeOut(selectFilter.email, 3);
//            selectFilter.email.click();
//            selectFilter.email.sendKeys("carowner@yahoo.com");
//        BrowserUtil.takeSnapShot(selectFilter.paymentCalculator, "aman.png");
//        }
//

}
