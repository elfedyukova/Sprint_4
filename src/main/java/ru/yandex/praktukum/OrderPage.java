package ru.yandex.praktukum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrderPage extends BasePage {

    private By NameButton = By.xpath("//input[@placeholder='* Имя']");
    private By SurnameButton = By.xpath("//input[@placeholder='* Фамилия']");
    private By AddressButton = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By StationButton = By.xpath("//input[@placeholder='* Станция метро']");
    private By MetroName = By.xpath("//input[@value='Красносельская']");
    private By PhoneButton = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By NextButton = By.xpath("//button[contains(text(),'Далее')]");
    private By DateButton = By.xpath("//button[contains(text(),'Далее')]");



    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterName(String text) {
        webDriver.findElement(NameButton).sendKeys(text);
    }

    public void enterSurname(String text) {
        webDriver.findElement(SurnameButton).sendKeys(text);
    }

    public void enterAddress(String text) {
        webDriver.findElement(AddressButton).sendKeys(text);
    }

    public void selectMetroStation(String text) {
        webDriver.findElement(StationButton).click();
        //webDriver.findElement(StationButton).sendKeys(text);
        webDriver.findElement(MetroName).click();
    }


    public void enterPhone(String text) {
        webDriver.findElement(PhoneButton).sendKeys(text);
    }

    public void clickNextButton() {
        webDriver.findElement(NextButton).click();
    }

    public void selectDate() {
        webDriver.findElement(DateButton).click();
        webDriver.findElement(By.xpath(" //div[@aria-label='Choose вторник, 20-е сентября 2022 г.']")).click();

    }

    public void choseTime() {
        //webDriver.findElement(NameButton).sendKeys();
    }

    public void clickOrderButtonFinish() {
        //webDriver.findElement(NameButton).sendKeys();
    }

    public void clickYesButton() {
        //webDriver.findElement(NameButton).sendKeys();
    }
}
