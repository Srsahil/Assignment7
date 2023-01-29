package Assignment7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {

		chdriver();
	
     
     
	}
	public static void chdriver() throws InterruptedException
	{
		 WebDriver driver =new ChromeDriver();
		 Task4a(driver);
	}
	public static  void Task4a(WebDriver driver ) throws InterruptedException
	{
		String login ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(login);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	String url=	driver.getCurrentUrl();
	//verify if url contains dashboard
	if(url.contains("dashboard"))
	{
		System.out.println("it contain the dashboard in its url ");
	}
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
          WebElement option =driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
          option.click();
          Thread.sleep(1000);

          driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']//following::li[4]")).click();// getting the xpath of logout option and then click on it 
    
          String verifylogin=   driver.getCurrentUrl();// after logging off getting url of the page 
       if(login.equals(verifylogin)) // verifying if it matches with the login url or not 
       {
    	   System.out.println("user is able to navigate to login page ");
       }
       else 
       {
    	   System.out.println("user is unable to navigate to login page ");
       }
       
          
	}
}
	


