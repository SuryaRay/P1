package kavitymedia;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AppiumCore.Android;
import MethodImplements.LoginValidationMethods;
/**
 * Class used to validate the login functionality
 *
 * @author surya.k.kumaresan
 */
public class LoginValidationTest {
	@BeforeClass
	public static void init() throws MalformedURLException, InterruptedException {
		Android.initDriver("kavitymedia");
	}

	@Test
	public void validLoginFunction() throws Exception {
		LoginValidationMethods loginObj = new LoginValidationMethods();
		System.out.println("starting validLoginFunction Test");
		loginObj.loginApp();
	}

	@AfterClass
	public static void terminate() throws MalformedURLException {
		Android.exitDriver();	
	}
}
