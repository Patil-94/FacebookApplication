package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Customlistener extends BaseClass  implements ITestListener {
    Screenshot screenshot =new Screenshot();

    public void onTestFailure(ITestResult result)
    {
        System.out.println("Failed Test");
        screenshot.failed();
    }
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Success Test");
        screenshot.success();
    }
}
