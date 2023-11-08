package seleniumpractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement itely=driver.findElement(By.id("box106"));
		Actions act=new Actions(driver);
		act.dragAndDrop(rome, itely).perform();
		Thread.sleep(3000);
		
		WebElement Oslo=driver.findElement(By.id("box1"));
		WebElement Norway=driver.findElement(By.id("box101"));
		act.dragAndDrop(Oslo, Norway).perform();
		
		
	}

}
