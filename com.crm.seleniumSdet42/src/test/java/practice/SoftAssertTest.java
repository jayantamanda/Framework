package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest{
	@Test
	public void createCustomer()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("A", "B");
		
		System.out.println("Step3");
		System.out.println("Step4");
		s.assertAll();
		
	}
	@Test
	public void modifyCustomer()
	{
		System.out.println("***************");
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
	}
	

}
