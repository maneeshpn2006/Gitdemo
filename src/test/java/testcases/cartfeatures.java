package testcases;

import java.io.IOException;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.cartfeaturePF;
import Objects.saucedemologinPF;
import saucedemo.Artsaucedemo.Base;

public class cartfeatures extends Base{
	
	 public  WebDriver driver;
	
	 @BeforeTest
	 public void AppLanuch() throws IOException
	 {
		 driver=initialisebrowser();
		 getURL();
			
			
	 }
	 @BeforeTest
		public void loginpage() throws IOException, InterruptedException
		{
			
			
		    loginsaucedemo login1 = new loginsaucedemo();
		    login1.login("standard_user", "secret_sauce");
		    System.out.println("checxking git push");
		    
		    
		    
		
	 
	 
} 
	 @Test(priority=1)	
	 public void additem() throws InterruptedException
	 {   Thread.sleep(4000);	 
		 cartfeaturePF clickcart=new cartfeaturePF(driver);
		 clickcart.backpackaddtocart().click();
		 boolean visiblem=clickcart.carticon().isDisplayed();
		 Assert.assertTrue(visiblem);
		 
		 
	 }
	 
	 @Test(priority=2)	
	 public void sortitem()
	 {
		 
		 
		 
	 }
	 
	 
}