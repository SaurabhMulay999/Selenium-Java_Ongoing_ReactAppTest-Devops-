package pac;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pp {
	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/home/saurabh/Downloads/chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		
	}

}
