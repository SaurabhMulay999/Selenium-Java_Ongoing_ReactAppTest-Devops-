package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void runGmail() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/home/saurabh/Downloads/chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		//your email Address
		d.findElement(By.id("identifierId")).sendKeys("2018bin501@sggs.ac.in");
		d.findElement(By.cssSelector("#identifierNext > div > button")).click();
		//password
		String at=d.getTitle();
		String et="gmail";
		Thread.sleep(10000);
		d.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		
		
		
		
	}
}
