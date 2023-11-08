package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlecustomized {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	     Thread.sleep(4000);
	     
		Actions act=new Actions(driver);
		act.moveToElement(month).click().perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		//enter on jan
		act.sendKeys(Keys.ENTER).perform();
		//go to November
		act.sendKeys(Keys.HOME).perform();
	
		
	}

}
