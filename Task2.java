package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		chdriver();
	
     
     
	}
	public static void chdriver() throws InterruptedException
	{
		 WebDriver driver =new ChromeDriver();
		 Task2a(driver);
	}
	public static void Task2a(WebDriver driver) throws InterruptedException
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// open url in browser 
	     Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin"); // filling info in the username field
		driver.findElement(By.xpath("//button[@type='submit']")).click();// click on login button
		 String password= driver.findElement(By.xpath("//input[@name='password']//following::span[text()='Required'][1]")).getText(); // getting message after clicking on login button
		    if (password.equals("Required"))// verifying message is there or not 
		    {
		    	System.out.println("Required message  is present for password ");
		    }
		    else
		    {
		    	System.out.println("Required message is not there for password ");

	}
		    Thread.sleep(1000);
		   

}}
