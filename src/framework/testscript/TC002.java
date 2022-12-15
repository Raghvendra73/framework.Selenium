//ADD NEW EMP
package framework.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import framework.Selenium.General;

public class TC002  {
	@Test
	public void tc002() {
		
//Test Steps
		 DOMConfigurator.configure("log4j.xml");
		General obj= new General();
		obj.openapplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplcation();
	}

}
