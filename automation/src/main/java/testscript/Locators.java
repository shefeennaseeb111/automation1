package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void id_Locator()
	{
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		WebElement value_A=driver.findElement(By.id("value-a"));
		WebElement value_B=driver.findElement(By.id("value-b"));
		WebElement  Showmessage=driver.findElement(By.id("button-one"));
		
		//WebElement elementname=driver.findElement(By.locatorname("locatorname" or "attribute value");
	
	}

	public static void main(String[] args) {
		Locators locator=new Locators();
		locator.initialize_Browser();
		locator.id_Locator();

	}

}
