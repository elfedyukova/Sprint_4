package ru.yandex.praktukum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    private By OrderButtonInHeader = By.xpath("//button[@class='Button_Button__ra12g']");
    private By HomeFinishButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver) {
        super(webDriver);

    }
    public void clickOrderButton (){
        webDriver.findElement(OrderButtonInHeader).click();
    }
    public void clickHomeFinishButton (){
        webDriver.findElement(HomeFinishButton).click();
    }


}
