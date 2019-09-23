package reusableMethods;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;

import javax.swing.*;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils {


    DriverManager driverManager = new DriverManager();
    WebDriver driver = driverManager.getDriver();

    //Explicit wait for asmany seconds you want
    public WebDriverWait waitForSomeTime(int i)
    {
        WebDriverWait wait = new WebDriverWait(driver,i);
        return wait;
    }

    //Close and Quit Driver
    public void closenquitDriver()
    {
        driver.close();
        driver.quit();
    }

    //Click on Java Script Element
    public void cliclJsElement(WebElement ele)
    {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].submit;", ele);
    }

    //Press Keyboard Enter
    public void pressEnter(By by)
    {
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

    // Get Webelement from locator
    public WebElement getWebElement (By by)
    {
       WebElement element = driver.findElement(by);
       return element;
    }

    // Move mouse and then click
    public void moveMouseClick(WebElement element)
    {
        Actions builder = new Actions(driver);
        builder
                .moveToElement(element)
                .build()
                .perform();
    }

    //Get list of child elements from a parent element
    public List<WebElement> getElementsInElement(By parentField, By children)
    {
        WebElement dropdown = driver.findElement(parentField);
        List<WebElement> droplist = driver.findElements(children);
        return droplist;
    }

    //Open Webpage
    public void getWebPage(String webPage)
    {
        driver.get(webPage);
        driver.manage().window().maximize();
    }


    public void clickOnAnElement(By by)
    {
        driver.findElement(by).click();
    }

    public void submitOnAnElement(By by)
    {
        driver.findElement(by).submit();
    }

    public void typeInTextField(By by, String abc)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(abc);
    }

    public void waitForGivenSeconds( int i)
    {
        driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
    }
    public void makeThreadSleep(long l) throws InterruptedException {
            Thread.sleep(5000);
    }

    public void scrollDown()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
    }

    public void writeInTextBox(By by, String abc)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(abc);
    }

    public void selectDateFromDatePicker(By by, String date)
    {
        driver.findElement(by).sendKeys(date);
    }

}
