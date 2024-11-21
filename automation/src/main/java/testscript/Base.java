package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialize_Browser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}
	public void quit_Close()
	{
		driver.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base webpage=new Base();
		webpage.initialize_Browser();
		webpage.quit_Close();

	}

}
