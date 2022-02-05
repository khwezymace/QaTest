package sFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

	public static String url;
	public static WebDriver driver = null;
	public static WebElement link;
	public static JavascriptExecutor js;
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//Creating an object of ChromeDriver
	driver = new ChromeDriver();
	//driver = new EdgeDriver();
	      // Launch Website  
	 //  driver.navigate().to(sUrl);
		//	driver.manage().window().maximize();
		//	GoogleSearchSteps test = new GoogleSearchSteps();
			//test.user_is_on_google_search_box1();
			String sUrl = "https://rahulshettyacademy.com/AutomationPractice/";
			System.out.println("Browser is Opened ");
			driver.navigate().to(sUrl);


         /**
		  * Butto Test 1
		  */
			link  = driver.findElement(By.xpath("//input[@name='radioButton'])[3]"));
			//Asserts.assertEquals(EXPECTEDTITLE2, ActualTitle);
			link.click();
			System.out.println("Check Button 3 is Enabled :"+link.isEnabled());
			//link.isEnabled();

			link  = driver.findElement(By.xpath("//input[@name='radioButton'])[2]"));
			
			link.click();
			link  = driver.findElement(By.xpath("//input[@name='radioButton'])[3]"));
			System.out.println("Check Button 3 is DisEnabled :"+link.isEnabled());
			link  = driver.findElement(By.xpath("//input[@name='radioButton'])"));
			System.out.println("Check Button 1 is DisEnabled :"+link.isEnabled());
			
 
			link  = driver.findElement(By.xpath("//input[@id='autocomplete']"));
			link.sendKeys("South");
			link  = driver.findElement(By.xpath("//div[contains(.,'South Africa')]"));
			link.click();
			link  = driver.findElement(By.xpath("//input[@id='autocomplete']"));
			link.sendKeys("Republic");
			link  = driver.findElement(By.tagName("Republic"));
			link.click();
		
           // Click Check Box 
			link  = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
			link.click();
			link  = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
			link.click();
			link  = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
			link.click();
               
			link  = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
			link.click();
			System.out.println("Check Button 1 is DisEnabled :"+link.isEnabled());
			
			//System.out.println("Check Button 1 is DisEnabled :"+link.isEnabled());
			 //-	Show / hide 
             /**
			  * -	Show / hide
o	        Click on the hide button and validate that the element is hidden 
o	       Click on the show button and validate that the hidden element is shown

			  */
			  link  = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
			  link.click();

			  //input[@id='hide-textbox']
			  link  = driver.findElement(By.xpath("//input[@id='displayed-text']"));
			  System.out.println("Check Button 1 is DisEnabled :"+link.isDisplayed());
			
			 // link.click();
			  //input[@id='displayed-text']
			  link  = driver.findElement(By.xpath("//input[@id='show-textbox']"));
			  link.click();

			  link  = driver.findElement(By.xpath("//input[@id='displayed-text']"));
			  System.out.println("Check Field  is DisEnabled :"+link.isDisplayed());
			  
		/**
		 * -	Web Table Fixed header
o	Validate that the Amount for  ‘Joe Postman’ from ‘Chennai’ has an amount of 46
o	Validate that the total amount collected is 296

		 */

		link  = driver.findElement(By.xpath("//td[contains(.,'46')]"));
		System.out.println("Check Element value is 46 and Element =  :"+link.getAttribute("value"));
		
		link  = driver.findElement(By.cssSelector(".totalAmount"));
		System.out.println("Check Element value Total is 296 and Element =  :"+link.getAttribute("value"));
		



}


}