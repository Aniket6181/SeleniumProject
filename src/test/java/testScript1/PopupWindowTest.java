package testScript1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentwin = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentwin);
		
		WebElement tabBtn = driver.findElement(By.xpath("//button[text()=' Click to open new Tab ']"));
		tabBtn.click();
		System.out.println("Page Title : " + driver.getTitle());
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of windows : " + tabs.size());
		
		for (String child:tabs) {
			System.out.println("Windows :" + child);
			
			if (!child.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(child);
				System.out.println("Child window title :" + driver.getTitle());
			}
			
		}
		
		driver.close();
		driver.switchTo().window(parentwin);
		System.out.println("Parent page title : " + driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(text(), 'new Window')]")).click();
		
		
		
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of windows : " + wins.size());
		
		for (String win:wins) {
			System.out.println("Windows :" + win);
			
			if (!win.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(win);
				System.out.println("Child window title :" + driver.getTitle());
			}
			
		}
		driver.close();
		driver.switchTo().window(parentwin);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		driver.quit();

	}

}
