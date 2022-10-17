package com.crm.Generic_Utilities;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.crm.ObjectRepositery.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
public static WebDriver sDriver;
	@BeforeSuite(groups = { "smokeTest","regressionTest"})
	public void BS() {
		System.out.println("DataBase Connection");
	}
	@BeforeTest(groups = { "smokeTest","regressionTest"})
	public void BT()
	{
		System.out.println("Execute in parallel mode ");
	}
	
	//@Parameters("BROWSER")(for cross browser)
	@BeforeClass(groups = { "smokeTest","regressionTest"})
	//public void BC(String BROWSER)(cross browser)
	public void BC() throws IOException
	{
		FileUtility fil=new FileUtility();
		
		 
		 String Browser=fil.getPropertyKeyValue("browser");
		
		 if(Browser.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 else if(Browser.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();		
			 }
		 else if(Browser.equalsIgnoreCase("msedge"))
		 {
			 WebDriverManager.edgedriver().setup();
             driver=new EdgeDriver();
			 }
		 
		 else {
			 driver=new ChromeDriver();		
			 }
		 sDriver=driver;
		System.out.println("Launching the browser");
	}
	
	@BeforeMethod(groups = { "smokeTest","regressionTest"})
	public void BM() throws IOException {
		FileUtility fil=new FileUtility();
		 String URL = fil.getPropertyKeyValue("url");
		 String UserName=fil.getPropertyKeyValue("un");
		 String Password=fil.getPropertyKeyValue("pw");

		 driver.get(URL);
		 LoginPage ln=new LoginPage(driver);
		 ln.login(UserName, Password);
		System.out.println("Login to Application");
	}
	
	public void AM()
	{
		System.out.println("Logout the Application");
	}
	@AfterClass(groups = { "smokeTest","regressionTest"})
	public void AC()
	{
		System.out.println("Close the browser");
	}
    @AfterTest(groups = { "smokeTest","regressionTest"})
    public void AT() {
	System.out.println("Executed Successfully");
    }
    @AfterSuite(groups = { "smokeTest","regressionTest"})
    public void AS()
    {
    	System.out.println("Database close");
    }
}
