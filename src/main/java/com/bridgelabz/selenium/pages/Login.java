package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.ReadData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
    //declaration
    @FindBy(id = "email")
    WebElement email;

    @FindBy(name="pass")
    WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement loginBtn;

    /*create a parameterized constuctor.
    initialization*/
    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void loginTo_Application()
    {
        /*email.sendKeys("latikakhairnar10@gmail.com");
        password.sendKeys("latika@123");
        loginBtn.click();*/

        String userName = ReadData.getCellValue("C:\\Users\\sachin\\Desktop\\facebook.xlsx","sheet1",1,0) ;
        email.sendKeys(userName);
        String passWord = ReadData.getCellValue("C:\\Users\\sachin\\Desktop\\facebook.xlsx","sheet1",1,1) ;
        password.sendKeys(passWord);
        loginBtn.click();
    }
}
