package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucedemologinPF

{
	public  WebDriver driver;
	
	public saucedemologinPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	    
	    @FindBy(xpath="//input[@placeholder='Username']")
	    WebElement username;
	    @FindBy(xpath="//input[@placeholder='Password']")
	    WebElement password; 
	    @FindBy(xpath="//input[@data-test='login-button']")
	    WebElement submit; 
	    public  WebElement username()
	    {
	    	return  username;
	    	
	    }

	    public  WebElement password()
	    {
	    	return  password;
	    	
	    }
	   
	    public  WebElement submit()
	    {
	    	return  submit;
	    	
	    }
	   
	

}

