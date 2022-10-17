package CampaignWithProduct;


import java.io.IOException;





import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.ExcelUtility;

import com.crm.Generic_Utilities.JavaUtility;
import com.crm.Generic_Utilities.WebDriverUtility;
import com.crm.ObjectRepositery.Campaign;
import com.crm.ObjectRepositery.HomePage;

import com.crm.ObjectRepositery.ProductPage;


@Test(groups = {"regressionTest"})
public class CreateCampaignWithProductTest extends BaseClass{
public void createCampaignWithProduct() throws IOException {
		 WebDriverUtility wb=new WebDriverUtility();
		 
		 wb.waitForPageToLoad(driver);
		
		
		
		 /* driver.findElement(By.name("user_name")).sendKeys(UserName);
		 driver.findElement(By.name("user_password")).sendKeys(Password);
		 driver.findElement(By.id("submitButton")).click();*/
		 HomePage h=new HomePage(driver);
		 h.getPrdBtn().click();
		 ProductPage p=new ProductPage(driver);
			p.getCrtProductbtn().click();
		 
		/* driver.findElement(By.xpath("(//a[.='Products'])[1]")).click();
		 driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();*/
		
		 JavaUtility jil=new JavaUtility();
		 int RanNum= jil.getRandomNum();
		 
		 ExcelUtility ex=new ExcelUtility();
			String data = ex.getDataFromExcel("sheet1", 0, 0)+RanNum;
		 
			p.productpage(data);
			/*driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(data);
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();*/
		 
			Campaign c=new Campaign(driver);
			c.campaigntext(data);
			c.getSaveBtn().click();
			
			 driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
			 driver.findElement(By.xpath("(//a[.='Campaigns'])[1]")).click();
			 driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
			
			 String data1 = ex.getDataFromExcel("sheet1", 0, 0)+RanNum;
			 driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(data1);
			 
			 
			 driver.findElement(By.xpath("//img[@title='Select']")).click();
			 wb.switchToWindow(driver,"Products&action");
				
				
				/*Set<String> allId=driver.getWindowHandles();
				java.util.Iterator<String> it=allId.iterator();
				while(it.hasNext())
				{
					String wid=it.next();
					driver.switchTo().window(wid);
					if(driver.getTitle().contains("Products&action"))
					{
						break;
					}
				}*/
				//wb.switchToWindow(driver, "Campaigns&action");
				driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(data);
				driver.findElement(By.xpath("//input[@name='search']")).click();
				driver.findElement(By.xpath("//a[text()='"+data+"']")).click();
				
				wb.switchToWindow(driver, data1);
				
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
				
				
				/*Set<String> allId1=driver.getWindowHandles();
				java.util.Iterator<String> it1=allId1.iterator();
				while(it1.hasNext())
				{
					String wid=it1.next();
					driver.switchTo().window(wid);
					if(driver.getTitle().contains("Campaigns&action"))
					{
						break;
					}
				
				
	}*/
				 h.getLogoutBtn().click();
				   h.getSignBtn().click();
          
  
}
}
