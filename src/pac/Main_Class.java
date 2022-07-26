package pac;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Class {
	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/home/saurabh/Downloads/chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.close();
		gmail g =new gmail();
		g.runGmail();

	}

}
