package testScript;

import java.util.Map;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bash.Common.CommonClass;
import com.bash.Common.RegisterWithApplePage;
import com.bash.Common.RegisterWithFaceBookPage;
import com.bash.Common.RegisterWithGooglePage;
import com.bash.LoingPage.LoginPage;
import com.bash.Register.RegisterPage;
import com.tfg.bash.genericyCodes.DataUtile;
import com.tfg.bash.genericyCodes.WebUtil;

import bash.baseClass.BaseTest;

public class BashTS extends BaseTest {

	private WebUtil gm = WebUtil.getObject();
	private CommonClass comm;
	DataUtile database = new DataUtile();

	@Test
	public void verifyBash001NewUserRegister() throws InterruptedException {
		gm.getExtTest().log(Status.INFO, "verifyBash001NewUserRegister TestScript started Successfully.");
		comm = new CommonClass(gm);
		comm.userSignInBT();
		LoginPage loginpage = new LoginPage(gm);
		loginpage.newRegisterBT();
		RegisterPage registerPage = new RegisterPage(gm);
		Map<String, String> testCaseDataMap = database.getTestCaseData("Bash001", 2);
		registerPage.fillInformationRegisterDatiles(testCaseDataMap);
		Thread.sleep(5000);
		//comm.VarifySigninUserName(testCaseDataMap);
		Thread.sleep(10000);

	}

	@Test
	public void verifyBash002RegisterWithGoogle() {
		gm.getExtTest().log(Status.INFO, "verifyBash002RegisterWithGoogle TestScript started Successfully.");
		comm= new CommonClass(gm);
		comm.userSignInBT();
		Map<String, String> testCaseDataMap = database.getTestCaseData("Bash002", 2);
		LoginPage loginPage=new LoginPage(gm);
		loginPage.newRegisterBT();	
		RegisterPage registerPage=new RegisterPage(gm);
		registerPage.googleWithRegisterBT();
		RegisterWithGooglePage googlesignpage=new RegisterWithGooglePage(gm);
		googlesignpage.googleSignHearderText(testCaseDataMap);
	}
	
	@Test
	public void verifyBash003RegisterWithfaceBook() {
		gm.getExtTest().log(Status.INFO, "verifyBash003RegisterWithfaceBook TestScript started Successfully.");
		comm= new CommonClass(gm);
		comm.userSignInBT();
		Map<String, String> testCaseDataMap = database.getTestCaseData("Bash003", 2);
		LoginPage loginPage=new LoginPage(gm);
		loginPage.newRegisterBT();
		RegisterPage registerPage=new RegisterPage(gm);
		registerPage.faceBookWithRegisterBT();	
		
		RegisterWithFaceBookPage facebookRP=new RegisterWithFaceBookPage(gm);
		facebookRP.faceBookSignHearderText(testCaseDataMap);
	}
	
	@Test()
	public void verifyBash004RegisterWithApple() {
		gm.getExtTest().log(Status.INFO, "verifyBash004RegisterWithApple TestScript started Successfully.");
		comm= new CommonClass(gm);
		comm.userSignInBT();
		Map<String, String> testCaseDataMap = database.getTestCaseData("Bash004", 2);
		LoginPage loginPage=new LoginPage(gm);
		loginPage.newRegisterBT();
		RegisterPage registerPage=new RegisterPage(gm);
		registerPage.appleWithRegisterBT();
		
		RegisterWithApplePage appleRP=new RegisterWithApplePage(gm);
		appleRP.appleSignHearderText(testCaseDataMap);
	}
	
	
	@Test
	public void verifyBash006ValidDeatilsUserLogin() throws InterruptedException {
		gm.getExtTest().log(Status.INFO, "verifyBash006ValidDeatilsUserLogin TestScript started Successfully.");
		comm = new CommonClass(gm);
		comm.userSignInBT();
		LoginPage loginpage = new LoginPage(gm);
		Map<String, String> testCaseDataMap = database.getTestCaseData("Bash006", 2);
		loginpage.validLoginDeatils(testCaseDataMap);
		comm.VarifySigninUserName(testCaseDataMap);
		Thread.sleep(10000);

	}
	
	@Test
	public void verifyBash007OptionBaseSearchProduct() {
		gm.getExtTest().log(Status.INFO, "verifyBash007OptionBaseSearchProduct TestScript started Successfully.");
		comm = new CommonClass(gm);
		comm.menTypeProductsShow("Boots");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
