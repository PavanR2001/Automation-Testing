package multipleelements;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\91630\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		int count=0;
		driver.get("https://www.facebook.com/");
		//take multiple elements
		List<WebElement> ele=driver.findElements(By.xpath("//div"));
				for(WebElement i:ele) {
					String one=i.getText();
					System.out.println(one);
					count++;
				}
		System.out.println(count);
		
	}

}
