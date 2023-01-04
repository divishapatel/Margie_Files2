package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) throws Exception {
		// Create driver and open chrome browser
		WebDriver driver;
		driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		
		Thread.sleep(2000);
		
		// Click on Create Account button
		driver.findElement(By.id("imgbtnSubmit")).click();
		
		Thread.sleep(2000);
		
		// Print out error message into console
		String message1 = driver.findElement(By.className("errormsg")).getText();
		System.out.println(message1);
		
		// Wait statement
		Thread.sleep(2000);
		
		// Fill valid data into name editbox and click Create Account
		driver.findElement(By.id("signup_name")).sendKeys("Divisha Patel");
		driver.findElement(By.id("imgbtnSubmit")).click();
		
		// Print out second error message into console
		String message2 = driver.findElement(By.className("errormsg")).getText();
		System.out.println(message2);
		
		// Wait statement
		Thread.sleep(2000);
		
		// Fill valid data into mobile editbox and click Create Account
		driver.findElement(By.id("signup_mobileno")).sendKeys("8635135785");
		driver.findElement(By.id("imgbtnSubmit")).click();
		
		// Print out third error message into console
		String message3 = driver.findElement(By.className("errormsg")).getText();
		System.out.println(message3);
		
		// Wait statement
		Thread.sleep(2000);
		
		// Fill valid data into email editbox and click Create Account
		driver.findElement(By.id("signup_email")).sendKeys("divisha.m523@gmail.com");
		driver.findElement(By.id("imgbtnSubmit")).click();
		
		// Print out fourth error message into console
		String message4 = driver.findElement(By.className("errormsg")).getText();
		System.out.println(message4);

		// Wait statement
		Thread.sleep(2000);
		
		// Fill valid data into password editbox and click Create Account
		driver.findElement(By.id("signup_password")).sendKeys("123456");
		driver.findElement(By.id("imgbtnSubmit")).click();
		
		// Quit browser
		driver.quit();

	}

}
