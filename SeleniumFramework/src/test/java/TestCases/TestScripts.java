package TestCases;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseFrameWork.BaseClass;
import Pages.HomePage;
public class TestScripts extends BaseClass
{
	BaseClass basecl=new BaseClass();
	HomePage homepg=new HomePage();
	//TestNG
	/*	public static void main(String args[])
	{
		String filepath=System.getProperty("user.dir")+"//src//config//config.properties";
		BaseClass.initializeProp(filepath);
		BaseClass.readProperty(filepath);
		System.out.println("Property Read:"+BaseClass.readProperty("applicationurl"));
	} */
	@Test //(enabled = false)
	public void readPropertyTest()
	{
		String filepath=System.getProperty("user.dir")+"//src//test//java//config//config.properties";
		BaseClass.initializeProp(filepath);
		System.out.println("Property Read:"+BaseClass.readProperty("applicationurl"));
	}
	@Test //(enabled = false)
	public void POMTest()
	{
		System.out.println("In Test Method : POMTest");
		launchBrowser();
		homepg.clickSeleniumLink();
	}
/*	@BeforeTest (Before a testcase)
	@BeforeMethod ()
	@AfterTest
	@AfterMethod
	@BeforeClass
	@AfterClass */
	
	@BeforeTest //Before executing a testcase
	public void beforeTest()   //3rd
	{
		System.out.println("In Before Test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In Before Method");
	}
	@BeforeSuite
	public void beforeSuite()   // 1st
	{
		System.out.println("In Before Suite");
	}
	@AfterSuite
	public void afterSuite()    // last - end
	{
		System.out.println("In After Suite");
	}

	@AfterTest
	public void afterTest()		//4th 
	{
		System.out.println("In After Test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In After Method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In Before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("In After Class");
	}

}
