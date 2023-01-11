package Pages;

import org.openqa.selenium.By;

import BaseFrameWork.BaseClass;

public class HomePage extends BaseClass
//locators as part of each java file
{
	By SeleniumLink =By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/ul/li[1]/a");
	By JavaLink=By.linkText("/html/body/header/div/div[2]/nav/ul/li[2]/ul/li[1]/a");
	public void clickSeleniumLink()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		//driver.findElement(SeleniumLink).click();
		//driver.findElement(JavaLink).click();
		//System.out.println("Page Title after click operation:" +driver.getTitle());
	}
}
