package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) throws Exception {
		// Create driver, open Chrome, and maximize browser
		WebDriver driver;
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		// Open URL 
		driver.get("file:///C:/Users/margi/Downloads/QE%20-%20index.html");
		
		// Wait statement
		Thread.sleep(5000);

		// Test 1
		// Assert that both email and password boxes are present, as well as the login button
		if (driver.findElement(By.id("inputEmail")).isEnabled()) {
			System.out.println("Email box is present.");
		}else {
			System.out.println("Email box is not present.");
		}
		
		if (driver.findElement(By.id("inputPassword")).isEnabled()) {
			System.out.println("Password box is present.");
		}else {
			System.out.println("Password is not present.");
		}
		
		if (driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).isEnabled()) {
			System.out.println("Sign In button is present.");
		}else {
			System.out.println("Sign In button is not present.");
		}
		
		// Wait statement
		Thread.sleep(2000);
		
		// Enter an email and password into the respective fields
		if (driver.findElement(By.id("inputEmail")).isEnabled()) {
			driver.findElement(By.id("inputEmail")).sendKeys("abctest123@gmail.com");
		}else {
			System.out.println("Email box is not present.");
		}
		
		if (driver.findElement(By.id("inputPassword")).isEnabled()) {
			driver.findElement(By.id("inputPassword")).sendKeys("sdgajkagkja");
		}else {
			System.out.println("Password is not present.");
		}
		
		// Wait statement
		Thread.sleep(2000);
		
		// Test 4
		// Refresh the page
		driver.navigate().refresh();
		
		// Wait statement
		Thread.sleep(2000);
		
		// Assert that the first button is enabled
		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled()) {
			System.out.println("The first button is enabled.");
		}else {
			System.out.println("The first button is disabled.");
		}
		
		// Wait statement
		Thread.sleep(2000);
		
		// Assert that the second button is disabled
		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isEnabled()) {
			System.out.println("The second button is enabled.");
		}else {
			System.out.println("The second button is disabled.");
		}
		
		// Wait statement
		Thread.sleep(2000);
		
		// Test 5
		// Refresh the page
		driver.navigate().refresh();
		
		// Wait statement
		Thread.sleep(5000);
		
		// Wait for the button to be displayed and then click it
		if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).click();
		}else {
			Thread.sleep(5000);
			if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isDisplayed()) {
				driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).click();
			}
		}
		
		// Wait statement
		Thread.sleep(3000);
		
		// Assert that a success message is displayed
		if (driver.findElement(By.id("test5-alert")).isDisplayed()) {
			System.out.println("Success message is displayed.");
		}else {
			System.out.println("Success message is not displayed.");
		}
		
		// Wait statement
		Thread.sleep(2000);
		
		// Assert that button is now disabled
		if (driver.findElement(By.id("test5-button")).isEnabled()) {
			System.out.println("Button is now enabled.");
		}else {
			System.out.println("Button is now disabled.");
		}
		
		
	}

}
