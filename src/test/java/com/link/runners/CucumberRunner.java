package com.link.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/link/step_definitions",
        dryRun = false,
        tags = "@Start"
)
public class CucumberRunner {
}
