package com.tyss.MvnDemo;

import org.testng.annotations.Test;

public class SampleTest {


	/*@Test
	public void sampleTest()
	{
		System.out.println("Sample Test Execute");
	}*/
	
	
	@Test
	public void sampleTest()
	{
		String browserName=System.getProperty("browserxxx");
		String URLName=System.getProperty("url");
		
		System.out.println("The browser name is:="+browserName);
		System.out.println("The url name is:="+URLName);
		
		System.out.println("Sample Test Execute");
		System.out.println("testing jenkins build process");
				System.out.println("testing jenkins build process for cheking conflicts");

	}
}
