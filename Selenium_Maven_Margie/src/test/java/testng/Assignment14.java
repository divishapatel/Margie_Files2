package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment14 {
	// Create driver
	WebDriver driver;

	@Test
	public void changeCalendarDate() throws Exception {
		// Open Chrome and maximize window
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(2000);
		
		// Click on calendar icon
		driver.findElement(By.xpath("//input[@id='regdob']")).click();
		Thread.sleep(2000);
		
		// Choose year as 2012
		driver.findElement(By.xpath("//option[@value = '1/2012']")).click();
		Thread.sleep(2000);
		
		// Choose month as May
		driver.findElement(By.xpath("//option[text() = 'May']")).click();
		Thread.sleep(2000);
		
		// Choose any date
		driver.findElement(By.xpath("//a[text() = '23']")).click();
		Thread.sleep(2000);
		
	}
}
