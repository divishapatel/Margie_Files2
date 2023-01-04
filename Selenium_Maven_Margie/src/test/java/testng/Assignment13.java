package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment13 {
	// Create driver
	WebDriver driver;  

	@Test
	public void blazeDemo() throws Exception {
		// Open Chrome and maximize window
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		// Open URL
		driver.get("https://blazedemo.com/");
		Thread.sleep(3000);
		
		// Choose departure city
		driver.findElement(By.xpath("//option[text() = 'Mexico City']")).click();
		Thread.sleep(2000);
		
		// Choose destination city
		driver.findElement(By.xpath("//option[text() = 'Cairo']")).click();
		Thread.sleep(2000);
		
		// Click Find Flights button
		driver.findElement(By.xpath("//input[@value = 'Find Flights']")).click();
		Thread.sleep(2000);
		
		// Click Choose this Flight (any button)
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		Thread.sleep(2000);
		
		// Fill all valid/ invalid data
		// Name
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("James Smith");
		Thread.sleep(2000);
		// Address
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("1234 Sesame St.");
		Thread.sleep(2000);
		// City
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chicago");
		Thread.sleep(2000);
		// State
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Illinois");
		Thread.sleep(2000);
		// Zip Code
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("56789");
		Thread.sleep(2000);
		// Choose card type
		driver.findElement(By.xpath("//option[@value='amex']")).click();
		Thread.sleep(2000);
		// Credit Card number
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234567890123456");
		Thread.sleep(2000);
		// Month of expiration
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("9");
		Thread.sleep(2000);
		// Year of expiration
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).clear();
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2026");
		Thread.sleep(2000);
		// Name on Card
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("James Smith");
		Thread.sleep(2000);
		
		// Click Purchase Flight
		driver.findElement(By.xpath("//input[@value = 'Purchase Flight']")).click();
		Thread.sleep(2000);
		
		// Get the message "Thank you for your purchase today"
		String purchaseMessage = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText();
		System.out.println(purchaseMessage);
		Thread.sleep(2000);
		
		// Get all the other flight details
		// Print ID number
		String id = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
		System.out.println("Id: " + id);
		Thread.sleep(1000);
		// Print status
		String status = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println("Status: " + status);
		Thread.sleep(1000);
		// Print amount
		String amount = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.println("Amount: " + amount);
		Thread.sleep(1000);
		// Print card number
		String cardNumber = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText();
		System.out.println("Card Number: " + cardNumber);
		Thread.sleep(1000);
		// Print expiration date of card
		String expiration = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println("Expiration: " + expiration);
		Thread.sleep(1000);
		// Print authorization code
		String authCode = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]")).getText();
		System.out.println("Auth Code: " + authCode);
		Thread.sleep(1000);
		// Print date
		String date = driver.findElement(By.xpath("//table/tbody/tr[7]/td[2]")).getText();
		System.out.println("Date: " + date);
		Thread.sleep(1000);
		
	}
}
