package com.cydeo.step_definitions;

import com.cydeo.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


    @After
    public void teardownScenario(Scenario scenario) {


        if (scenario.isFailed()){
        byte [] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png",scenario.getName()); }

        Driver.closeDriver();
    }


  // @Before
    public void setupScenario() {
        System.out.println("Setting up browser using cucumber @Before each scenario");

    }


    //@Before (value = "@login", order=2)
    public void setupForLogin() {

        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value="@db" , order=3)
    public void setupDatabaseScenario() {
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    //@BeforeStep
    public void setupScenarioStep() {
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep() {
        System.out.println("--------> applying tearDown using @AfterStep");
    }
}
