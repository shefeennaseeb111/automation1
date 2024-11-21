package testscript;

public class Navigation_Commands extends Base {
	public void navigateCommands()
	{
		driver.navigate().to("https://amazon.in/");// obsqura site to amazone page
		driver.navigate().back();   //first obsqura site>amazon>back to obsqura
		driver.navigate().forward();
		//driver.navigate().refresh();//to refresh the page
		
	}

	public static void main(String[] args) {
		Navigation_Commands navigate=new Navigation_Commands();
		navigate.initialize_Browser();
		navigate.navigateCommands();
	}

}
