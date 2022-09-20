package ru.yandex.praktukum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {

    private By nameButton = By.xpath("//input[@placeholder='* Имя']");
    private By surnameButton = By.xpath("//input[@placeholder='* Фамилия']");
    private By addressButton = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By stationButton = By.xpath("//input[@placeholder='* Станция метро']");
    private By metroName = By.xpath("//*[text( ) = 'Красносельская']");
    private By phoneButton = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath("//button[contains(text(),'Далее')]");
    private By dateButton = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By timeButton = By.xpath("//div[@class='Dropdown-placeholder']");
    private By finishButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By yesButton = By.xpath("//button[contains(text(),'Да')]");

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterName(String text) {
        webDriver.findElement(nameButton).sendKeys(text);
    }

    public void enterSurname(String text) {
        webDriver.findElement(surnameButton).sendKeys(text);
    }

    public void enterAddress(String text) {
        webDriver.findElement(addressButton).sendKeys(text);
    }

    public void selectMetroStation(String text) {
        webDriver.findElement(stationButton).click();
        webDriver.findElement(metroName).click();
    }

    public void enterPhone(String text) {
        webDriver.findElement(phoneButton).sendKeys(text);
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    public void selectDate() {
        webDriver.findElement(dateButton).click();
        webDriver.findElement(By.xpath(" //div[@aria-label='Choose вторник, 20-е сентября 2022 г.']")).click();
    }

    public void choseTime() {
        webDriver.findElement(timeButton).click();
        webDriver.findElement(By.xpath("//*[text( ) = 'двое суток']")).click();
    }

    public void clickOrderButtonFinish() {
        webDriver.findElement(finishButton).click();
    }

    public void clickYesButton() {
        webDriver.findElement(yesButton).click();
    }
}
