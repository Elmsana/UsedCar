package com.cars.pages;

import com.cars.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchToolPage {
    public SearchToolPage(){ PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(css = "[id='make-model-search-stocktype']")
    public WebElement searchByMake;

    @FindBy(css= "[id='make-model-search-stocktype'] [value='used']")
    public WebElement usedCars;

    @FindBy(css = "[id='makes'] [value='honda']")
    public WebElement allMake;

    @FindBy(css= "[id='models'] [value='honda-pilot']")
    public WebElement allModel;

    @FindBy(css = "[id='make-model-max-price'] [value='50000']")
    public WebElement noMaxPrice;

    @FindBy(css = "[id='make-model-maximum-distance'] [value='100']")
    public WebElement noMilesFrom;

    @FindBy(css = "[id='make-model-zip']")
    public WebElement zip;

    @FindBy(xpath = "(//button[@class='sds-button']) [1]")
    public WebElement search;

    @FindBy(xpath = "(//span[contains(text(),'Max price: $50,000')])[2]")
    public WebElement MaxPriceFilter;

    @FindBy(xpath = "(//span[contains(text(),'Honda')])[2]")
    public WebElement HondaFilter;

    @FindBy(xpath = "(//span[contains(text(),'Pilot')])[2]")
    public WebElement PilotFilter;

    @FindBy(xpath = "(//span[contains(text(),'Used')])[2]")
    public WebElement UsedFilter;

    @FindBy(xpath = "//select[@id='stock-type-select']")
    public WebElement NewAndUsedFilter;

    @FindBy(xpath = "(//select[@id='stock-type-select']/option)[3]")
    public WebElement newRadioButton;

    @FindBy(xpath = "(//span[@class='sds-filter sds-filter--applied active-filter-tag'])[6]")
    public WebElement newFilterDisplayed;

    @FindBy(xpath = "//div[@id='trim']")
    public WebElement trimBox;

    @FindBy(xpath = "//div[@id='trim']/div/div[11]")
    public WebElement trimTouring8Passenger;

    @FindBy(xpath = "(//span[contains(text(),'Touring 8-Passenger')])[2]")
    public WebElement touring8PassengerFilter;

    @FindBy(xpath = "//div[@id='vehicle-cards-container']/div[3]")
    public WebElement selectSecondCar;

    @FindBy(xpath = "(//h1[@class='listing-title'])[2]")
    public WebElement checkHondaTitle;

    @FindBy(xpath = "//select[@id='subject']/option[1]")
    public WebElement checkAvailability1;

    @FindBy(xpath = "(//div[@class=\"sds-field sds-form-module__button\"]/button)[2]")
    public WebElement checkAvailability;

    @FindBy(css = "input[id='first_name']")
    public WebElement firsName;

    @FindBy(css = "input[id='last_name']")
    public WebElement lastName;

    @FindBy(css = "input[id='email']")
    public WebElement email;

    @FindBy(xpath = "(//section[@class='sds-page-section'])[1]")
    public WebElement paymentCalculator;








    }


