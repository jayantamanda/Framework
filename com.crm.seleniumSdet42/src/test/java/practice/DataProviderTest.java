package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="dataProvider_test")
	public void bookTicket(String src,String dst)
	{
		System.out.println("Book tickets from "+src+ " to " +dst+"");
	}
	@DataProvider
	public Object[][] dataProvider_test()
	{
		Object[][] objArr=new Object[5][2];
		objArr[0][0]="Pune";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Pune";
		objArr[1][1]="Delhi";
		
		objArr[2][0]="Pune";
		objArr[2][1]="Sikkim";
		
		objArr[3][0]="Pune";
		objArr[3][1]="Mizoram";
		
		objArr[4][0]="Pune";
		objArr[4][1]="Chennai";
		
		return objArr;
				
	}

}
