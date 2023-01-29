package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.internal.StringUtils;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		chdriver();
	
     
     
	}
	public static void chdriver() throws InterruptedException
	{
		 WebDriver driver =new ChromeDriver();
		 Task1a(driver);
	}
	
	public static void Task1a(WebDriver driver) throws InterruptedException
	{
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// open url in browser 
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type='submit']")).click();// click on submit button 
     Thread.sleep(2000);
     // verify required fields for both username and password 
    String Username= driver.findElement(By.xpath("//input[@name='username']//following::span[text()='Required'][1]")).getText();
    if (Username.equals("Required"))
    {
    	System.out.println("Required message  is present for username ");
    }
    else
    {
    	System.out.println("Required message is not there ");
    }
    
    String password= driver.findElement(By.xpath("//input[@name='password']//following::span[text()='Required'][1]")).getText();
    if (password.equals("Required"))
    {
    	System.out.println("Required message  is present for password ");
    }
    else
    {
    	System.out.println("Required message is not there for password ");
    }
    
    //verify css property for username and password 

    String usernameprop=driver.findElement(By.xpath("//input[@name='username']")).getCssValue("border-width");
    String password1=driver.findElement(By.xpath("//input[@name='password']")).getCssValue("border-width");
  
   String required="1px";
   if(usernameprop.equals(required)&&password1.equals(required))//checking border is of 1 px
   {
	   System.out.println("border is 1px ");
   }
   else
   {
	   System.out.println("border is not of 1 px");
   }
 
    
	}
	
	
	}


