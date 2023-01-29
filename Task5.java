package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {

		Eddriver();
		chdriver();
		Firedriver();
	
     
     
	}
	public static void Firedriver() throws InterruptedException
	{
		 WebDriver driver =new FirefoxDriver();
		 System.out.println("firefox Execution starts.........");
		
				 new Task1().Task1a(driver);
				 System.out.println("..................................Task1 Executed..................................");
				 new Task2().Task2a(driver);
				 System.out.println("..................................Task2 Executed..................................");
				 new Task3().Task3a(driver);
				 System.out.println("..................................Task3 Executed..................................");
				 new Task4().Task4a(driver);
				 System.out.println("..................................Task4 Executed..................................");
				 System.out.println("firefox Execution ended.........");	 
				 driver.quit();
	}
	public static void chdriver() throws InterruptedException
	{
		 WebDriver driver =new ChromeDriver();
		 System.out.println("Chrome Execution starts.........");
		
				 new Task1().Task1a(driver);
				 System.out.println("..................................Task1 Executed..................................");
				 new Task2().Task2a(driver);
				 System.out.println("..................................Task2 Executed..................................");
				 new Task3().Task3a(driver);
				 System.out.println("..................................Task3 Executed..................................");
				 new Task4().Task4a(driver);
				 System.out.println("..................................Task4 Executed..................................");
				 System.out.println("Chrome Execution ended.........");	 
				 driver.quit();
	}
	public static void Eddriver() throws InterruptedException
	{
		 WebDriver driver =new EdgeDriver();
		 System.out.println("Edge Execution starts.........");
		
				 new Task1().Task1a(driver);
				 System.out.println("..................................Task1 Executed..................................");
				
				 new Task2().Task2a(driver);
				 System.out.println("..................................Task2 Executed..................................");
				 new Task3().Task3a(driver);
				 System.out.println("..................................Task3 Executed..................................");
				 new Task4().Task4a(driver);
				 System.out.println("..................................Task4 Executed..................................");
				 System.out.println("Edge Execution ended.........");
	driver.quit();
	}
	
}


