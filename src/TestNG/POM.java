package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class POM {
@Test
public void tc1() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	
}
}
