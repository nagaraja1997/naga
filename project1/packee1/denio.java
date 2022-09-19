package packee1;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class denio {
	@Test
	public void test1()
	{
		ExtentReports report=new ExtentReports("./report/ewe.html");
		ExtentTest A=report.startTest("test1");
		A.log(LogStatus.PASS,"test case pass");
		A.log(LogStatus.PASS,"test case pass");
		report.flush();
	}

}
