package practice.fw;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EXP_03 {
@BeforeClass
	public void login() {
		System.out.println("Login completed");
	}
@AfterClass
public void logout() {
	System.out.println("Logout completed");
}

@Test(priority=2)
public void deleteEmp() {
	System.out.println("Deleted Emplyee");
}
@Test(priority=1)
public void Newemp() {
	System.out.println("New Emp Added");
	
}
	
}

