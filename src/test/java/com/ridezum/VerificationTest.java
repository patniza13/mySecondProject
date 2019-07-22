package com.ridezum;


import org.junit.Assert;
import org.junit.Test;
public class VerificationTest extends BaseTest {




    @Test
    public void testVerification() {

        String actualTitle = driver.getTitle();

        String expectedTitle = "Zūm | Rides for Kids, After School Care";

        Assert.assertEquals(expectedTitle, actualTitle);


    }



}
