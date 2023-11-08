package seleniumpractice1;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setsize {

	public static void main(String[] args, org.openqa.selenium.Dimension d) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\91630\\\\Downloads\\\\edgedriver_win32\\\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.co.in/");
Dimension d=new Dimension(50, 40);
driver.manage().window().setSize(d);
	}

}
