package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) throws Exception {
		// Create driver, open Chrome, and maximize window
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		// Wait statement
		Thread.sleep(5000);

		// Click on Continue to Login button
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		// Wait statement
		Thread.sleep(2000);
		
		// Click on Login button
		driver.findElement(By.id("Button2")).click();
		
		// Wait statement
		Thread.sleep(2000);
		
		// Get text from alert message
		String message1 = driver.switchTo().alert().getText();
		System.out.println(message1);
		
		// Wait statement
		Thread.sleep(2000);
		
		// Click OK button
		driver.switchTo().alert().accept();
		
		// Wait statement
		Thread.sleep(2000);
		
		// Click NewUser link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		
		// Wait statement
		Thread.sleep(2000);
		
		// Get text from alert message
		String message2 = driver.switchTo().alert().getText();
		System.out.println(message2);
		
		// Wait statement
		Thread.sleep(2000);
		
		// Do any action on Confirmation Alert
		driver.switchTo().alert().dismiss();
		
		
	}

}
