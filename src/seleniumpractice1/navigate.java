package seleniumpractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.navigate().to("https://www.google.co.in/");
Thread.sleep(5000);
driver.navigate().to("https://www.amazon.in/");
driver.navigate().back();
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.quit();
	}

}
