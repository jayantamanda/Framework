package com.crm.Campaign;


import java.io.IOException;




import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.ExcelUtility;

import com.crm.Generic_Utilities.JavaUtility;
import com.crm.Generic_Utilities.WebDriverUtility;
import com.crm.ObjectRepositery.Campaign;
import com.crm.ObjectRepositery.HomePage;
import com.crm.ObjectRepositery.ValidationAndVerificationPage;


public class CreateCampaignTest extends BaseClass
{
@Test(groups = {"smokeTest"})
	public void createCampaign() throws IOException{
		
		 WebDriverUtility wb=new WebDriverUtility();
		 JavaUtility jil=new JavaUtility();
		
		
		 wb.waitForPageToLoad(driver);
		 
		
		/* driver.findElement(By.name("user_name")).sendKeys(UserName);
		 driver.findElement(By.name("user_password")).sendKeys(Password);
		 driver.findElement(By.id("submitButton")).click();*/
		 
		 HomePage h=new HomePage(driver);
		 h.getMoreButton().click();
		 h.getCampaignButton().click();
		// driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
		 Campaign c=new Campaign (driver);
		 c.createCampBtn();
		/* driver.findElement(By.xpath("(//a[.='Campaigns'])[1]")).click();
		 driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();*/
		
		 
		 int RanNum= jil.getRandomNum();
		
		 ExcelUtility ex=new ExcelUtility();
			String data = ex.getDataFromExcel("sheet1", 0, 0)+RanNum;
			c.campaigntext(data);
			/*driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(data);
			driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();*/
			ValidationAndVerificationPage validate=new ValidationAndVerificationPage(driver);
			validate.campaignValidation(driver, data);
			
			h.getLogoutBtn().click();
			h.getSignBtn().click();
			

	}
/*@Test
public void modifyCamp()
{
	System.out.println("ok");
}
*/
}
