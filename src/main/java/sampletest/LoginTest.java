package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/aeui");
		driver.findElement(By.xpath("//*[@id='uname']")).sendKeys("Tenant_2");
		driver.findElement(By.xpath("//*[@id='pswd']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//*[@id='signin1']")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
