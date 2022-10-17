package com.crm.Generic_Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {


public void onTestStart(ITestResult result) {
	
}

public void onTestSuccess(ITestResult result) {
	
}

public void onTestFailure(ITestResult result) {
	String data=result.getMethod().getMethodName();
	EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sDriver);
File src = edriver.getScreenshotAs(OutputType.FILE);

try {
	File des=new File("./com.crm.seleniumSdet42/ScreenShot/"+data+".png");
	FileUtils.copyFile(src, des);
} catch (Exception e) {
	e.printStackTrace();
}
}

public void onTestSkipped(ITestResult result) {
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
}

public void onTestFailedWithTimeout(ITestResult result) {
	
}

public void onStart(ITestContext context) {
	
}

public void onFinish(ITestContext context) {
	
}



}

