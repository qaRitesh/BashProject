package bash.baseClass;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tfg.bash.genericyCodes.WebUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {

	private ExtentReports extentR;
	private WebUtil gm=WebUtil.getObject();
	private ExtentTest extenttest;

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		 extentR=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("src\\test\\resources\\Reporter\\BashWebSiteTestScriptsReporter.html");
		extentR.attachReporter(sparkReporter);
	}

//	@BeforeClass(alwaysRun = true)
//	public void beforeClass() {
//		gm.lunchbrower("ChromeBrowser");
//		gm.impliCityTimewait(60);
//		gm.openUrl("https://www.bash.com");
//		System.out.println("Beforeclass TestScript Start.");
//	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(Method mt) {
		gm.lunchbrower("ChromeBrowser");
		gm.impliCityTimewait(60);
		gm.openUrl("https://www.bash.com");
		
		 extenttest=extentR.createTest(mt.getName());
		gm.setExtTest(extenttest);
		gm.getExtTest().log(Status.INFO, "Braowser successfully:");
		gm.getExtTest().log(Status.INFO, "URL hit successfully:");
		
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(Method mt,ITestResult itr) {
		if(itr.getStatus()==itr.FAILURE) {
		String	screenshortpath=gm.takeScreenShort(mt.getName(), "dd-mm-yyyy hh_mm_ss a");
		gm.getExtTest().addScreenCaptureFromPath(screenshortpath);
		gm.getExtTest().log(Status.FAIL, "This Optication TestScript fail.");
		}
		
		extenttest.log(Status.INFO, mt.getName()+" Method TestScript Close Successfully.");
		extentR.flush();
		gm.driverQuit();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		gm.driverQuit();
		//extenttest.log(Status.INFO,"Class TestScript Close.");
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
	//	extenttest.log(Status.INFO," After TestScript Suite");
		extentR.flush();
	}

}
