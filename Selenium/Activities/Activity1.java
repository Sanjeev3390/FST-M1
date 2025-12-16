package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Activity1 {
	
	public static void main(String args[])
	
	{
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://training-support.net");
	
	System.out.println(driver.getTitle());
	
	driver.findElement(By.linkText("About Us")).click();

	driver.quit();
	
	}

}
