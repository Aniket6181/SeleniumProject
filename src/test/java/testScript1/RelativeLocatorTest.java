package testScript1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport org.openqa.selenium.By;
		
                WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://automationbookstore.dev/");
				String strid = driver.findElement(with(By.tagName("li"))
						.toLeftOf(By.id("pid6"))
						.below(By.id("pid1")))
						.getAttribute("id");
				System.out.println(strid);

	}

}
