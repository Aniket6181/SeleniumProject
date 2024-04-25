package testScript1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("http://uitestingplayground.com/");
		driver.findElement(By.linkText("Load Delay")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

	}

}
