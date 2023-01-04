package testng;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment15 {
	// Create driver
	WebDriver driver;

	@Test
	public void captchaScanner() throws Exception {
		// Open Chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open URL
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		// Click on Login button
		driver.findElement(By.xpath("//a[text() = ' LOGIN ']")).click();
		Thread.sleep(2000);
		
		// Enter captcha into console and then send it back into captcha editbox in browser
		Scanner s = new Scanner(System.in);
		String captcha = s.next();
		Thread.sleep(5000);
		driver.findElement(By.id("captcha")).sendKeys(captcha);
		
	}
}
