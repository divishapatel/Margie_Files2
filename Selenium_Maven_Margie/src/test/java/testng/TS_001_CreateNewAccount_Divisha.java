package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_001_CreateNewAccount_Divisha {
	WebDriver driver;
	
	@Test
	public void TC_001() {
		// Open Chrome, maximize the window, and open the URL
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");  
  }
	@Test
	public void TC_002() throws Exception {
		// Click on Create an Account link
		driver.findElement(By.id("signup-link9")).click();
		Thread.sleep(3000);
		// Verify the URL has changed or not?
		String expectedURL = "https://www.justrechargeit.com/SignUp.aspx";
		String actualURL = driver.getCurrentUrl();
		// Validate the expected and actual URLs are the same
		if (actualURL.equals(expectedURL)) {
			System.out.println("Create an account URL is matching as per the testcase.");
		} else {
			System.out.println("Create an account URL is NOT matching as per the testcase.");
		}	
	}
	
	@Test
	public void TC_003() throws Exception {
		// Click on login button without filling in any details
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		// Get and store the actual and expected error message
		String nameErrorMessage = driver.findElement(By.className("errormsg")).getText();
		String nameErrorMessageExpected = "Enter your name";
		// Validate the expected and actual error messages are the same
		if (nameErrorMessage.equals(nameErrorMessageExpected) ) {
			System.out.println("Application has displayed the validation message 'Enter your name'");
		} else {
			System.out.println("Application has NOT displayed the validation message 'Enter your name'");
		}
	}
	
	@Test
	public void TC_004() throws Exception {
		// Fill in the name box with valid data
		driver.findElement(By.id("signup_name")).sendKeys("Divisha Patel");
		Thread.sleep(3000);
		// Click on login button
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		// Get and store the actual and expected error message
		String mobileErrorMessage = driver.findElement(By.className("errormsg")).getText();
		String mobileErrorMessageExpected = "Enter mobile no.";
		// Validate the expected and actual error messages are the same
		if (mobileErrorMessage.equals(mobileErrorMessageExpected)) {
			System.out.println("Application has displayed the validation message 'Enter mobile no.'");
		} else {
			System.out.println("Application has NOT displayed the validation message 'Enter mobile no.'");
		}
	}
	
	@Test
	public void TC_005() throws Exception {
		// Fill in the mobile number box with valid data
		driver.findElement(By.id("signup_mobileno")).sendKeys("8635135785");
		Thread.sleep(3000);
		// Click login button
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		// Get and store the actual and expected error message
		String emailErrorMessage = driver.findElement(By.className("errormsg")).getText();
		String emailErrorMessageExpected = "Enter your email id";
		// Validate the expected and actual error messages are the same
		if (emailErrorMessage.equals(emailErrorMessageExpected)) {
			System.out.println("Application has displayed the validation message 'Enter your email id'");
		} else {
			System.out.println("Application has NOT displayed the validation message 'Enter your email id'");
		}
	}
	
	@Test
	public void TC_006() throws Exception {
		// Fill in the email box with valid data
		driver.findElement(By.id("signup_email")).sendKeys("divisha.m523@gmail.com");
		Thread.sleep(3000);
		// Click login button
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		// Get and store the actual and expected error message
		String passErrorMessage = driver.findElement(By.className("errormsg")).getText();
		String passErrorMessageExpected = "Enter your password";
		// Validate the expected and actual error messages are the same
		if (passErrorMessage.equals(passErrorMessageExpected)) {
			System.out.println("Application has displayed the validation message 'Enter your password'");
		} else {
			System.out.println("Application has NOT displayed the validation message 'Enter your password'");
		}
	}
	
	@Test
	public void TC_007() throws Exception {
		// Fill in the password box with valid data
		driver.findElement(By.id("signup_password")).sendKeys("123456");
		Thread.sleep(3000);
		// Click login button
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		// Get and store the actual and expected error message
		String termsErrorMessage = driver.findElement(By.className("errormsg")).getText();
		String termsErrorMessageExpected = "Please agree to the terms & conditions";
		// Validate the expected and actual error messages are the same
		if (termsErrorMessage.equals(termsErrorMessageExpected)) {
			System.out.println("Application has displayed the validation message 'Please agree to the terms & conditions'");
		} else {
			System.out.println("Application has NOT displayed the validation message 'Please agree to the terms & conditions'");
		}
	}
	
	@Test
	public void TC_008() throws Exception {
		// Click on the refresh button
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Test
	public void TC_009() throws Exception {
		driver.findElement(By.id("signup_name")).sendKeys("Divisha Patel");
		Thread.sleep(3000);
		driver.findElement(By.id("signup_mobileno")).sendKeys("8635135785");
		Thread.sleep(3000);
		driver.findElement(By.id("signup_email")).sendKeys("divisha.m523@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("signup_password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("imgbtnSubmit")).click();

	}
	
	
	
	
}
