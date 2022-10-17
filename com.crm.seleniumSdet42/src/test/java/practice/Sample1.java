package practice;

import org.testng.annotations.Test;
@Test
public class Sample1 {
	@Test(invocationCount = 4)
	public void createCustomerTest()
	{
		System.out.println("Customer details created");
		int[]arr= {1,2,3};
		System.out.println(arr[5]);
	}
	@Test(dependsOnMethods = "createCustomerTest")

	public void modiyfCustomerTest() {
		System.out.println("customer details modified");
	}
	@Test(dependsOnMethods = "createCustomerTest")
	public void deleteCustomerTest()
	{
		System.out.println("customer details deleted");
	}

}
