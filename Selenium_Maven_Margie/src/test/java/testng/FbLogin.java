package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbLogin {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver = new ChromeDriver(); 

	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).sendKeys("abctest123@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("ajdfhafh");
	  
	  driver.findElement(By.name("login")).click();
	  
	  
	  
  }
}
