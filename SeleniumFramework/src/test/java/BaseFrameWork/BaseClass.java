package BaseFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass 
{
//code for properties file all important essentials will placed here. Like Parent class
	//creating object
	public static WebDriver driver;
	static File file ;
	static Properties prop;
	static FileInputStream fip; //to read the i/p data
	Logger log = Logger.getLogger("TestScripts");
	public static void initializeProp(String filepath)
	{
		file=new File(filepath); //initialize the file path
		try {
			fip=new FileInputStream(file);
			prop=new Properties();
			prop.load(fip);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException found in initializeProp: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException found in initializeProp: " + e.getMessage());

		}
		
	}
	public static String readProperty(String property)
	{
		return prop.getProperty(property);
	}
	public static void launchBrowser()
	{
		// System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"D:\\GIT\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver", "\\Resources\\chromedriver.exe");
		//System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\gopi_s\\Selenium1\\FirstSelenium\\drivers\\chromedriver");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get(readProperty("Constants.Application"));
		driver.get("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
}
