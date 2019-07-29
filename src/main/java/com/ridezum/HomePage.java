package com.ridezum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".m-btn.front-banner__btn")
    private List <WebElement> applyButton;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> careersButton;


    public ApplyToDrivePage clickApplyButton() {
        applyButton.get(1).click();
        return new ApplyToDrivePage(driver);

    }

    public CareersPage clickCareersButton() {
        careersButton.get( 4 ).click();
        return new CareersPage(driver);
    }




}
