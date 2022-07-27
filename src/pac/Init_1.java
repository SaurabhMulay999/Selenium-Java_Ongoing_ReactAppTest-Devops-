package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init_1 {
	
	public static WebDriver init()
	{
		System.setProperty("webdriver.chrome.driver","/home/saurabh/Downloads/chromedriver");
		WebDriver d=new ChromeDriver();
		 
		return d;
	}
}
