package testScript1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	
	//simple alert, confirmation alert, prompt alert

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//Handling simple alert
		driver.findElement(By.xpath("//button[@onClick='myAlertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text :" + alert.getText());
		alert.accept();
		
		//Handling confirmation alert
		driver.findElement(By.xpath("//button[@onClick='myConfirmFunction()']")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert text :" + confirm.getText());
		confirm.dismiss();
		
		//Handling prompt alert 
		driver.findElement(By.xpath("//button[@onClick='myPromptFunction()']")).click();
		Alert prompt =driver.switchTo().alert();
		System.out.println("Alert text :" + prompt.getText());
		prompt.sendKeys("Hello World");
		prompt.accept();
		System.out.println("Alert accepted");
		
		

	}

}
