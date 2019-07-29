package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FirstJobPage extends BasePage {

    public FirstJobPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applyForThisJobButton;





    public PersonalInfoPage clickApplyForThisJobButton() {
        applyForThisJobButton.get( 0 ).click();
        return new PersonalInfoPage( driver );
    }
}
