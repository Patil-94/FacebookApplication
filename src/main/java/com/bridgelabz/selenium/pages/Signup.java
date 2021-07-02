package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class Signup extends BaseClass {
    Robot robot = new Robot();     /*create object of Robot Class*/

    //path for create new account Btn
    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")
    WebElement regBtn;

    @FindBy(xpath="//input[@name='firstname']")
    WebElement firstname;

    @FindBy(name="lastname")
    WebElement lastname;

    @FindBy(name="reg_email__")
    WebElement email;
    @FindBy(name="reg_email_confirmation__")
    WebElement emailconfirm;

    @FindBy(name="reg_passwd__")
    WebElement password;

    @FindBy(name="birthday_day")
    WebElement date;

    @FindBy(name="birthday_month")
    WebElement month;
    /* create method for month dropdown */
    public Select getSelectOptions() {
        return new Select(month);
    }

    @FindBy(id="year")
    WebElement yr;

    @FindBy(xpath = "//input[@type='radio']")
    WebElement btnRadio;

    /*@FindBy(name = "websubmit")
    WebElement signupBtn;*/

  /*  create parameterized constructor*/
    public Signup (WebDriver driver) throws AWTException {

        PageFactory.initElements(driver, this);
    }

    public void signupTo_Application() throws InterruptedException, AWTException {
        regBtn.click();
        robot.mouseMove(620, 272);

       /* call method*/
        setClipboardData("ankita");

        lastname.sendKeys("patil");

        email.sendKeys("ankitakhairnar100@gmail.com");
        emailconfirm.sendKeys("ankitakhairnar100@gmail.com");

        password.sendKeys("Ankita@123");
        Thread.sleep(500);

        date.sendKeys("17");

        /*call method*/
        setOption(1);
        yr.sendKeys("1997");
        Thread.sleep(500);
        btnRadio.click();

       /*signupBtn .click();
       driver.navigate().forward();*/
    }

    public void setClipboardData(String string) throws InterruptedException
    {
        StringSelection stringSelection =new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null );

       /* press control key from keyboard*/
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);

        //release key from keyboard
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

   /* method for month select in dropdown*/
    public void setOption(int value)
    {
        getSelectOptions().selectByIndex(1);
    }
}
