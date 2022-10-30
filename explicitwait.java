package seleniumimportant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicitwait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();	
          
		  driver.get ("https://www.google.com/");
		  driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	         driver.manage().window().maximize();

			 driver.findElement(By.name("q")).sendKeys("carl"+Keys.ENTER);
}}
