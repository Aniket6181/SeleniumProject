package testScript1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExtrTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lamdatest.io/");
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String strTitle = (String)js.executeScript("return document.title");
		System.out.println(strTitle);
		WebElement searchBox = (WebElement)js.executeScript("return document.getElementByName('search')[0]");
        searchBox.sendKeys("Phone");
        driver.findElement(By.cssSelector("button.type-text")).click();
        js.executeScript("history.g0[-1]");
        js.executeScript("window.scrollBy(10, 700)");
        js.executeScript("window.scrollBy(10, document.body.scrollHeight");
	}

}
