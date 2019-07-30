package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;
import java.util.Random;


public class ApplyToDriveFieldTest extends BaseTest {

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;


    @Test
    public void testApplyToDriveField () {

        homePage = new HomePage(driver);

        applyToDrivePage = homePage.clickApplyButton();
        driver.switchTo().frame( driver.findElement( By.cssSelector( ".iframe-container.m-banner-drive__iframe" ) ) );

        applyToDrivePage.inputFirstName( "John" );
        applyToDrivePage.inputLastName( "Johnson" );
        applyToDrivePage.inputEmail( "blablabla12@gmail.com" );
        applyToDrivePage.inputPhone( "4081234567" );


        Random random = new Random(  );
        int randomNumber = random.nextInt(6);
       // applyToDrivePage.selectRegion(randomNumber);
       //  applyToDrivePage.selectRegion(randomNumber);

        applyToDrivePage.selectRegionByName();
        applyToDrivePage.selectRegionByVisName();

        applyToDrivePage.inputZip( "95111" );
      //  applyToDrivePage.clickSubmitButton();

        driver.switchTo().defaultContent();

        //applyToDrivePage.clickCareersButton();


        //new changes


    }



}
