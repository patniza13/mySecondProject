package com.ridezum;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Albina Karimova\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://ridezum.com/");

        System.out.println("Start");



    }

    @After
    public void quit() {
        System.out.println("Finish");

     //  driver.quit();
    }




}














