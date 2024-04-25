package testScript1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class AutoCompleteTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/autocomplete/");
		
	WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frame1);
	WebElement inp = driver.findElement(By.cssSelector("#tags"));
	inp.sendKeys("AS");
	
	List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1 > i"));
	System.out.println("Number of matching items : " + items.size());
	
	
	for(WebElement item : items) {
		System.out.println(item.getText());
		
		
		if(item.getText().equalsIgnoreCase("BASIC")) {
			
			item.click();
			break;
		}
	}
		

	}

}
