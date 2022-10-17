package com.crm.Generic_Utilities;

import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used to avoid Duplicate values.
	 * @return
	 * @author Jayanta
	 */
	
	public int getRandomNum()
	{
		Random ran=new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
	}

}
