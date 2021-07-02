package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    //instance of webdriver
    public static WebDriver driver;
    //execute before test
    @BeforeTest
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //launch chrome
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");//enter url
        Thread.sleep(500);
    }
    //execute after test
    @AfterTest
    //teardown method for close browser
    public void tearDown(){

        driver.close();
    }
}
