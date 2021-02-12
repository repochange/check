package com.link.step_definitions;

import com.link.utilities.ConfigurationReader;
import com.link.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static io.restassured.RestAssured.*;

public class Hook {

    @Before
    public void setup(){
        System.out.println("##############################");
        System.out.println("Test is READY!");
        Driver.get().manage().window().maximize();
        baseURI = ConfigurationReader.getProperty("spartan.base_url");
    }

    @After
    public void teardown(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
        //after every test, we gonna close browser
        Driver.close();
    }
}
