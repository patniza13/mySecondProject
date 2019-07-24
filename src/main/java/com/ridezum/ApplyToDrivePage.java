package com.ridezum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;



public class ApplyToDrivePage extends BasePage {

    public ApplyToDrivePage(WebDriver driver) {
        super(driver);



    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "option")
    private List<WebElement> dropDownRegionField;

    @FindBy (css = "#application_form_zipcode")
    private WebElement zipField;

    @FindBy(css = "[name=\"button\"]")
    private WebElement submitButton;




    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    public void selectRegion(int i) {
        dropDownRegionField.get( i ).click();
    }

    public void inputZip(String zip) {
        zipField.sendKeys(zip);
    }

    public void clickSubmitButton() {
        submitButton.click();

    }







}
