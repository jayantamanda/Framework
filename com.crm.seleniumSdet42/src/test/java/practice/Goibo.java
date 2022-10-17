package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 String key="webdriver.chrome.driver";
		 String value ="./chromedriver.exe";
		 System.setProperty(key,value);
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 FileInputStream fis=new FileInputStream("./goib.properties");
		 Properties pro=new Properties();
		 pro.load(fis);
		 String URL=pro.getProperty("url");
		 driver.get(URL);
		 
		 //Random r=new Random();
		 //int RanNum=r.nextInt(1000);
		 
		 FileInputStream fis1= new FileInputStream("C:\\Users\\Jayanta\\eclipse-workspace\\com.crm.seleniumSdet42\\From.xlsx");
			Workbook wb = WorkbookFactory.create(fis1);
			Sheet sh = wb.getSheet("Sheet1");
			Row rw = sh.getRow(0);
			Cell cl = rw.getCell(0);
			String data = cl.getStringCellValue();
			driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]")).click();
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data+Keys.ENTER);
			
		 FileInputStream fis11= new FileInputStream("./Dest.xlsx");
			Workbook wb1 = WorkbookFactory.create(fis11);
			Sheet sh1 = wb1.getSheet("Sheet1");
			Row rw1 = sh1.getRow(0);
			Cell cl1 = rw1.getCell(0);
			String data1 = cl1.getStringCellValue();
			 driver.findElement(By.xpath("(//p[.='Enter city or airport'])[2]")).click();
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data1+Keys.ENTER);

	}

	}


