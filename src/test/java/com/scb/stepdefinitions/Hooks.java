package com.scb.stepdefinitions;

import com.scb.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Base
{
    @Before
    public void setUpAction() throws InterruptedException
    {
        initDriver();
    }

    @After
    public void tearDownAction(Scenario scenario) throws InterruptedException
    {
        boolean b = scenario.isFailed();
        System.out.println(b);
        if (b)
        {
            TakesScreenshot tk = (TakesScreenshot) driver;
            byte[] src = tk.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "Image Attached");
        }
        Thread.sleep(3000);
        quitDriver();
    }
}
