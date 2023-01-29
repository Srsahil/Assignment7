package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		chdriver();
	
     
     
	}
	public static void chdriver() throws InterruptedException
	{
		 WebDriver driver =new ChromeDriver();
		 Task3a(driver);
	}
	public static void Task3a(WebDriver driver ) throws InterruptedException
	{
		String login ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(login);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// verifying if get error for the enter credentials and captured error message 
		Thread.sleep(3000);// applying sleep so that it can wait for error to be visible 
	String  errormsg=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	// verifying errormsg contain invalid credential or not 
	if(errormsg.contains("Invalid credentials"))
	{
		System.out.println("it contains Invalid credentials ");
	}
	else 
	{
		System.out.println("it do not contains Invalid credentials ");
	}
	

	}

}
