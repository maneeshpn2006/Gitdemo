package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartfeaturePF {
	
	public  WebDriver driver;
	
	public cartfeaturePF(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	

	
	
	@FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-backpack']")
	WebElement backpackaddtocart;
	
	 @FindBy(xpath="//span[text()='1']")
	  WebElement cartcount1;
	 
	 public WebElement  backpackaddtocart()
	    {
	    	return  backpackaddtocart;
	    	
	    }
	
	 public  WebElement carticon()
	    {
	    	return  cartcount1;
	    	
	    }
	
	
}
