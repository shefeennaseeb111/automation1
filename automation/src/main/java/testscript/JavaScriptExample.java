package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {
	public WebDriver driver;
	public void javascriptex()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor javascript=(JavascriptExecutor) driver;  //to initialize the driver in to the executor
		javascript.executeScript("window.scrollBy(0,1000)", ""); //scroll down
		javascript.executeScript("window.scrollBy(0,-1000)", "");//to scroll up
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.click();
		javascript.executeScript("argument[0].click();", search);
		search.click();
		
	}

	public static void main(String[] args) {
		JavaScriptExample amazon=new JavaScriptExample();	
		amazon.javascriptex();
	}

}
