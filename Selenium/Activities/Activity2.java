package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Activity2 {
	
	public static void main(String args[])
	
	{
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://training-support.net/webelements/login-form/");
	
	System.out.println("Page title is " + driver.getTitle());
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
	
	
	
	driver.quit();
	
	}

}
