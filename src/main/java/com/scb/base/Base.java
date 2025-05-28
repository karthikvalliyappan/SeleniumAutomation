package com.scb.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
    public static WebDriver driver;

    public static void initDriver() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void launchUrl(String url)
    {
        try
        {
            driver.get(url);
           // pageLoadWait();
        }
        catch (Exception e)
        {
            System.out.println(" ");
        }
    }

    public static void explicitWait()
    {

    }

    public static void pageLoadWait()
    {

    }
    public static void enterInputInTextbox(WebElement element, String data)
    {
        try
        {
           // explicitWait();
            element.clear();
            element.sendKeys(data);
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter data in the textbox: " + e.getMessage());
        }
    }

    public static void clickingButton (WebElement element)
    {
        try
        {
            //explicitWait();
            element.click();
        }
        catch (Exception e)
        {
            System.out.println("Unable to click the element : " + e.getMessage());
        }
    }


    public static void quitDriver()
    {
        driver.quit();
    }

}
