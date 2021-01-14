package In.Amazon.Common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class AmazonLogin {
	@Test
	public void Login() throws Exception {
		Thread.sleep(5000);
		// System.setProperty("webdriver.ie.driver",
		// "G:\\DataDrivenFramework\\IEDriverServer.exe");

		// Instantiate a IEDriver class.
		// WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver","C:\\Users\\ANKITA\\Desktop\\OOPS\\amazon\\src\\test\\resources\\Executables\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 boolean submitbuttonPresence=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
         System.out.println(submitbuttonPresence);

		js.executeScript("document.getElementById('twotabsearchtextbox').value='Shoes';");
		;

		WebElement el1 = driver.findElement(By.xpath("//input[@type='submit']"));

		js.executeScript("arguments[0].click();", el1);
		

	}
}
