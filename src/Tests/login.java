package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	
	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/index.php");
	    driver.findElement(By.name("uid")).sendKeys("mngr33246");
	    driver.findElement(By.name("password")).sendKeys("tarAnEp");
	    driver.findElement(By.name("btnLogin")).click();
	
	
	
	
}
	
}
