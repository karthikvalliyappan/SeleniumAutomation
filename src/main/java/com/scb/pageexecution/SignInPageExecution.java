package com.scb.pageexecution;

import com.scb.locators.SignInPageLocators;
import org.openqa.selenium.WebElement;

public class SignInPageExecution extends SignInPageLocators
{
    public static void enterUsername(String username)
    {
        enterInputInTextbox(getUserNameElement(),username);
    }

    public static void enterPassword(String password)
    {
        enterInputInTextbox(getPasswordElement(), password);
    }

    public static void clickLogInButton()
    {
        clickingButton(getLoginButtonElement());
    }

}
