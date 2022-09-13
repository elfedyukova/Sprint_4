package ru.yandex.praktukum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseUITest {
    protected static WebDriver webDriver;

    @BeforeClass
    public static void setup (){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        webDriver.findElement(By.id("rcc-confirm-button")).click();


    }

    @AfterClass
    public static void tearDown(){
        webDriver.quit();
    }
}
