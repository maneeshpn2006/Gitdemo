package saucedemo.Artsaucedemo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class Base {
	public WebDriver driver;
	public Properties prop;
public WebDriver initialisebrowser() throws IOException

{
	
	 prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Maneesh\\eclipse-workspace\\Mavsel\\src\\main\\java\\mywebtest\\Mavsel\\Data.properties");

	prop.load(fis);
	
	String  browsername= prop.getProperty("browser");
	
if(browsername.equals("chrome"))
{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Maneesh\\Desktop\\eclipse\\chromedriver.exe");
     driver = new ChromeDriver();

}

else if(browsername.equals("firefox"))
{
	
	System.setProperty("webdriver.chrome.driver","C:sh\\Desktop\\eclipse\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

}
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}

public void getURL()
{
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
}


public void Getscreenshotpath(String testcaseName,WebDriver driver) throws IOException
{
TakesScreenshot ts=(TakesScreenshot) driver;
File source=ts.getScreenshotAs(OutputType.FILE);
String destinationFile=System.getProperty("user.dir")+"\\Reports\\"+testcaseName+".png";
FileUtils.copyFile(source,new File(destinationFile));
	
}





}