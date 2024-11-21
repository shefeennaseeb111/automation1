package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	public WebDriver driver;
	public void fileupload() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectpdf.click();
		StringSelection select=new StringSelection("C:\\Users\\shefe\\OneDrive\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
		Robot robot=new Robot();
		robot.delay(0);
		robot.keyPress(KeyEvent.VK_CONTROL);//to click control key
		robot.keyPress(KeyEvent.VK_V);		//to click on v
		robot.keyRelease(KeyEvent.VK_CONTROL);//to release control
		robot.keyRelease(KeyEvent.VK_V);	//to release v key
		robot.keyPress(KeyEvent.VK_ENTER);//click on enter
		robot.keyRelease(KeyEvent.VK_ENTER);//to release enter
		
	}
	public void sendKeysexample()	//to check whether the pdf file open using send keys
	
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		//selectpdf.click();
		selectpdf.sendKeys("C:\\Users\\shefe\\OneDrive\\Desktop");
		
		
		
	}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		File_Upload fileupld=new File_Upload();
		//fileupld.fileupload();
		fileupld.sendKeysexample();
		

	}

}
