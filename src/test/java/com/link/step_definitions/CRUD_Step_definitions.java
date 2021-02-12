package com.link.step_definitions;

import com.link.pages.BasePage;
import com.link.utilities.ConfigurationReader;
import com.link.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CRUD_Step_definitions {

    BasePage basePage = new BasePage();

    @Given("User on the Home page")
    public void user_on_the_Home_page() {
        Driver.get().get(ConfigurationReader.getProperty("spartan.url"));
    }

    @When("User navigates to the Spartan CRUD Operations page")
    public void user_navigates_to_the_Spartan_CRUD_Operations_page() {
        basePage.WebDataLink.click();
    }

    @Then("User verifies that {string} title is displayed")
    public void user_verifies_that_title_is_displayed(String expectedTitle) {
        Assert.assertEquals("Wrong title", expectedTitle, Driver.get().getTitle());
    }

}
