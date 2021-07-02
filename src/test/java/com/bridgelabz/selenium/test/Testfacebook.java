package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Dashboard;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.Signup;
import com.bridgelabz.selenium.pages.Logout;
import com.bridgelabz.selenium.utility.Customlistener;
import com.bridgelabz.selenium.utility.UploadProfile;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners(Customlistener.class)
public class Testfacebook extends BaseClass {

/*test for Login Page
and also check actual result and expected result */
    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException{
        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //validation
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.facebook.com/";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
    }

    @Test
    public void screenShotTo_Application() throws InterruptedException{
        Login login=new Login(driver);
        login.loginTo_Application();
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.facebook.com1/";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
    }

    /*test for SignUp Page
    and also check actual result and expected result */
    @Test
    public void signupTo_Application_with_valid_credentials() throws InterruptedException, AWTException {
        Signup signup = new Signup(driver);
        signup.signupTo_Application();
        String actualUrl= driver.getCurrentUrl();
        String expected= "https://www.facebook.com/";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
    }

    @Test
    public void dashBoardTo_Groupdetail() throws InterruptedException, AWTException {
        Login login=new Login(driver);
        login.loginTo_Application();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.gropDetail();

    }
    @Test
    public void dashBoardTo_SearchBar() throws InterruptedException, AWTException {
        Login login=new Login(driver);
        login.loginTo_Application();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.searchDetail();
    }

    @Test
    public void dashBoardClick_Notification() throws InterruptedException, AWTException {
        Login login=new Login(driver);
        login.loginTo_Application();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickonNotification();
    }

    @Test
    public void dashBoardClick_IconBtn() throws InterruptedException, AWTException {
        Login login=new Login(driver);
        login.loginTo_Application();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickonprofileIcon();
    }
    @Test
    public void logoutTo_Application() throws InterruptedException, AWTException {
        Login login=new Login(driver);
        login.loginTo_Application();
        Logout  logout =new Logout(driver) ;
        logout.logout_Application();
    }

    @Test
        public void uploadProfileTo_Application() throws InterruptedException, AWTException
    {
        Login login=new Login(driver);
        login.loginTo_Application();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickonprofileIcon();
        UploadProfile profile = new UploadProfile(driver);
        profile.uploadTO_Profile();

    }


}

