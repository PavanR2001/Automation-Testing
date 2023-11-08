package seleniumpractice1;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\91630\\\\Downloads\\\\edgedriver_win32\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
		Point p=new Point(300, 400);
		driver.manage().window().setPosition(p);
	}

}
