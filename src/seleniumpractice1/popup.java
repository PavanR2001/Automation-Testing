package seleniumpractice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class popup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://flipkart.com/");
Thread.sleep(2000);

driver.findElement(By.xpath("//span[@role=\"button\"]")).click();//Hidden_division_popups

driver.get("https://demo.guru99.com/test/delete_customer.php");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("989898");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
Thread.sleep(5000);
//move the control of the Selenium from web page to Popups
Alert alt=driver.switchTo().alert();
//get the text on Alert popup
String s=alt.getText();
System.out.println(s);
// click on OK button
alt.accept();
Thread.sleep(4000);
alt.accept();

// create object of browserHandling class 
EdgeOptions e=new EdgeOptions();
WebDriver driver2=new EdgeDriver();
driver.get("https://www.hdfc.com");


	}

}
