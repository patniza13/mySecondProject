package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PersonalInfoPage extends BasePage {

    public PersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"name\"]")
    private WebElement nameField;

    @FindBy(css = "[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "[name=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "[name=\"eeo[gender]\"]")
    private WebElement genderField;

    @FindBy(css = "[name=\"eeo[race]\"]")
    private WebElement raceField;

    @FindBy(css = "[name=\"eeo[veteran]\"]")
    private WebElement veteranStatusField;

    @FindBy(css = "[type=\"text\"]")
    private List<WebElement> additionalFields;

    @FindBy(css = "[type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMessage;






    public void inputName(String name) {
        nameField.sendKeys(name );
    }

    public void inputEmail (String email) {
        emailField.sendKeys(email  );
    }

    public void inputPhone (String phone) {
        phoneField.sendKeys(phone  );
    }

    public void selectGender(int i) {
        Select select = new Select( genderField );
        select.selectByIndex( i );
    }

    public void selectRace(int i) {
        Select select = new Select( raceField );
        select.selectByIndex( i );
    }

    public void selectVeteranStatus(int i) {
        Select select = new Select(veteranStatusField);
        select.selectByIndex( i );
    }

    public void inputCurrentCompany(String currentCompany) {
        additionalFields.get( 2 ).sendKeys( currentCompany );
    }

    public void inputLinkedInUrl(String linkedInUrl) {
        additionalFields.get( 3 ).sendKeys(linkedInUrl  );
    }

    public void inputPortfolioUrl(String portfolioUrl) {
        additionalFields.get( 4 ).sendKeys( portfolioUrl );
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.get( 0 ).getText();
    }


    }






