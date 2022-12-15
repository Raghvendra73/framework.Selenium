package practice.fw;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Irctc_Login {

	WebDriver driver;

	
	
	@BeforeClass
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		Reporter.log("Login Completed");
	}

	
	
	@AfterClass
	public void Logout() {
		driver.quit();
		Reporter.log("Logout Completed");
	}

	
	@Test(priority=1)
	public void TC01() throws Exception {
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("Solapur");
		//driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		
/*      driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).sendKeys("15/12/2022");
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);       
*/
		
	
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[4]/div/span[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")).click();
		Thread.sleep(2000);
		Reporter.log("Trains Searched");

		
		
/*      Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
		Thread.sleep(3000);        
*/
	}

	
/*	      @Test(priority=2)
	      public void TC02() throws Exception{
		  driver.findElement(By.xpath("//div[@class='pre-avl selected-class']//div[@class='WL col-xs-12']")).click();
		  Reporter.log("Search Activity Completed");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='pre-avl selected-class']//div//strong[contains(text(),'Wed, 14 Dec')]")).click();
		  Reporter.log("Checked & clicked");
		  Thread.sleep(4000);
*/

	
 /* 	 @Test(priority=3)
	     public void loginApplication() throws Exception {
		 driver.findElement(By.linkText("LOGIN")).click();
		 Reporter.log("Click Activity Completed");
		 driver.findElement(By.xpath("//input[@id='7982160']")).sendKeys("Raghvendra");
		 Reporter.log("Userid Entered");
		 Thread.sleep(3000);
*/		 		 
	
}








