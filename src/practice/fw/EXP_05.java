package practice.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EXP_05 {
	WebDriver driver;
	@BeforeClass
	public void Startup(){
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void TearDown() {
		driver.close();
	}
	
	@Test
	public void TC001() throws Exception{
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Reporter.log("Logout Completed");
				}
	
		

}
