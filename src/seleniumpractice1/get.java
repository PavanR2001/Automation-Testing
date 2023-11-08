package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//a[@id='logoutLink']")).click();

	}

}
