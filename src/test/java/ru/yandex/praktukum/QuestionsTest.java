package ru.yandex.praktukum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class QuestionsTest extends BaseUITest {
    @Test
    public void questionShouldBeFirst () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickFirstQuestion();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-0'] p")).getText();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void questionShouldBeSecond () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickSecondQuestion();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-1'] p")).getText();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionShouldBeThird () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickThirdQuestion();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-2'] p")).getText();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void questionShouldBeFourth () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickFourthQuestion();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-3'] p")).getText();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void questionShouldBeFifth () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickFifthQuestion();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-4'] p")).getText();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void questionShouldBeSixth () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickSixthQuestion();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-5'] p")).getText();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void questionShouldBeSeventh () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickSeventhQuestion();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-6'] p")).getText();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void questionShouldBeEighth () {
        QuestionPage questionPage = new QuestionPage(webDriver);
        questionPage.clickEighthQuestion();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = webDriver.findElement(By.cssSelector("div[id='accordion__panel-7'] p")).getText();
        Assert.assertEquals(expected, actual);

    }
}
