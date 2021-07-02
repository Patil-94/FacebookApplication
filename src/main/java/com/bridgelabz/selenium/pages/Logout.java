package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass  {

    @FindBy (xpath = " /html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/img")
    WebElement accountBtn;

/*
    @FindBy (xpath = "//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'][normalize-space()='Settings & privacy']\n")
    WebElement settingBtn;
*/

    /*@FindBy (xpath = " //span[normalize-space()='Help & support']")
    WebElement helpBtn;

    @FindBy (xpath = "//span[normalize-space()='Display & accessibility']")
    WebElement displayBtn;*/

    //create a parameterized constuctor.
    public Logout(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public void logout_Application() throws InterruptedException {
        accountBtn.click();
        Thread.sleep(500);
        //settingBtn.click();
        //Thread.sleep(500);
        /*helpBtn.click();
        Thread.sleep(500);
        displayBtn.click();
        Thread.sleep(500);*/
    }
}
