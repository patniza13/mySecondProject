package com.ridezum;


import org.junit.Assert;
import org.junit.Test;



public class CareersPageApplicationTest extends BaseTest {

    private HomePage homePage;
    private CareersPage careersPage;
    private ViewJobsPage viewJobsPage;
    private FirstJobPage firstJobPage;
    private PersonalInfoPage personalInfoPage;


    @Test
    public void testCareersPageApplication() throws InterruptedException {

        homePage = new HomePage( driver );

        careersPage = homePage.clickCareersButton();

        String oldTab = driver.getWindowHandle(); //remembers tab prior to switch

        viewJobsPage = careersPage.clickViewJobsButton();

       driver.close(); //closes current Tab


        for (String newTab : driver.getWindowHandles()) {     //switches to new tab

        driver.switchTo().window( newTab );

        firstJobPage = viewJobsPage.clickApplyButton();

        personalInfoPage = firstJobPage.clickApplyForThisJobButton();

        Thread.sleep( 3000 );

        personalInfoPage.inputName( "SomeName" );

        personalInfoPage.inputEmail( "another@gmail.com" );

        personalInfoPage.inputPhone( "8051234567" );

        personalInfoPage.inputCurrentCompany( "New Company" );

        personalInfoPage.inputLinkedInUrl( "https://asddfsdfsdg" );

        personalInfoPage.inputPortfolioUrl( "https://asdasfasfa" );

        personalInfoPage.selectGender( 2 );

        personalInfoPage.selectRace(3);

        personalInfoPage.selectVeteranStatus( 1 );

        personalInfoPage.clickSubmitButton();

      String currentRequiredMessage =  personalInfoPage.getErrorMessage();
      String expectedRequiredMessage = "✱ Please attach a resume";
      Assert.assertEquals( currentRequiredMessage, expectedRequiredMessage );
            System.out.println(currentRequiredMessage);
            System.out.println(expectedRequiredMessage);







        }




        //   driver.switchTo().window( oldTab ); //switches back





    }

}











