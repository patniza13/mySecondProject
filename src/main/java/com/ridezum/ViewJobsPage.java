package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewJobsPage extends BasePage {

    public ViewJobsPage(WebDriver driver) {
        super( driver );
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> applyButton;


    public FirstJobPage clickApplyButton() {
        applyButton.get( 0 ).click();
        return new FirstJobPage( driver );
    }









}
