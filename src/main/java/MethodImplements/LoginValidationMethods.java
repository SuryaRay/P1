package MethodImplements;

import org.testng.asserts.SoftAssert;

import AppiumCore.Android;
import AppiumCore.PropertyManager;

public class LoginValidationMethods {
	
	private static SoftAssert stAsrt =new SoftAssert();
	private static Android anrdObj = null;
	
	public LoginValidationMethods() {
		anrdObj = new Android();
	}
	
	/**
	 * Method is used to validate the operators list 
	 *   
	 * @author surya.k.kumaresan
	 */
	public void loginApp() throws Exception {
		anrdObj.findElemById("com.cloudcar.saic:id/etLoginPasscode").isDisplayed();
		anrdObj.findElemById("com.cloudcar.saic:id/etLoginPasscode").sendKeys(PropertyManager.getPropertyValue("password"));
		anrdObj.findElemById("com.cloudcar.saic:id/bLogin").click();
		stAsrt.assertTrue(anrdObj.findElemByXpath("new UiSelector().text(\"logout\")").isDisplayed(), "");
		stAsrt.assertAll();
	}

}
