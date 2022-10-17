package com.crm.Product;


import java.io.IOException;



import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.ExcelUtility;

import com.crm.Generic_Utilities.JavaUtility;
import com.crm.Generic_Utilities.WebDriverUtility;
import com.crm.ObjectRepositery.HomePage;


import com.crm.ObjectRepositery.ProductPage;



public class CreateAndDeleteTest extends BaseClass{
@Test(groups = {"smokeTest","regressionTest"})
	public void createAndDelete() throws IOException {
	
		 WebDriverUtility wb=new WebDriverUtility();
		 JavaUtility jil=new JavaUtility();
		 
		 wb.waitForPageToLoad(driver);
		 
		 
		
		/* driver.findElement(By.name("user_name")).sendKeys(UserName);
		 driver.findElement(By.name("user_password")).sendKeys(Password);
		 driver.findElement(By.id("submitButton")).click();*/
		 
		 HomePage h=new HomePage(driver);
		 h.getPrdBtn().click();
		 ProductPage p=new ProductPage(driver);
			p.createprobttn();
		/* driver.findElement(By.xpath("(//a[.='Products'])[1]")).click();
		 driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();*/
		 
		
		 int RanNum= jil.getRandomNum();
		 
		 ExcelUtility ex=new ExcelUtility();
			String data = ex.getDataFromExcel("sheet1", 0, 0)+RanNum;
		
			p.productpage(data);
			
			
			/*driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(data);
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();*/
			p.deletebutton();
			//driver.findElement(By.xpath("(//input[@class='crmbutton small delete'])[1]")).click();
			wb.switchToAllertAndAccept(driver);
			//Alert a=driver.switchTo().alert();
			//a.accept();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
            driver.close();
	}

}
