package com.link.pages;

import com.link.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "i[class= 'fas fa-users']")
    public WebElement WebDataLink;
}
