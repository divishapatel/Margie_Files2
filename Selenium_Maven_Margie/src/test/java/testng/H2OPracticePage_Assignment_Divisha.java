package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class H2OPracticePage_Assignment_Divisha {

	WebDriver driver;

	@Test
	public void getWebElements() throws Exception {
		// open chrome
		driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// open URL
		driver.get("file:///C:/Users/margi/Downloads/H2o_Practice_Page.html");
		// wait statement
		Thread.sleep(5000);

		// get all hyperlinks using tagname 'a'
		List<WebElement> allHyperlinks = driver.findElements(By.tagName("a"));
		// print out number of total hyperlinks on page
		System.out.println("Total hyperlinks on webpage: " + allHyperlinks.size());

		// get all editboxes using tagname 'input'
		List<WebElement> allEditboxes = driver.findElements(By.tagName("input"));
		// print out number of total editboxes on page
		System.out.println("Total editboxes on page: " + allEditboxes.size());

		// get all dropdown menus using tagname 'select'
		List<WebElement> allDropdown = driver.findElements(By.tagName("select"));
		// print out number of total dropdown menus on page
		System.out.println("Total dropdown menus on page: " + allDropdown.size());

	}
}
