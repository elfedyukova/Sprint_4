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
    private By MetroName = By.xpath("//*[text( ) = 'Красносельская']");
    private By PhoneButton = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By NextButton = By.xpath("//button[contains(text(),'Далее')]");
    private By DateButton = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By TimeButton = By.xpath("//div[@class='Dropdown-placeholder']");
    private By FinishButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By YesButton = By.xpath("//button[contains(text(),'Да')]");



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
        webDriver.findElement(TimeButton).click();
        webDriver.findElement(By.xpath("//*[text( ) = 'двое суток']")).click();

    }

    public void clickOrderButtonFinish() {
        webDriver.findElement(FinishButton).click();
    }

    public void clickYesButton() {
        webDriver.findElement(YesButton).click();
    }
}
