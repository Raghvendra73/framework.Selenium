package practice.fw;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;

public class EXP_04 {
public String Baseurl="http://183.82.103.245/nareshit/login.php";
String driverPath="D:\\Driver\\chromedriver.exe";
public WebDriver driver;
@BeforeTest
public void launchBrowser() {
    System.out.println("launching chrome browser"); 
    System.setProperty("webdriver.chrome.driver", driverPath);
    driver = new ChromeDriver();
    driver.get(Baseurl);
}
@Test
public void verifyHomepageTitle() {
    String expectedTitle = "OrangeHRM - New Level of HR Management";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
}
@AfterTest
public void terminateBrowser(){
    driver.close();
}
}
