package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello World");
		
		
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		
		
		driver.switchTo().parentFrame();
		inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome Back");
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		
		driver.switchTo().frame(1);
		Select select = new Select(driver.findElement(By.id("animals")));
		
		select.selectByValue("big baby cat");

	}

}
