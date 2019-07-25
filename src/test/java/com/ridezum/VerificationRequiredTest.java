package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class VerificationRequiredTest extends BaseTest {

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;



    @Test
    public void testVerificationRequired() {

     applyToDrivePage =  new ApplyToDrivePage( driver );
     homePage = new HomePage( driver );

     homePage.clickApplyButton();
     driver.switchTo().frame( driver.findElement( By.cssSelector( ".iframe-container.m-banner-drive__iframe" ) ) );

     applyToDrivePage.inputFirstName( "Nobody" );
     applyToDrivePage.inputLastName( "Someone" );
     applyToDrivePage.inputEmail( "sdfasdfasdcom" );
     applyToDrivePage.getInvalidEmailNote();
     applyToDrivePage.inputPhone( "001547" );
     applyToDrivePage.getInvalidPhoneNote();


     applyToDrivePage.clearEmail();
     applyToDrivePage.clearPhone();


        applyToDrivePage.inputEmail( "goodmail@gmail.com" );
        applyToDrivePage.inputPhone( "4081234567" );

        Random random = new Random(  );
        int randomRegion = random.nextInt( 6 );

        applyToDrivePage.selectRegionByName();
        applyToDrivePage.inputZip( "89112" );
        applyToDrivePage.clickSubmitButton();
        System.out.println("Test Successful");





    }


}
