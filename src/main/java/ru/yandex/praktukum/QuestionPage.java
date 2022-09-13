package ru.yandex.praktukum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuestionPage extends BasePage{
    private By firstQuestion = By.id("accordion__heading-0");
    private By secondQuestion = By.id("accordion__heading-1");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By eighthQuestion = By.id("accordion__heading-7");
    

    protected QuestionPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickFirstQuestion() {
        webDriver.findElement(firstQuestion).click();
    }

    public void clickSecondQuestion() {
        webDriver.findElement(secondQuestion).click();
    }

    public void clickThirdQuestion() {
        webDriver.findElement(thirdQuestion).click();
    }

    public void clickFourthQuestion() {
        webDriver.findElement(fourthQuestion).click();
    }

    public void clickFifthQuestion() {
        webDriver.findElement(fifthQuestion).click();
    }

    public void clickSixthQuestion() {
        webDriver.findElement(sixthQuestion).click();
    }

    public void clickSeventhQuestion() {
        webDriver.findElement(seventhQuestion).click();
    }
    public void clickEighthQuestion() {
        webDriver.findElement(eighthQuestion).click();
    }
}
