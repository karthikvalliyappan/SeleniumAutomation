package com.scb.locators;

import com.scb.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageLocators extends Base
{
    public static WebElement getUserNameElement()
    {
        return driver.findElement(By.xpath("//input[@id ='username']"));
    }
    public static WebElement getPasswordElement  ()
    {
        return driver.findElement(By.xpath("//input[@id ='password']"));
    }
    public static WebElement getLoginButtonElement  ()
    {
        return driver.findElement(By.xpath("//button[@id ='submit']"));
    }
}
