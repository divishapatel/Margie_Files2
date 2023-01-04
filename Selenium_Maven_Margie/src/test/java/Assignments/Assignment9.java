package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws Exception {
		// Create driver object and open chrome browser
		WebDriver driver;
		driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://www.justrechargeit.com/");
		
		// Wait statement
		Thread.sleep(5000);
		
		// Click Sign In link
		driver.findElement(By.linkText("Sign in")).click();
		
		// Wait statement
		Thread.sleep(3000);
		
		// Fill in dummy values
		driver.findElement(By.id("txtUserName")).sendKeys("abctest123@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("ahfahfas");
		driver.findElement(By.id("txtCaptcha")).sendKeys("10");
		
		// Get the page URL and title
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// Click refresh and then back buttons
		driver.navigate().refresh();
		driver.navigate().back();
		
		// Get new URL and title
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// Click foward button
		driver.navigate().forward();
		
		// Quit the browser
		driver.quit();
		
	}

}
