package sampletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("browsered opening");
		driver.get("http://localhost:8080/aeui");
		System.out.println("browsered opened");
		System.out.println("username typing");
		driver.findElement(By.xpath("//*[@id='uname']")).sendKeys("Tenant_2");
		System.out.println("username typed");
		System.out.println("password typing");
		driver.findElement(By.xpath("//*[@id='pswd']")).sendKeys("Admin@123");
		System.out.println("password typed");
		System.out.println("clicking on login");
		driver.findElement(By.xpath("//*[@id='signin1']")).click();
		System.out.println("clicked on login");
		Thread.sleep(5000);
		
		driver.quit();
	}

}
