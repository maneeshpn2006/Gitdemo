package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Objects.saucedemologinPF;
import groovyjarjarantlr4.v4.codegen.model.OutputFile;
import saucedemo.Artsaucedemo.Base;


public class loginsaucedemo extends Base {
	 
	 
	



@Test(dataProvider ="getdata")
	
	public void login(String uname,String pwd) throws IOException
	{
	
		
		driver=initialisebrowser();
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
	saucedemologinPF log1=new saucedemologinPF(driver);
		//log1.loginfn().click();
	log1.username().sendKeys(uname);
	log1.password().sendKeys(pwd);
	log1.submit().click();
	//driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(src, new File("E://tt.png"));
	}
@DataProvider
public  Object[][] getdata()
{
	Object[][] data=new Object[1][2];
	
	data[0][0]="standard_user";
	data[0][1]="secret_sauce";
	
	
	//second test
	//data[1][0]="second";
	//data[1][1]="pass";
	
	return  data;
	
	
}
	


	
}

	


