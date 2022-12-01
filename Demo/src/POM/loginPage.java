package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage
{

	//Declaration
	
	 WebDriver driver;
	
		@FindBy( xpath = "//input[@id='ap_email']")
		private WebElement EmailorPhoneNumber;
		
		@FindBy(xpath = "//input[@id='continue']")
		private WebElement continuebtn;
		
		@FindBy(xpath = "//input[@id='ap_password']")
		private WebElement password;
		
		@FindBy(xpath = "//input[@id='signInSubmit']")
		private WebElement signinbtn;
		
		
		//Initialization
		
		public loginPage(WebDriver driver) 
		{
			 this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Utilization

			public void enterEmailorPhone()
			{
				EmailorPhoneNumber.sendKeys("8904770890");
			}
			
			
			public void clickContinue()
			{
				continuebtn.click();
			}
			
			
			public void enterPassword()
			{
				password.sendKeys("Mindful@100");
			}
			
			
			public void clickSignin()
			{
				signinbtn.click();
			}
			
		
}

