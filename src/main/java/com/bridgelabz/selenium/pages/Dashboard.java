package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends BaseClass
{
     @FindBy (xpath = "//input[@placeholder='Search Facebook']")
     WebElement clickonSearch;

     @FindBy (xpath = "//a[@href='https://www.facebook.com/groups/?ref=bookmarks']//div[@class='ow4ym5g4 auili1gw rq0escxv j83agx80 buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 nnctdnn4 hpfvmrgz qt6c0cv9 jb3vyjys l9j0dhe7 du4w35lb bp9cbjyn btwxx1t3 dflh9lhu scb9dxdr']//div[@class='nqmvxvec j83agx80 cbu4d94t tvfksri0 aov4n071 bi6gxh9e l9j0dhe7 m6uieof3 icc0peqn hx8drtub j13r6fgp nddp3pr2']//img[@class='hu5pjgll bixrwtb6']")
     WebElement clickonGroup;

     @FindBy (xpath = "//a[@aria-label='Notifications']//*[local-name()='svg']")
     WebElement clickNotification;

    @FindBy(xpath ="//div[@class='nqmvxvec j83agx80 cbu4d94t tvfksri0 aov4n071 bi6gxh9e l9j0dhe7 m6uieof3 icc0peqn hx8drtub j13r6fgp nddp3pr2']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[local-name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")
    WebElement clickIcon;

    /*create parameterized contructor*/
    public Dashboard(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void searchDetail() throws InterruptedException
    {
        clickonSearch.sendKeys("ankita");
        Thread.sleep(500);
    }

    public void gropDetail() throws InterruptedException
    {
        clickonGroup.click();
        Thread.sleep(500);
    }
    public void clickonNotification() throws InterruptedException
    {
        clickNotification.click();
        Thread.sleep(500);
    }
    public void clickonprofileIcon() throws InterruptedException
    {
        clickIcon.click();
        Thread.sleep(500);
    }
}

