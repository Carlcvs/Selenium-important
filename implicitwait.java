package seleniumimportant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitwait {
	@SuppressWarnings("deprecation")
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	          WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			  driver.get ("https://www.google.com/");
				 driver.findElement(By.name("q")).sendKeys("carl"+Keys.ENTER);
}
}