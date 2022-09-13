package ru.yandex.praktukum;

import org.junit.Test;

public class OrderTest extends BaseUITest {

    @Test
    public void orderShould (){
   MainPage mainPage = new MainPage(webDriver);
   mainPage.clickOrderButton();
   OrderPage orderPage = new OrderPage(webDriver);
   orderPage.enterName("Елена");
   orderPage.enterSurname("Иванова");
   orderPage.enterAddress("Усачева 3");
   orderPage.selectMetroStation("Красносельская");
   orderPage.enterPhone("79639206603");
   orderPage.clickNextButton();
   orderPage.selectDate();
   orderPage.choseTime();
   orderPage.clickOrderButtonFinish();
   orderPage.clickYesButton();



    }
}
