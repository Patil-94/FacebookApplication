package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadProfile extends BaseClass
{
       Robot robot = new Robot();

      @FindBy(xpath ="/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[1]/span")
      WebElement click;

      @FindBy(xpath ="//*[@id=\"mount_0_0_DH\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div/div/div[1]")
      WebElement uploadBtn;



     public UploadProfile(WebDriver driver) throws AWTException
     {
         PageFactory.initElements(driver, this);
     }

     public void uploadTO_Profile() throws InterruptedException
     {
             click.click();
             Thread.sleep(1000);
              setClipboardData("C:\\Users\\sachin\\Desktop\\IMG_20160912_165647.jpg");


     }

     public void setClipboardData(String string) throws InterruptedException
     {
         //copy filepath into the clipboard
        StringSelection stringSelection =new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null );

        //pressing control+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);

        //realesing Control+V
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        //pressing and releasing enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
     }

}
