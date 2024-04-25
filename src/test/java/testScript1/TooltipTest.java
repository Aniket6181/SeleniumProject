package testScript1;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("age"))).perform();
		
		String strText = driver.findElement(By.className("ui-tooltip-content")).getText();
        System.out.println("Tooltip text is : " + strText);
        
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("20");
	}

}
