package testng;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment16 {
	// Create driver
	WebDriver driver;

	@Test
	public void switchNewTab() throws Exception {
		// Open Chrome and maximize
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		// Click New Tab button
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		// Get all open window names
		ArrayList<String> allTabNames = new ArrayList<String>(driver.getWindowHandles());
		
		// Switch cursor to new tab
		driver.switchTo().window(allTabNames.get(1));
		
		// Get the content from the page and print into console
		String message = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(message);
		Thread.sleep(5000);
		
		// Close the new tab (current page)
		driver.close();
		
	}
}
