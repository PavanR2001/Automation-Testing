package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
//switch to frame
driver.switchTo().frame("iframeResult");
//enter first name
driver.findElement(By.xpath("//input[@id='code']")).sendKeys("Meghana");
//enter last name
driver.findElement(By.xpath("//input[@value='submit']")).click();
//click on submit button
driver.findElement(By.xpath("//input[@value='submit']")).click();

	}

}
