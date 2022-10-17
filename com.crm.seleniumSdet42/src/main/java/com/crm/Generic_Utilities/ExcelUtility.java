package com.crm.Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method is used to fetch data from Excel
	 * @param sheetName
	 * @param RowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @author Jayanta
	 */
	public String getDataFromExcel(String sheetName,int RowNum,int cellNum) throws EncryptedDocumentException, IOException
	{

		 //FileInputStream fis1= new FileInputStream("./Book1.xlsx");
		 FileInputStream fis1= new FileInputStream(ipathConstant.EXCELFILE_PATH);
			Workbook wb = WorkbookFactory.create(fis1);
			Sheet sh = wb.getSheet(sheetName);
			  Row row = sh.getRow(RowNum);
			Cell cel=row.getCell(cellNum);
			String data = cel.getStringCellValue();
			
			return data;
			
	}

}
