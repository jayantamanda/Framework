package com.crm.organization;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.ExcelUtility;
import com.crm.Generic_Utilities.JavaUtility;
import com.crm.Generic_Utilities.WebDriverUtility;
import com.crm.ObjectRepositery.HomePage;
import com.crm.ObjectRepositery.OrganizationPage;
import com.crm.ObjectRepositery.ValidationAndVerificationPage;
@Listeners(com.crm.Generic_Utilities.Listener.class)
public class CreateOrganizationTest extends BaseClass {
@Test(groups = { "smokeTest","regressionTest"})
public void createOrganization() throws IOException {
		
	
	WebDriverUtility wb=new WebDriverUtility();
	 JavaUtility jil=new JavaUtility();
		
		 
		 wb.waitForPageToLoad(driver);
		  
		 
		 
		 HomePage h=new HomePage(driver);
		 h.getOrgBtn().click();
		
		 Assert.assertEquals(true, false);//for listener
		 
		 OrganizationPage on=new OrganizationPage(driver);
		  on.getCreateorgBtn().click();
				 
		 //driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		// driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		 
		
		 int RanNum= jil.getRandomNum();
		 
		 ExcelUtility ex=new ExcelUtility();
		 String data = ex.getDataFromExcel("sheet1", 0, 0)+RanNum;
		 
           on.writenText(data);
           on.getBttn();

		 
			/*driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(data);
			driver.findElement(By.xpath("(//input[@name='button'])[3]")).click();*/
           ValidationAndVerificationPage validate=new ValidationAndVerificationPage(driver);
           validate.organizationValidation(driver, data);
			
			h.getLogoutBtn().click();
			h.getSignBtn().click();
			}
/*@Test
public void modifyOrg() {
	System.out.println("done");
	
}*/

	}
