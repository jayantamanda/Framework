package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Product {
@Test(dataProvider="dataProvider_test")
public void productDetails(String prodName,String partno,String slno)

{

	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Jayanta\\eclipse-workspace\\com.crm.seleniumSdet42\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	 driver.findElement(By.xpath("//a[.='Products']")).click();
	 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	 
	 driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(prodName);
	 driver.findElement(By.xpath("//input[@id='productcode']")).sendKeys(partno);
	 driver.findElement(By.xpath("//input[@id='serial_no']")).sendKeys(slno);
	 
	 driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
	 driver.quit();
}
@DataProvider
public Object[][] dataProvider_test()
{
	Object[][] objArr=new Object[3][3];
	objArr[0][0]="Hplaptop";
	objArr[0][1]="www.hplaptopp.com";
	objArr[0][2]="H001";
	
	objArr[1][0]="AcerLaptop";
	objArr[1][1]="www.acer.com";
	objArr[1][2]="a001";
	
	objArr[2][0]="DellLaptop";
	objArr[2][1]="www.dell.com";
	objArr[2][2]="de001";
	
	
	return objArr;
}
}
