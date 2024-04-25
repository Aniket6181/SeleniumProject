package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {
	
	public static void main (String[] args) {
		//ChromeOptions options =new ChromeOptions();
		//options.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Page Title :" + driver.getTitle());
		WebElement seachBox = driver.findElement(By.id("APjFqb"));
		seachBox.sendKeys("Java Tutorial");
		seachBox.sendKeys(Keys.ENTER);
		System.out.println("Page Title :" + driver.getTitle());
		
	
	}

}
