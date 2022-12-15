//LOGIN-LOGOUT
package framework.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import framework.Selenium.General;

public class TC001 extends General {
	@Test
	public void tc001() {	
	//Test steps 
		 DOMConfigurator.configure("log4j.xml");
		General obj =new General();
		obj.openapplication();
		obj.login();
		obj.logout();
		obj.closeApplcation();
	}
}
