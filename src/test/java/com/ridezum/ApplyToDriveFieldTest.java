package com.ridezum;

import org.junit.Test;




public class ApplyToDriveFieldTest extends BaseTest {

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;


    @Test
    public void testApplyToDriveField () throws InterruptedException {

        homePage = new HomePage(driver);

        applyToDrivePage = homePage.clickApplyButton();
        applyToDrivePage.inputFirstName( "John" );
        applyToDrivePage.inputLastName( "Johnson" );
        applyToDrivePage.inputEmail( "blabla@gmail.com" );
        applyToDrivePage.inputPhone( "4081234567" );
        applyToDrivePage.selectArea( 3 );
        applyToDrivePage.inputZip( "95111" );
        applyToDrivePage.clickSubmitButton();


    }



}
