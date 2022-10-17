package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String key="webdriver.chrome.driver";
		 String value ="./chromedriver.exe";
		 System.setProperty(key,value);
		 WebDriver driver = new ChromeDriver();
		 
		 FileInputStream fis=new FileInputStream("./commondata.properties");
		 Properties pro=new Properties();
		 pro.load(fis);
		 String URL=pro.getProperty("url");
		 String UserName=pro.getProperty("un");
		 String Password=pro.getProperty("pw");
		 driver.get(URL);
		 driver.findElement(By.name("user_name")).sendKeys(UserName);
		 driver.findElement(By.name("user_password")).sendKeys(Password);
		 driver.findElement(By.id("submitButton")).click();
		 
		FileInputStream fis1= new FileInputStream("./Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(0);
		String data = cl.getStringCellValue();
		System.out.println(data);
		

	}

}
