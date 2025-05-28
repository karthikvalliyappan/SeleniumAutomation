package com.scb.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources",
                  glue = "com.scb.stepdefinitions",
                  dryRun = false,
                  plugin = {"pretty", "html:target/cucumber-reports/login.html",
                                      "rerun:target/failed-scenarios.txt"}
                )
public class TestRunner
{

}
