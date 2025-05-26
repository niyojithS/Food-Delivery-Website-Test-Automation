package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExtentManager;

public class BaseClass {

	protected static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void setupSuite() {
		startReport();
		setupDriver();
	}

	public void setupDriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	}

	public void startReport() {
		extent = ExtentManager.getExtentReports();
	}

	@AfterSuite
	public void tearDownSuite() {
		endReport();
		if (driver != null) {
			driver.quit();
		}
	}

	public void endReport() {
		extent.flush();
	}
}
