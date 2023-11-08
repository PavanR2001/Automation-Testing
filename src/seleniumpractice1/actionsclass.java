package seleniumpractice1;

import java.lang.annotation.Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.co.in/");
WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions act=new Actions(driver);
act.moveToElement(gmail).click().perform();
//act.contextClick(gmail).click().perform();

}

}
