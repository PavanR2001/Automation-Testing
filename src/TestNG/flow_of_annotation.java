package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class flow_of_annotation {
@BeforeSuite
public void m1()
{
	Reporter.log(null);
}
}


