package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class Screenshot extends BaseClass
{
    /* create one method for test is failed */
     public void failed()
     {
         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try
         {
             FileUtils.copyFile(scrFile,new File("C:\\Users\\sachin\\IdeaProjects\\Demo3\\src\\main\\java\\com\\bridgelabz\\selenium\\testfailed\\Failed" + "_"  +".jpg"));
         }
         catch (IOException e )
         {
             e.printStackTrace();
         }
     }

    /* create one method for test is Success */
    public void success()
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(scrFile,new File("C:\\Users\\sachin\\IdeaProjects\\Demo3\\src\\main\\java\\com\\bridgelabz\\selenium\\testfailed\\Success" + "_"  +".jpg"));
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }
    }
}
