package ru.yandex.praktukum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    private By orderButtonInHeader = By.xpath("//button[@class='Button_Button__ra12g']");
    //HomeFinishButton так в html-коде блок называется где эта кнопка находится
    private By orderButtonInFooter = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOrderButton (){ webDriver.findElement(orderButtonInHeader).click();}

    public void clickHomeFinishButton (){
        webDriver.findElement(orderButtonInFooter).click();
    }

}
