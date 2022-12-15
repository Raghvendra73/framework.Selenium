package framework.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
		}
	
	public void closeApplcation() {
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application closed");
		Log.info("Application Closed");
	}

	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
	}


	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}

    
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter into frame");
		Reporter.log("Enter into frame");
		Log.info("Entered into frame");
	
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Reporter.log("Exit from frame");
		Log.info("Exit from frame");
	}

	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("adding new emp");
		Reporter.log("New Emp Added");
		Log.info("New Emp Added");
	}

}
