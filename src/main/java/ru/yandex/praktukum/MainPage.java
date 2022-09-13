package ru.yandex.praktukum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    private By OrderButton = By.xpath("//button[@class='Button_Button__ra12g']");


    public MainPage(WebDriver webDriver) {
        super(webDriver);

    }
    public void clickOrderButton (){
        webDriver.findElement(OrderButton).click();
    }



}
