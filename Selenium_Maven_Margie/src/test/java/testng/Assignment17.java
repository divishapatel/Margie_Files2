package testng;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment17 {
	// Create driver
	WebDriver driver;

	@Test
	public void switchNewTab2() throws Exception {
		// Open Chrome and maximize
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL
		driver.get("https://www.questdiagnostics.com/");
		Thread.sleep(3000);
		
		// Click on Accept All Cookies
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		
		// Click Login Button
		driver.findElement(By.xpath("(//span[@class = 'utility-label'])[2]")).click();
		Thread.sleep(2000);
		
		// Click the For Patients Login button
		driver.findElement(By.xpath("(//a[text() = 'Log in'])[1]")).click();
		Thread.sleep(2000);
		
		// Move the cursor to the window
		ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		
		// Click on Accept All Cookies
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		
		// Fill in dummy details
		driver.findElement(By.id("username")).sendKeys("abctest123");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(2000);
		
		// Click on Sign In button
		driver.findElement(By.id("signin")).click();
		
	}
}
