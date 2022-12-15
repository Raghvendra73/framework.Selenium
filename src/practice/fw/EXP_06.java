package practice.fw;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class EXP_06 {
	WebDriver driver;
	@BeforeClass
	public void Startup() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void TearDown() {
		driver.close();
		Reporter.log("Closed");
	}
	
	@Test
	public void TC002()throws Exception{
		//Excel
		FileInputStream file=new FileInputStream("D:\\Selenium\\loginexcel.xls");
		Workbook wb= Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		
		String un=st.getCell(0,1).getContents();
		String pw=st.getCell(1,1).getContents();
		Reporter.log(un);
		Reporter.log(pw);
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);;
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
		

	}

	
}
