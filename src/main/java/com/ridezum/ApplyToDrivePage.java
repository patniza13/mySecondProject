package com.ridezum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.WEmbeddedFrame;

import java.util.List;
import java.util.Random;


public class ApplyToDrivePage extends BasePage {

    public ApplyToDrivePage(WebDriver driver) {
        super( driver );


    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    // @FindBy(css = "option")
    //  private List<WebElement> dropDownRegionField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement regionField;

    @FindBy(css = "#application_form_zipcode")
    private WebElement zipField;

    @FindBy(css = "[name=\"button\"]")
    private WebElement submitButton;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> careersButton;

    @FindBy(css = "small:nth-child(3)")
    private List<WebElement> invalidNotification;



    public void inputFirstName(String firstName) {
        firstNameField.sendKeys( firstName );
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys( lastName );
    }

    public void inputEmail(String email) {
        emailField.sendKeys( email );
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys( phone );
    }

    // public void selectRegion(int i) {
    // dropDownRegionField.get( i ).click();
    //   }

    public void inputZip(String zip) {
        zipField.sendKeys( zip );
    }

    public void clickSubmitButton() {
        submitButton.click();

    }

    public void selectRegion(int i) {
        Select select = new Select( regionField );
        select.selectByIndex(i);
    }

    public void selectRegionByName() {

        Select select = new Select( regionField );

        select.selectByValue("Dallas, Texas");
    }

    public void selectRegionByVisName() {

        Select select = new Select( regionField );

        select.selectByVisibleText( "Southern California" );
    }

    public void clickCareersbutton() {
        careersButton.get(4).click();
    }

    public String getInvalidEmailNote() {
        return invalidNotification.get( 2 ).getText();
    }

    public String getInvalidPhoneNote() {
        return invalidNotification.get( 3 ).getText();
    }

    public void clearEmail() {
        emailField.clear();
    }

    public void clearPhone() {
        phoneField.clear();
    }





}








