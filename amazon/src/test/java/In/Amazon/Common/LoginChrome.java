package In.Amazon.Common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LoginChrome {
	
	@Test
	public void Login() throws Exception{
		Thread.sleep(5000);
	//	System.setProperty("webdriver.ie.driver", "G:\\DataDrivenFramework\\IEDriverServer.exe");

		// Instantiate a IEDriver class.
		//WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITA\\Desktop\\OOPS\\amazon\\src\\test\\resources\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//	Thread.sleep(10000);
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		//Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 boolean submitbuttonPresence=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
         System.out.println(submitbuttonPresence);
		//driver.findElement(By.id("a-autoid-0-announce")).click();
		 js.executeScript("document.getElementById('twotabsearchtextbox').value='Shoes';");
		//List<WebElement> el=driver.findElements(By.id("twotabsearchtextbox"));
		//System.out.println(el.size());
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement el1 =driver.findElement(By.xpath("//input[@type='submit']"));
		 //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", el1);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.quit();
		
	}

}
